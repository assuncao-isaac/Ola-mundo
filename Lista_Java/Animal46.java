package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Animal46 {
    public void emitirSom() {
        System.out.println("som do animal");
    }
    public static void main(String[] args) {
        Gato46 a = new Gato46();
        Pato46 b = new Pato46();
        Vaca46 c = new Vaca46();
        a.emitirSom();
        b.emitirSom();
        c.emitirSom();
    }
}
class Gato46 extends Animal46 {
    @Override
    public void emitirSom(){
        System.out.println("miau");
    }
}
class Pato46 extends Animal46 {
    @Override
    public void emitirSom(){
        System.out.println("quac");
    }
}
class Vaca46 extends Animal46 {
    @Override
    public void emitirSom(){
        System.out.println("muuuuu");
    }
}
