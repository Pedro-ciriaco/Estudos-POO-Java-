package exercicio08;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static public void main(String[] args){
        ArrayList<funcionario> funcionarios = new ArrayList<>(Array.asList(
            new gerente("Jessica", 25000),
            new desenvolvedor("Pedro", 20000),
            new estagiario("Jasmin", 1200)
        ));
        for(funcionario x : funcionarios){
            x.calculaSalario();
        }
    }
}

class funcionario{
    private String nome;
    private double salario;

    funcionario(String nome, double salario){
        this.nome=nome;
        this.salario=salario;
    }

    public double getSalario(){
        return salario;
    }
    public void calculaSalario(){
        System.out.printf("Salario: R$ %.2f%n", salario);
    }
    public void mostrarFuncionario(){
        System.out.println(nome+":");
    }
}
class gerente extends funcionario{
    gerente(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public void calculaSalario(){
        double salario = getSalario()*1.2;
        mostrarFuncionario();
        System.out.printf("Salario: R$ %.2f%n", salario);
    }
}
class desenvolvedor extends funcionario{
    double bonus = 2000;

    desenvolvedor(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public void calculaSalario(){
        double salario = getSalario()+bonus;
        mostrarFuncionario();
        System.out.printf("Salario: R$ %.2f%n", salario);
    }
}
class estagiario extends funcionario{
    estagiario(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public void calculaSalario(){
        double salario = getSalario();
        mostrarFuncionario();
        System.out.printf("Salario: R$ %.2f%n", salario);
    }
}