package exercicio04;
import java.util.Scanner;
public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String frase = sc.nextLine();
        String[] palavras = frase.split(" ");
        System.out.println("Caracteres: " + frase.length());
        System.out.println("Palavras: " + palavras.length);
        System.out.println("Vogais: " + quantvogais(frase));
        System.out.println("Consoantes: " + quantcons(frase));
        System.out.println("Primeira letra: " + frase.charAt(0));
        System.out.println("Ultima letra: " + frase.charAt(frase.length()-1));
        System.out.println("Letras maiúsculas: " + frase.toUpperCase());
        System.out.println("Letras minúsculas: " + frase.toLowerCase());

    }
    static boolean ehvogal(char x){
        x = Character.toUpperCase(x);
        if(x=='A'||x=='E'||x=='I'||x=='O'||x=='U'){
            return true;
        }
        return false;
    }
    static boolean ehletra(char x){
        x = Character.toUpperCase(x);
        if(x >= 65 && x <= 90){
            return true;
        }
        return false;
    }
    static int quantvogais(String frase){
        int contvog=0;
        for(int i=0;i<frase.length();i++){
            if(ehvogal(frase.charAt(i))){
                contvog++;
            }
        }
        return contvog;
    }
    static int quantcons(String frase){
        int contcons=0;
        for(int i=0;i<frase.length();i++){
            if(!ehvogal(frase.charAt(i)) && ehletra(frase.charAt(i))){
                contcons++;
            }
        }
        return contcons;
    }
}
