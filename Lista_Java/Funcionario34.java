package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Funcionario34 {
    String nome;
    double salario;

    public Funcionario34(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public static void main(String[] args) {
        Funcionario34 funcionario1 = new Gerente34("joao", 4000);
        System.out.println(funcionario1.nome+" "+funcionario1.salario);
        Funcionario34 funcionario2 = new Estagiario34("joao", 4000);
        System.out.println(funcionario2.nome+" "+funcionario2.salario);
    }
}
class Gerente34 extends Funcionario34 {

    public Gerente34(String nome, double salario) {
        super(nome, salario);
    }
}
class Estagiario34 extends Funcionario34{

    public Estagiario34(String nome, double salario) {
        super(nome, salario);
    }
}
