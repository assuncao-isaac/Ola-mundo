package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Matriz59 {
    public static void main(String[] args) {
        String[] nomes = new String[]{"joao", "fabio", "bernado", "carlos", "joaozinho"};
        boolean presente = false; String procura = "fabio";
        for (String nome : nomes) {
            if (nome.equals(procura)) {
                presente = true;
                break;
            }
        }
        System.out.println(presente);
    }
}
