package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Musica19 {
    ArrayList<String> nome = new ArrayList<>();
    ArrayList<Integer> duracao = new ArrayList<>();

    public void cadastoDeMusicas(String nome, int duracao){
        this.nome.add(nome);
        this.duracao.add(duracao);
    }
    public int tempoTotal(){
        int duracaoTotal = 0;
        for (Integer integer : duracao) {
            duracaoTotal += integer;
        }
        return duracaoTotal;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Musica19 musica19 = new Musica19();
        String nome; int minutos, segundos, duracao;
        System.out.println("quantas musicas para cadastrar? ");
        int quantidade = scanner.nextInt();
        for (int i = 0; i < quantidade; i++) {
            scanner.nextLine();
            System.out.println("-----------"+i+1+"-----------");
            System.out.println("nome:");
            nome = scanner.nextLine();
            System.out.println("quantos minutos a música tem?");
            minutos = scanner.nextInt();
            System.out.println("quantos segundos a música tem?");
            segundos = scanner.nextInt();

            duracao = (minutos * 60) + segundos;
            musica19.cadastoDeMusicas(nome,duracao);
            System.out.println("tempo total das musicas: "+musica19.tempoTotal()/60+"."+musica19.tempoTotal()%60);
        }


    }
}
