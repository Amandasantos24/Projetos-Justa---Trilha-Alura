public class TestaBanco {
    public static void main(String[] args) {
        Cliente amanda = new Cliente();
        amanda.nome = "Amanda Santos";
        amanda.cpf = "112.725.014-00";
        amanda.profissao = "programadora";

        Conta contaDaAmanda = new Conta();
        contaDaAmanda.deposita(100);

        //associa a cliente amanda a contaDaAmanda
        contaDaAmanda.titular = amanda;
        System.out.println(contaDaAmanda.titular.nome);
        System.out.println(contaDaAmanda.titular);
    }
}
