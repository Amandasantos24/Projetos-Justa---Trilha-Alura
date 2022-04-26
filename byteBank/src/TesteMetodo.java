public class TesteMetodo {
    public static void main(String[] args) {
        //Conta = classe - contaDaAmanda = variável
        //toda vez que chamar método tem que chamar com ()
        Conta contaDaAmanda = new Conta();
        contaDaAmanda.saldo = 100;
        //metodo deposita
        contaDaAmanda.deposita(50);
        //somou o deposito com o saldo
        System.out.println(contaDaAmanda.saldo);

        //metodo saca
        boolean conseguiuRetirar = contaDaAmanda.saca(20);
        //debitou o valor do saldo
        System.out.println("o novo saldo é: " + contaDaAmanda.saldo);
        //verifcou que conseguiu retirar
        System.out.println(conseguiuRetirar);


        //metodo transfere
        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);

        if (contaDaMarcela.transfere(3000, contaDaAmanda)){
            System.out.println("transferencia concluida com sucesso");
        } else {
            //tentou debitar 3000 mas o saldo era inferior portanto passou para o else
            System.out.println("faltou dinheiro");
        }
        //saldo não mudou de marcela
        System.out.println(contaDaMarcela.saldo);
        //saldo de amanda debitado de 20
        System.out.println(contaDaAmanda.saldo);


    }

}


