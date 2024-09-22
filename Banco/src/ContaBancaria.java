public class ContaBancaria {
    public int numConta;
    public double saldo;
    
    public ContaBancaria(double saldoInicial, int numConta){
        this.saldo = saldoInicial;
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito deve ser positivo.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
            return false;
        }
    }


    @Override
    public String toString(){
        return "-------------------------\n"+"Conta: "+this.numConta+"\n"+"Salto: "+this.saldo;
    }
}
