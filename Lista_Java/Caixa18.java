package ListaJava;

public class Caixa18 {
    private int comprimento;
    private int largura;
    private int altura;

    public void adicionarDados(int altura, int comprimento, int largura){
        this.altura = altura;
        this.comprimento = comprimento;
        this.largura = largura;
    }
    public int volume(){
        return comprimento*altura*largura;
    }
    public static void main(String[] args) {
        Caixa18 caixa18 = new Caixa18();
        caixa18.adicionarDados(18, 25, 28);
        System.out.println(caixa18.volume());
    }
}
