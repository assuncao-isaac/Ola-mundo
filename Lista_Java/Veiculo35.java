package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Veiculo35 {
    String nome;
    double distanciaPecorrida;
    double combustivelConsumido;

    public Veiculo35(String nome, double distanciaPecorrida, double combustivelConsumido) {
        this.nome = nome;
        this.distanciaPecorrida = distanciaPecorrida;
        this.combustivelConsumido = combustivelConsumido;
    }
    public double consumoMedio(){
        return distanciaPecorrida/combustivelConsumido;
    }

    public static void main(String[] args) {
        Veiculo35 veiculo1 = new Carro35("Monza", 450,30);
        System.out.println("Consumo médio do "+veiculo1.nome+" é "+ veiculo1.consumoMedio());
        Veiculo35 veiculo2 = new Moto35("Honda",255,20);
        System.out.println("Consumo médio do "+veiculo2.nome+" é "+ veiculo2.consumoMedio());
    }
}
class Carro35 extends Veiculo35{

    public Carro35(String nome, double distanciaPecorrida, double combustivelConsumido) {
        super(nome, distanciaPecorrida, combustivelConsumido);
    }
}
class Moto35 extends Veiculo35{
    public Moto35(String nome, double distanciaPecorrida, double combustivelConsumido) {
        super(nome, distanciaPecorrida, combustivelConsumido);
    }
}

