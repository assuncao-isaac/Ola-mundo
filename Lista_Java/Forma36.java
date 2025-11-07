package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Forma36 {
    String nome;
    String cor;

    public Forma36(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public static void main(String[] args) {
        Circulo36 forma1 = new Circulo36("Circulo","azul",5);
        System.out.println(forma1.area());
        Quadrado36 forma2 = new Quadrado36("Quadrado","azul",5);
        System.out.println(forma2.area());
    }
}

class Circulo36 extends Forma36{
    double pi = 3.14;
    double raio;
    public Circulo36(String nome, String cor, double raio) {
        super(nome, cor);
        this.raio = raio;
    }
    public double area(){
        return pi*(raio*raio);
    }
}

class Quadrado36 extends Forma36{
    double lado;
    public Quadrado36(String nome, String cor, double lado) {
        super(nome, cor);
        this.lado = lado;
    }
    public double area(){
        return lado*lado;
    }
}
