package ListaJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Aluno16 {
    ArrayList<Double> notas = new ArrayList<>();

    public double media( ArrayList<Double> notas){
        double media = 0;
        for (Double nota : notas) {
            media = nota + media;
        }
        media /= notas.size();
        return media;
    }


    public static void main(String[] args) {
        Scanner atv = new Scanner(System.in);
        Aluno16 aluno16 = new Aluno16();
        double confirmacao = 0;
        do {
            for (int i = 0; i < 3; i++) {
                confirmacao = atv.nextDouble();
                if (confirmacao > 10 || confirmacao < 0) {
                    System.out.println("numero invalido");
                    break;
                }  else aluno16.notas.add(confirmacao);
            }
        }while (confirmacao > 10 || confirmacao < 0);


        System.out.println(aluno16.media(aluno16.notas));
    }
}
