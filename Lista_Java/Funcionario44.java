package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Funcionario44 {
    String nome;
    double salario;
    double bonus;
    double valorTotal;

    public Funcionario44(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularBonus(){
        return salario + bonus;
    }


    public static void main(String[] args) {
        Funcionario44 funcionario1 = new Gerente44("joao", 10000);
        System.out.println(funcionario1.nome+" "+funcionario1.salario);
        funcionario1.valorTotal = funcionario1.calcularBonus();
        System.out.println("total com bonus: "+ funcionario1.valorTotal);
        Funcionario44 funcionario2 = new Vendedor44("chico", 4000);
        System.out.println(funcionario2.nome+" "+funcionario2.salario);
        funcionario2.valorTotal = funcionario2.calcularBonus();
        System.out.println("total com bonus: "+ funcionario2.valorTotal);
    }
}
class Gerente44 extends Funcionario44 {
    public Gerente44(String nome, double salario) {
        super(nome, salario);
        bonus = 1000;
    }
}
class Vendedor44 extends Funcionario44 {
    public Vendedor44(String nome, double salario) {
        super(nome, salario);
        bonus = 2000;
    }
}
