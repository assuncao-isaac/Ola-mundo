package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Informacao29 {
    String nome ;
    String ano ;
    String cor ;
    String combustivel ;
    String cambio;
    String carroceria ;

    public Informacao29(String nome, String ano, String cor, String combustivel, String cambio, String carroceria) {
        this.nome = nome;
        this.ano = ano;
        this.cor = cor;
        this.combustivel = combustivel;
        this.cambio = cambio;
        this.carroceria = carroceria;
    }

    public void mostrarInformacoes(String nome, String ano, String cor){
        System.out.println("========================================");
        System.out.println("INFORMAÇÕES BASICAS:");
        System.out.println(nome);
        System.out.println(ano);
        System.out.println(cor);
        System.out.println("========================================");
    }
    public void mostrarInformacoes(String nome, String ano,String cor,String combustivel, String cambio, String carroceria){
        System.out.println("========================================");
        System.out.println("INFORMAÇÕES COMPLETAS:");
        System.out.println(nome);
        System.out.println(ano);
        System.out.println(cor);
        System.out.println(combustivel);
        System.out.println(cambio);
        System.out.println(carroceria);
        System.out.println("========================================");
    }
    public static void main(String[] args) {
        Informacao29 informacao29 = new Informacao29("astra", "2000", "azul", "gasolina","manual",  "Hatchback" );
         informacao29.mostrarInformacoes("astra", "2000", "azul");
        informacao29.mostrarInformacoes("astra", "2000", "azul", "gasolina","manual",  "Hatchback" );

    }
}
