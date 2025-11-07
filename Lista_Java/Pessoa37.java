package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Pessoa37 {
    String nome;
    int idade;

    public Pessoa37(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa: "+nome+" de "+idade+ "anos";
    }

    public static void main(String[] args) {
        Ciclano37 pessoacpf1 = new Ciclano37("joao", 19, "000.456.863-79");
        System.out.println(pessoacpf1);
        Fulano37 pessoarg1 = new Fulano37("Fernando", 25, "3.123.841");
        System.out.println(pessoarg1);
    }
}
class Ciclano37 extends Pessoa32{
    String cpf;
    public Ciclano37(String nome, int idade, String cpf) {
        super(nome, idade);
        this.cpf = cpf;
    }
    @Override
    public String toString() {
        return "Pessoa: "+nome+" de "+idade+ " anos CPF:"+ cpf;
    }
}
class Fulano37 extends Pessoa32{
    String rg;
    public Fulano37(String nome, int idade, String rg) {
        super(nome, idade);
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "Pessoa: "+nome+" de "+idade+ " anos RG:"+ rg;
    }
}
