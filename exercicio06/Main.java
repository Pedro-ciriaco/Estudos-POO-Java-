package exercicio06;
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static public void main(String[] args){
        contaBancaria conta1 = new contaBancaria(599422, "Pedro", 1000);
        conta1.depositar(500);
        conta1.sacar(200);
        conta1.sacar(1500);
        conta1.mostrarSaldo();
        conta1.trocaNumero(600000);
        conta1.trocaTitular("Pedrada");
    }
}
class contaBancaria{
    private int numero;
    private String titular;
    private double saldo;
    contaBancaria(int numero, String titular, double saldo){
        this.numero=numero;
        this.titular=titular;
        this.saldo=saldo;
    }
    public void depositar(double valor){
        if(valor>=0){
            saldo+=valor;
        }else{
            System.out.println("Valor inválido.");
        }
    }
    public void sacar(double valor){
        if(valor>=0 && valor<=saldo){
            saldo-=valor;
        }else{
            System.out.println("Valor inválido.");
        }
    }
    public void mostrarSaldo(){
        System.out.printf("Saldo R$: " + "%.2f%n", saldo);
    }
    public double getSaldo(){
        return saldo;
    }
    public void trocaNumero(int novoNumero){
        numero = novoNumero;
    }
    public void trocaTitular(String novoTitular){
        titular = novoTitular;
    }
}
