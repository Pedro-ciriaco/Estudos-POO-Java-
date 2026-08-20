package exercicio09;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        pagamento p1 = new pagamentoPix();
        pagamento p2 = new pagamentoCartao();
        pagamento p3 = new pagamentoBoleto();

        Carteira<pagamento> carteira = new Carteira<>(500);
        carteira.adicionar(p1);
        carteira.adicionar(p2);
        carteira.adicionar(p3);

        for(int i=0;i<carteira.size();i++){
            try{
                carteira.pagar(i, 100);
            }
            catch(saldoInsuficienteException e){
                System.out.println(e.getMessage());
            }
        }
        try{
            carteira.pagar(0, 200);
        }
        catch(saldoInsuficienteException e){
            System.out.println(e.getMessage());
        }
    }
}
interface pagamento{
    double pagar(double valor);
}
class pagamentoPix implements pagamento{
    public double pagar(double valor){
        double total = valor;
        return total;
    }
}
class pagamentoCartao implements pagamento{
    public double pagar(double valor){
        double total = valor*1.03;
        return total;
    }
}
class pagamentoBoleto implements pagamento{
    public double pagar(double valor){
        double total = valor*1.01;
        return total;
    }
}

class Carteira<T extends pagamento>{
    private double saldo;

    private ArrayList<T> pagamentos;

    public Carteira(double saldo){
        this.saldo=saldo;
        pagamentos = new ArrayList<>();
    }

    public void adicionar(T pagamento){
        pagamentos.add(pagamento);
    }

    public void pagar(int indice, double valor) throws saldoInsuficienteException{
        T tipoPagamento = pagamentos.get(indice);
        double total = tipoPagamento.pagar(valor);
        if(total > saldo){
            throw new saldoInsuficienteException("Saldo insuficiente!");
        }
        saldo-= total;
        System.out.printf("Pagamento no valor de R$ %.2f efetuado!%n", total);
    }

    public int size(){
        return pagamentos.size();
    }
}

class saldoInsuficienteException extends Exception{
    public saldoInsuficienteException(String mensagem){
        super(mensagem);
    }
}
