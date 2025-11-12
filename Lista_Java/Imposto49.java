package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Imposto49 {
    double imposto, rendaMensal, deducoes, aliquota;

    public Imposto49(double rendaMensal) {
        this.rendaMensal = rendaMensal;
    }
    public double calculo(){
        return imposto = (rendaMensal - deducoes) * aliquota;
    }

    public static void main(String[] args) {
        Imposto49 imposto1 = new PessoaF49(3000.00);
        System.out.println(imposto1.calculo());
        Imposto49 imposto2 = new PessoaJ49(3000.00);
        System.out.println(imposto2.calculo());
    }
}
class PessoaF49 extends Imposto49 {
    public PessoaF49(double imposto) {
        super(imposto);
        aliquota = 0.15;
        deducoes = 1000;
    }
}
class PessoaJ49 extends Imposto49 {
    public PessoaJ49(double imposto) {
        super(imposto);
        aliquota = 0.10;
        deducoes = 0;
    }
}
