package ListaJava;

public class Funcionario39 {
    String nome, cpf;
    double salario;

    public Funcionario39(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}
class Programador39 extends Funcionario39{
    public Programador39(String nome, String cpf) {
        super(nome, cpf);
        this.salario = 6000;
    }
}
class Designer39 extends Funcionario39{
    public Designer39(String nome, String cpf) {
        super(nome, cpf);
        this.salario = 3000;
    }
}
