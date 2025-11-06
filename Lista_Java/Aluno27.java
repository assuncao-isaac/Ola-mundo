package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Aluno27 {

    double media;
    String nome;


    public Aluno27(String nome, double media){
        this.nome = nome;
        this.media = media;
    }
    public Aluno27(){

    }
    public double calcularMediaEntreAlunos(ArrayList<Aluno27> alunos){
        double mediaTurma = 0;
        for (Aluno27 a : alunos) {
            mediaTurma += a.media;
        }

        mediaTurma /= alunos.size();
        return  mediaTurma;

    }
    public double calcularMedia2Notas(double somaDeNotas){

        return  somaDeNotas / 2;
    }
    public double calcularMedia3Notas(double somaDeNotas){

    return  somaDeNotas / 3;
    }
    public double calcularMedia4Notas(double somaDeNotas){

        return  somaDeNotas / 4;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Aluno27> alunos = new ArrayList<>();
        Aluno27 aluno27 = new Aluno27();

        System.out.println("número de alunos: ");
        int quantidadeDeAlunos = scanner.nextInt();


        for (int i = 0; i < quantidadeDeAlunos; i++) {
            System.out.println("-------------------");
            scanner.nextLine();
            System.out.println("nome do "+(i+1)+"* aluno");
            String nomes = scanner.nextLine();
            System.out.println("Quantas notas vão ser inseridas? ");
            int quantidadeDeNotas = scanner.nextInt();
            double notas, somaNotas = 0;
                for (int j = 0; j < quantidadeDeNotas; j++) {
                    System.out.println((j+1)+"* nota do aluno "+ nomes);
                    do {
                        notas = scanner.nextDouble();
                        if (notas > 10 || notas < 0) System.out.println("nota invalida");
                    }while (notas > 10 || notas < 0);
                    somaNotas = notas  + somaNotas;
                }
            double media;
                if (quantidadeDeNotas == 2 ) media = aluno27.calcularMedia2Notas(somaNotas);
                else if (quantidadeDeNotas == 3) media = aluno27.calcularMedia3Notas(somaNotas);
                else media = aluno27.calcularMedia4Notas(somaNotas);

            alunos.add(new Aluno27(nomes,media));
        }


        System.out.println("a média entre os alunos é " + aluno27.calcularMediaEntreAlunos(alunos));




    }
}
