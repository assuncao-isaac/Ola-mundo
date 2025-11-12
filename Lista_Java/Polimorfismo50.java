package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Polimorfismo50 {
    String nome, sobrenome;
    public Polimorfismo50(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    public void nome(){

    }
    public static void main(String[] args) {
    PessoaN pessoaN = new PessoaN("Cassio", "Silva");
    PessoaE pessoaE = new PessoaE("Cassio", "Silva");
    pessoaE.nome(); pessoaN.nome();
    }
}
class PessoaN extends Polimorfismo50{
    public PessoaN(String nome, String sobrenome) {
        super(nome, sobrenome);
    }
    @Override
    public void nome(){
        System.out.println(nome);
        System.out.println(sobrenome);
    }
}
class PessoaE extends Polimorfismo50{
    public PessoaE(String nome, String sobrenome) {
        super(nome, sobrenome);
    }
    @Override
    public void nome(){
        System.out.println(sobrenome);
        System.out.println(nome);
    }
}
