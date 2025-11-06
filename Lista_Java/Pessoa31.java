package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Pessoa31 {
    String nome;
    int idade;

    public Pessoa31(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
class Aluno extends Pessoa31 {
    String matricula;
    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }
}
class Professor extends Pessoa31 {
    String contrato;
    public Professor(String nome, int idade, String contrato) {
        super(nome, idade);
        this.contrato = contrato;
    }
}