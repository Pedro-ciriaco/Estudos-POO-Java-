package exercicio05;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static public void main(String[] args){
        ArrayList<jogador> time = new ArrayList<>();
/*      for(int i=0;i<5;i++){
            time.add(lerJogador());
        } */
        time.add(new jogador("Messi", "Ponta",39,93));
        time.add(new jogador("Neymar", "Ponta",34,92));
        time.add(new jogador("Cristiano Ronaldo", "Atacante",40,92));
        time.add(new jogador("Pele", "Meia",80,95));
        time.add(new jogador("Lamine Yamal", "Ponta",19,89));
        for(jogador x : time){
            x.mostrarJogador();
            if(x.ehlenda()){
                System.out.println("É lenda");
            }
        }
    }
/*  static jogador lerJogador(){
        jogador x = new jogador();
        sc.nextLine();
        x.nome = sc.nextLine();
        x.idade = sc.nextInt();sc.nextLine();
        x.posic = sc.nextLine();
        x.overall = sc.nextInt();
        return x;
    } */
}
class jogador{
    String nome, posic;
    int idade, overall;
    
    jogador(){}
    jogador(String nome, String posic, int idade, int overall){
        this.nome = nome;
        this.posic = posic;
        this.idade = idade;
        this.overall = overall;
    }
    
    void mostrarJogador(){
        System.out.println(nome+", " + idade + " anos.\n" + posic + "de " + overall + " de média.");
    }
    
    boolean ehlenda(){
        if(overall>=90){
            return true;
        }
        return false;
    }
}
