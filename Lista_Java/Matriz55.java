package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Matriz55 {
    public static void main(String[] args) {
        int[] num = new int[]{1,2,3,4,5,7,8,9,10};
        int maior = 0; int menor = 0;
        for (int i = 0; i < num.length; i++) {
            if (i ==0){ maior = num[i]; menor = num[i];}
            if (num[i] > maior) maior = num[i];
            if (num[i] > menor) maior = num[i];
        }
        System.out.printf("maior: %s menor: %s", maior, menor);
    }
}
