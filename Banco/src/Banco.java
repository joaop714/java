public class Banco {
    public String nome;
    public ContaBancaria[] contas;
    public int totalContas;

    public Banco(String nome, ContaBancaria[] contas){
        this.nome = nome;
        this.contas = contas;
    }

    public void exibirContas(){
        for(ContaBancaria ContaBancaria : contas){
            System.out.println(ContaBancaria);
        }
    }

    public Banco(int capacidade) {
        contas = new ContaBancaria[capacidade];
        totalContas = 0;
    }

    public void adicionarConta(ContaBancaria conta) {
        if (totalContas < contas.length) {
            contas[totalContas] = conta;
            totalContas++;
        } else {
            System.out.println("Não há mais espaço para novas contas.");
        }
    }

    public void exibirSaldos() {
        for (int i = 0; i < totalContas; i++) {
            System.out.println(contas[i]);
        }
    }

    public boolean transferir(int numContaOrigem, int numContaDestino, double valor) {
        ContaBancaria contaOrigem = encontrarConta(numContaOrigem);
        ContaBancaria contaDestino = encontrarConta(numContaDestino);
      
        if (contaOrigem != null && contaDestino != null) {
            if (contaOrigem.sacar(valor)) {
                contaDestino.depositar(valor);
                return true;
            }
        }
        return false;
    } 
      

    public double calcularSaldoTotal() {
        double saldoTotal = 0;
        for (int i = 0; i < totalContas; i++) {
            saldoTotal += contas[i].getSaldo();
        }
        return saldoTotal;
    }

    private ContaBancaria encontrarConta(int numConta) {
        for (int i = 0; i < totalContas; i++) {
            if (contas[i].getNumConta() == numConta) {
                return contas[i];
            }
        }
        System.out.println("Conta não encontrada: " + numConta);
        return null;
    }

   
}
