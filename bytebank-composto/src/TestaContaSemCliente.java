public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta();
        System.out.println(contaDaMarcela.getSaldo());

        //guardando em marcela já o novo cadastro
        contaDaMarcela.titular = new Cliente();
        System.out.println(contaDaMarcela.titular);

        contaDaMarcela.titular.nome = "Marcela";
        //cadastrando o nome para o nome sem chamar nada ai da erro
        System.out.println(contaDaMarcela.titular.nome);


    }
}
