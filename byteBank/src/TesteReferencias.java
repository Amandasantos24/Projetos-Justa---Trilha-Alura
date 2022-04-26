//para eu poder chamar a CriaConta eu precisei criar um outro arquivo
//de java para poder chamar
public class TesteReferencias {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();

        primeiraConta.saldo = 300;
        System.out.println("saldo da primeira: " + primeiraConta.saldo);


        Conta segundaConta = primeiraConta;

        System.out.println("saldo da segunda conta: " + segundaConta.saldo);

        segundaConta.saldo += 100;
        System.out.println(segundaConta.saldo);

        System.out.println(primeiraConta.saldo);

        segundaConta.agencia = 146;
        System.out.println("agora a segunda conta esta" + "na agencia" + segundaConta.agencia);

        if(primeiraConta == segundaConta) {
            System.out.println("são a mesmissima conta");

        } else {
            System.out.println("contas diferentes");
        }
    }
}
