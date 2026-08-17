package exercicio02;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int[] numbs = new int[10];
            for(int i=0;i<numbs.length;i++){
                numbs[i] = sc.nextInt();
            }
            int maior=0, menor=0, contpar=0, contimp=0, soma=0;
            for(int i=0;i<numbs.length;i++){
                if(numbs[i]>numbs[maior]){
                    maior=i;
                }
                if(numbs[i]<numbs[menor]){
                    menor=i;
                }
                if(numbs[i]%2==0){
                    contpar++;
                }else{
                    contimp++;
                }
                soma+=numbs[i];
            }
            //for(int x : numbs){
            // soma+=x;
            //}
            double media = (double)soma/numbs.length;
            System.out.println(numbs[maior] + " " + numbs[menor] + " " + media + " " + contpar + " " + contimp);
            sc.close();
    }    
}
