public class Conta {
   double saldo;
   int agencia =42;
   int numero;
   String titular;

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
}

