package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Matriz57 {
    public static void main(String[] args) {
        double[][] notas = {{8.0, 7.5, 9.0}, {6.0, 5.5, 7.0}, {10.0, 9.5, 8.5}};
        for (int i = 0; i <notas.length ; i++) {
            double media = 0;
            for (int j = 0; j < notas.length ; j++) {
                media += notas[i][j];
            }
            media /= notas.length;
            System.out.printf("A media do %s aluno é %s \n", i, media);
        }

    }
}
