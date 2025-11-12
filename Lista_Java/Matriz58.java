package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Matriz58 {
    public static void main(String[] args) {
        double[] temp = {25.0, 30.5, 38.0};
        double maior = 0;
        for (int i = 0; i < temp.length; i++) {
            if (i == 0) {maior = temp[i];}
            if (temp[i] > maior) maior = temp[i];
        }
        System.out.println(maior);
    }
}

