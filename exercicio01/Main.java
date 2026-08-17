package exercicio01;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double media = (n1 + n2 + n3)/3;
        String situ;
        if(media >= 7){
            situ = "Aprovado";
        }else if(media >= 5 && media < 7){
            situ = "Recuperação";
        }else{
            situ = "Reprovado";
        }
        System.out.println("O aluno " + nome + " Tem notas " + n1 + ", " + n2 + ", " + n3 + ", então tem média " + media + "  e esta " + situ);
        sc.close();
    }
}
