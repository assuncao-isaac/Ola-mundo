package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Cachorro26 {
    String nome;
    int idade;

    public Cachorro26(String nome) {
        this.nome = nome;
        imprimir(this.nome,idade);
    }

    public Cachorro26(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        imprimir(nome, idade);
    }
    public void imprimir(String nome, int idade){
        System.out.println(nome);
        System.out.println(idade);
    }

    public static void main(String[] args) {
        new Cachorro26("cachorro");
        new Cachorro26("cachorrinho", 25);


    }
}
