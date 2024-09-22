public class App {
    public static void main(String[] args) throws Exception {
        Banco banco = new Banco(4);

        ContaBancaria conta1 = new ContaBancaria(1001, 1);
        ContaBancaria conta2 = new ContaBancaria(1002, 2);
        ContaBancaria conta3 = new ContaBancaria(1003, 3);
        ContaBancaria conta4 = new ContaBancaria(1004, 4);
        ContaBancaria conta5 = new ContaBancaria(1005, 5);
        ContaBancaria conta6 = new ContaBancaria(1006, 6);

        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);
        banco.adicionarConta(conta3);
        banco.adicionarConta(conta4);
        banco.adicionarConta(conta5);
        banco.adicionarConta(conta6);
        
        System.out.println("\nSaldos das contas:");
        banco.exibirSaldos();
      
        System.out.println("\nTransferindo R$ 260.0 da conta 1 para conta 3");

        if (banco.transferir(1, 3, 260.0)) {
            System.out.println("Transferência realizada com sucesso.");
        } else {
            System.out.println("Falha na transferência.");
        }
       
        System.out.println("\nSaldos das contas após transferência:");
        banco.exibirSaldos();
       
        System.out.println("\nSaldo total do banco: R$ " + banco.calcularSaldoTotal());
    }
}
