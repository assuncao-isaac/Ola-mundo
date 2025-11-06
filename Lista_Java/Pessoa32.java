package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;


public class Pessoa32 {
    String nome;
    int idade;

    public Pessoa32(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
class Aluno2 extends Pessoa32 {
    String matricula;
    String curso;
    public Aluno2(String nome, int idade, String matricula, String curso) {
        super(nome, idade);
        this.matricula = matricula;
        this.curso = curso;
    }
}
class Professor2 extends Pessoa32 {
    String contrato;
    String disciplina;
    public Professor2(String nome, int idade, String contrato, String disciplina) {
        super(nome, idade);
        this.contrato = contrato;
        this.disciplina = disciplina;
    }
}