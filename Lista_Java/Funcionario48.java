package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Funcionario48 {
    String nome;
    double salario;
    double bonus;
    double valorTotal;
    public Funcionario48(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public double calcularBonus(Funcionario48 funcionario48){
        valorTotal = salario + bonus;
        return valorTotal;
    }
    public static void main(String[] args) {
        Funcionario48 funcionario1 = new Gerente48("joao", 10000);
        System.out.println(funcionario1.nome+" "+funcionario1.salario);
        System.out.println(funcionario1.calcularBonus(funcionario1));
        System.out.println("total com bonus: "+ funcionario1.valorTotal);
        Funcionario48 funcionario2 = new Vendedor48("chico", 4000);
        System.out.println(funcionario2.nome+" "+funcionario2.salario);
        System.out.println(funcionario2.calcularBonus(funcionario2));
        System.out.println("total com bonus: "+ funcionario2.valorTotal);
    }
}
class Gerente48 extends Funcionario48 {
    public Gerente48(String nome, double salario) {
        super(nome, salario);
        bonus = 1000;
    }
}
class Vendedor48 extends Funcionario48 {
    public Vendedor48(String nome, double salario) {
        super(nome, salario);
        bonus = 2000;
    }
}
