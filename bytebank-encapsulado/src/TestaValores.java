public class TestaValores {

    public static void main(String[] args) {
        //int total = 0;
        Conta conta = new Conta(44, 55);
        //total++;


        System.out.println(conta.getAgencia());
        System.out.println(conta.getNumero());

        Conta conta2 = new Conta(44, 56);
        System.out.println(Conta.getTotal());

        //conta está inconsistente em relação a regra de negócio
        //conta.setAgencia(-50);
        //conta.setNumero(-30);
    }
}
