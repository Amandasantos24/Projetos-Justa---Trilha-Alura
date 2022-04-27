public class Conta {
    //atributos privados não podem ser modificados nem lidos se n for na propria classe
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    //static quer dizer que é um atributo da classe
    private static int total;

    //construtor padrão
    public Conta(int agencia, int numero){
        Conta.total++;
        System.out.println("o total de contas é: " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("estou crindo uma conta " + this.numero);

        //System.out.println("estou criando uma conta ");
    }

    //metodo 1
    public void deposita(double valor) {
        this.saldo += valor;
    }

    //metodo 2
    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    //metodo 3

    public boolean transfere(double valor, Conta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;

    }

    //criando metodo para poder mexer no atributo saldo que agora é private
    //encapsulando o tributo como privado
    public double getSaldo() {
        return this.saldo;
    }


    //get - pega a informação
    //set - altera a informação que veio do get


    public int getNumero() {
        return this.numero;
    }

    //geralmente metodos que alteram atributos e n devolvem são void
    public void setNumero(int novoNumero) {
        if(numero <= 0){
            System.out.println("não pode numero menor ou igual a 0");
            return;
        }
        this.numero = novoNumero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("não pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {

        this.titular = titular;
    }

    public Cliente getTitular() {

        return titular;
    }

    //quando o usa o static não precisa usar o this
    public static int getTotal() {
        System.out.println(this.saldo);
        return Conta.total;

    }
}
