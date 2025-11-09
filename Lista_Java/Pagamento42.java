package ListaJava;

public class Pagamento42 {
    double valor;
    String formaPagamento;

    public Pagamento42(double valor) {
        this.valor = valor;
    }

    public void processar(){
        System.out.println("Pagamento via "+ formaPagamento+" no valor de: "+ valor);
    }

    public static void main(String[] args) {
        Pix41 pix1 = new Pix41(25);
        Boleto42 boleto1 = new Boleto42(100);
        Cartao42 cartao1 = new Cartao42(2000);
        pix1.processar();
        boleto1.processar();
        cartao1.processar();
    }
}
class Pix42 extends Pagamento42 {
    public Pix42(double valor) {
        super(valor);
        this.formaPagamento = "Pix";
    }
}
class Cartao42 extends Pagamento42 {
    public Cartao42(double valor) {
        super(valor);
        this.formaPagamento = "Cartão";
    }
}
class Boleto42 extends Pagamento42 {
    public Boleto42(double valor) {
        super(valor);
        this.formaPagamento = "Boleto";
    }
}
