package exercicio07;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;


public class Main {
    static public void main(String[] args){
        ArrayList<Time> times = new ArrayList<>(Arrays.asList(
            new Time("Barcelona", 15, 5, 0, 0, 12),
            new Time("Real Madrid", 0, 0, 0, 4, -12),
            new Time("City", 9, 3, 0, 1, 7),
            new Time("Bayer", 6, 2, 0, 2, 4),
            new Time("Arsenal", 3, 1, 1, 3, -2)
        ));
        times.get(2).vitoria(3);
        times.get(1).derrota(-2);
        times.get(3).empate();

        Comparator<Time> comparador = (t1,t2) -> {
            int resultado = Integer.compare(t2.getPontos(), t1.getPontos());
            if(resultado==0){
                resultado = Integer.compare(t2.getVitorias(), t1.getVitorias());
            }
            if(resultado==0){
                resultado = Integer.compare(t2.getSaldo(), t1.getSaldo());
            }

            return resultado;
        };
        Collections.sort(times, comparador);
        for(int i=0;i<5;i++){
            times.get(i).mostrartime(i+1);
        }
    }
}
class Time{
    private String nome;
    private int pontos=0, vitorias=0, empates=0, derrotas=0, saldoDeGols=0;

    Time(String nome){
        this.nome=nome;
    }
    Time(String nome,int pontos,int vitorias,int empates,int derrotas,int saldoDeGols){
        this.nome=nome;
        this.pontos=pontos;
        this.vitorias=vitorias;
        this.empates=empates;
        this.derrotas=derrotas;
        this.saldoDeGols=saldoDeGols;
    }

    public void vitoria(int saldo){
        vitorias++;
        saldoDeGols+=saldo;
        pontos+=3;
    }
    public void empate(){
        empates++;
        pontos+=1;
    }
    public void derrota(int saldo){
        derrotas++;
        saldoDeGols+=saldo;
    }
    public void mostrartime(int posic){
        System.out.printf("%dº %-15s %2d pts%n", posic, nome, pontos);
    }
    public int getPontos(){
        return pontos;
    }
    public int getVitorias(){
        return vitorias;
    }
    public int getSaldo(){
        return saldoDeGols;
    }
}
