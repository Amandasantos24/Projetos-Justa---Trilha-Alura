public class TestaGetESet {

    public static void main(String[] args) {
        Conta conta = new Conta(1414, 6565);
        //não preciso mais chamar o set pq temos o construtor
        //conta.setNumero(123545);
        System.out.println(conta.getNumero());

        Cliente amanda = new Cliente();
        amanda.setNome("amanda santos");

        conta.setTitular(amanda);
        //primeiro foi na classe conta pegar o get titular
        //depois foi na classe cliente pegar o get nome
        System.out.println(conta.getTitular().getNome());


        //pega o titular da conta e muda a profissão dele
        conta.getTitular().setProfissao("programadora");
        System.out.println(conta.getTitular().getProfissao());

    }
}
