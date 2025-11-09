package ListaJava;

public class Conta38 {
    String titular;
    double saldo;
    double taxa;

    public Conta38(String titular, double saldo, double taxa) {
        this.titular = titular;
        this.saldo = saldo;
        this.taxa = taxa;
    }
}
class ContaCorrente38 extends Conta38{
    public ContaCorrente38(String titular, double saldo, double taxa) {
        super(titular, saldo, taxa);
        taxa = 0.1;
    }
}
class ContaPoupanca38 extends Conta38{
    public ContaPoupanca38(String titular, double saldo, double taxa) {
        super(titular, saldo, taxa);
        taxa = 0.5;
    }
}
