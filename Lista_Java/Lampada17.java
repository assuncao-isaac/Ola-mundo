package ListaJava;

import java.util.Scanner;

public class Lampada17 {
    private boolean interruptor;



    public void ligar() {
        this.interruptor = true;
    }
    public void desligar() {
        this.interruptor = false;
    }

    public static void main(String[] args) {
        Lampada17 lampada17 = new Lampada17();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ligar botão?");
        boolean ligXdeslig = scanner.nextBoolean();
        if (ligXdeslig) lampada17.ligar();
        else lampada17.desligar();

        System.out.println("estado da lampada");
        System.out.println(lampada17.interruptor);



    }
}
