package exercicio03;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        ArrayList<produtos> estoque = new ArrayList<>();
        boolean MaisCadastro = true;
        while(MaisCadastro){
            estoque.add(lerproduto());
            System.out.println("Deseja adicionar mais um produto ao estoque? Y/N");
            char resp = sc.next().charAt(0);
            if(resp=='N'||resp=='n'){
                MaisCadastro = false;
            }
        }
        double ValEstoque=0;
        for(produtos x : estoque){
            System.out.println(x.nome + " - R$ " + x.valor + " - Estoque: " + x.quantidade);
            ValEstoque += x.quantidade*x.valor;
        }
        System.out.println("Produtos no Estoque: " + estoque.size());
        System.out.printf("Valor total do estoque: R$ " + "%.2f%n", ValEstoque);
    }
    static produtos lerproduto(){
        produtos x = new produtos();
        sc.nextLine();
        x.nome = sc.nextLine();
        x.valor = sc.nextDouble();
        x.quantidade = sc.nextInt();
        return x;
    }
}
class produtos{
    String nome;
    double valor;
    int quantidade;
}
