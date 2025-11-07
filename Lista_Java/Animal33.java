package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Animal33 {
    String nome;
    String som;

    public Animal33(String nome, String som) {
        this.nome = nome;
        this.som = som;
    }

    public void falar(){
        System.out.println(nome+ " faz "+som);
    }

    public static void main(String[] args) {
        Animal33 animal2 = new Cachorro33("Cachorro", "AU AU");
        Animal33 animal1 = new Gato33("Gato", "Miau Miau");
        animal1.falar();
        animal2.falar();
    }

}
class Cachorro33 extends Animal33{

    public Cachorro33(String nome, String som) {
        super(nome, som);
    }
}
class Gato33 extends Animal33{
    public Gato33(String nome, String som) {
        super(nome, som);
    }
}