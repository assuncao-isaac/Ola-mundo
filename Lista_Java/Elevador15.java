package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Elevador15 {
    int andares = 5;
    public Elevador15(int andares){
        if (andares > 5 || andares < 0) System.out.println("Andar inválido");
        else{ this.andares = andares;
            System.out.println("Você chegou ao andar "+ andares+"*");}
    }

    public static void main(String[] args) {
        System.out.println("para qual andar você quer ir? ");
        Elevador15 elevador15 = new Elevador15(6);

    }
}
