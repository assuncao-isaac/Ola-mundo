package assuncao.isaac.testejava.assuncao.isaac.testejava.Metodos.ListaJava;

public class Mensagem43 {
    String formaDeEnvio;
    public void enviar(String formaDeEnvio){
        System.out.println("Bom dia está mensagem foi enviada por "+formaDeEnvio);
    }
    public static void main(String[] args) {
     Mensagem43 mensagem1 = new Email(); Mensagem43 mensagem2 = new Sms();
     mensagem1.enviar(mensagem1.formaDeEnvio);
     mensagem2.enviar(mensagem2.formaDeEnvio);
    }
}
class Email extends Mensagem43{
    public Email() {
        this.formaDeEnvio = "Email";
    }
}
class Sms extends  Mensagem43{
    public Sms() {
        this.formaDeEnvio = "SMS";
    }
}
