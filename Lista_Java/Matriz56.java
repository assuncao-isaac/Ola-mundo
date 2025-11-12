package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Matriz56 {
    public static void main(String[] args) {
        int[] num = new int[]{2,4,5,1,9};
        int aprovado = 0; int reprovado = 0;
        for (int j : num) {
            if (j > 5) aprovado += 1;
            if (j < 5) reprovado += 1;
        }
        System.out.printf("aprovados: %s reprovados: %s", aprovado, reprovado);
    }
}
