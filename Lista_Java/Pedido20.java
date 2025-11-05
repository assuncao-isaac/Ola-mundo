package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Pedido20 {
    ArrayList<String> nome = new ArrayList<>();
    ArrayList<Double> preco = new ArrayList<>();

    public void cadastroDoPedido(String nome, double preco){
        this.nome.add(nome);
        this.preco.add(preco);
    }
    public double valorTotal(){
        double valorTotaaal = 0;
        for (Double aDouble : preco) valorTotaaal += aDouble;
        return valorTotaaal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pedido20 pedido20 = new Pedido20();
        String nome; double preco;
        System.out.println("quantos produtos ? ");
        int quantidade = scanner.nextInt();
        for (int i = 0; i < quantidade; i++) {
            scanner.nextLine();
            System.out.println("-----------"+(i+1)+"-----------");
            System.out.println("nome:");
            nome = scanner.nextLine();
            System.out.println("qual o preço?");
            preco = scanner.nextDouble();
            pedido20.cadastroDoPedido(nome, preco);
        }
        System.out.println("Valor total: ");
        System.out.println(pedido20.valorTotal());



    }
}
