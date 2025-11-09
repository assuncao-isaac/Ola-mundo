package ListaJava;

public class Pagamento41 {
    double valor;
    String formaPagamento;

    public Pagamento41(double valor) {
        this.valor = valor;
    }

    public void processar(){}
}
class Pix41 extends Pagamento42 {
    public Pix41(double valor) {
        super(valor);
        this.formaPagamento = "Pix";
    }
}
class Cartao41 extends Pagamento42 {
    public Cartao41(double valor) {
        super(valor);
        this.formaPagamento = "Cartão";
    }
}
class Boleto41 extends Pagamento42 {
    public Boleto41(double valor) {
        super(valor);
        this.formaPagamento = "Boleto";
    }
}
