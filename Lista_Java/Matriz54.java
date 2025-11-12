package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Matriz54 {
    public static void main(String[] args) {
        int[][] a = {{7, 9, 4}, {4, 1, 1}, {1, 2, 3}, {2, 4, 5}};
        int soma = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                soma += a[i][j];
            }
        }
        System.out.println(soma);
    }
}
