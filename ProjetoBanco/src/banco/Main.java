package banco;

public class Main {
    public static void main(String[] args) {
        // Singleton para criar o banco
        BancoSingleton banco = BancoSingleton.getInstancia("Warner Melo");
        
        // Exibindo o nome do banco para usar a variável 'banco'
        System.out.println("Banco: " + banco.getNomeBanco());

        // Usando o facade para operações bancárias
        BancoFacade bancoFacade = new BancoFacade();
        
        // Realizando depósitos e saques para saldo final mais alto
        bancoFacade.depositarCorrente(1000);    // Depósito inicial na conta corrente
        bancoFacade.depositarPoupanca(2000);    // Depósito inicial na conta poupança
        
        bancoFacade.depositarCorrente(1500);    // Segundo depósito na conta corrente
        bancoFacade.depositarPoupanca(1000);    // Segundo depósito na conta poupança
        
        bancoFacade.sacarCorrente(500);         // Saque na conta corrente
        bancoFacade.sacarPoupanca(300);         // Saque na conta poupança
        
        // Exibindo os saldos finais
        System.out.println("Saldo conta corrente: " + bancoFacade.getSaldoCorrente());
        System.out.println("Saldo conta poupança: " + bancoFacade.getSaldoPoupanca());
    }
}
