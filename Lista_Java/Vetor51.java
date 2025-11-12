package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Vetor51 {
    double[] notas = new double[]{1,2,3,6,4};
    public static void main(String[] args) {
        double media = 0;
        Vetor51 v = new Vetor51();
        for (int i = 0; i < v.notas.length; i++) {
            media += v.notas[i];
        }
        System.out.println(media);
    }
}

