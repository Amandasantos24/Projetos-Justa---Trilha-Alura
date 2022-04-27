public class Conta {
    //atributos privados não podem ser modificados nem lidos se n for na propria classe
    private double saldo;
    int agencia;
    int numero;
    Cliente titular;

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
}
