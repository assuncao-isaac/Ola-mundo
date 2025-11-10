package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Veiculo45 {
    double velocidade;
    double tempo;
    double aceleracao;

    public Veiculo45(double velocidade, double tempo) {
        this.velocidade = velocidade;
        this.tempo = tempo;
    }

    public static void main(String[] args) {
        Veiculo45 veiculo1 = new Carro45(100, 20);
        veiculo1.acelerar();
        System.out.println(veiculo1.aceleracao);
        Veiculo45 veiculo2 = new Moto45(150, 20);
        veiculo2.acelerar();
        System.out.println(veiculo2.aceleracao);
    }

    public void acelerar(){
        aceleracao = velocidade / tempo;
    }
}
class Carro45 extends  Veiculo45{
    public Carro45(double velocidade, double tempo) {
        super(velocidade, tempo);
    }
}
class Moto45 extends  Veiculo45{
    public Moto45(double velocidade, double tempo) {
        super(velocidade, tempo);
    }
}
