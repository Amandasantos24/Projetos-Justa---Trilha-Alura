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

    }
}
