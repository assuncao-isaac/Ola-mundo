package ListaJava;

public class Polimorfismo40 {
    public void mostrarDados(){
        System.out.println("Bom dia amigos");
    }

    public static void main(String[] args) {
        Polimorfismo40 a = new Polimorfismo40();
        Tarde40 b = new Tarde40();
        Noite40 c = new Noite40();
        a.mostrarDados();
        b.mostrarDados();
        c.mostrarDados();
    }
}
class Tarde40 extends Polimorfismo40{
    @Override
    public void mostrarDados(){
        System.out.println("Boa tarde amigos");
    }
}
class Noite40 extends Polimorfismo40{
    @Override
    public void mostrarDados(){
        System.out.println("Boa tarde amigos");
    }
}
