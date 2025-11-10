package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Animal47 {
    String som;

    public void emitirSom(Animal47 animal47) {
        System.out.println(som);
    }
    public static void main(String[] args) {
        Animal47 animal47 = new Animal47();
        Animal47 animal1 = new Gato47();
        Animal47 animal2 = new Pato47();
        Animal47 animal3 = new Vaca47();
        animal47.emitirSom(animal1);
        animal47.emitirSom(animal2);
        animal47.emitirSom(animal3);
    }
}
class Gato47 extends Animal47 {
    public Gato47() {
        som = "miauuuu";
    }
}
class Pato47 extends Animal47 {
    public Pato47() {
        som = "quac";
    }
}

class Vaca47 extends Animal47 {
    public Vaca47() {
        this.som = "muuuu";
    }
}

