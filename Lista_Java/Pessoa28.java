package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Pessoa28 {
    String nome;
    String cpf;

    public Pessoa28(String nome) {
        this.nome = nome;
        System.out.println(this.nome);
    }

    public Pessoa28(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        System.out.println(this.nome);
        System.out.println(this.cpf);
    }

    public static void main(String[] args) {
        new Pessoa28("Fulano");
        new Pessoa28("Ciclano", "000.000.001-90");
    }
}
