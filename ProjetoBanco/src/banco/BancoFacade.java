package banco;

public class BancoFacade {
    private Conta corrente;
    private Conta poupanca;

    public BancoFacade() {
        ContaFactory factoryCorrente = new ContaCorrenteFactory();
        ContaFactory factoryPoupanca = new ContaPoupancaFactory();

        corrente = factoryCorrente.criarConta();
        poupanca = factoryPoupanca.criarConta();
    }

    public void depositarCorrente(double valor) {
        corrente.depositar(valor);
    }

    public void depositarPoupanca(double valor) {
        poupanca.depositar(valor);
    }

    public void sacarCorrente(double valor) {
        corrente.sacar(valor);
    }

    public void sacarPoupanca(double valor) {
        poupanca.sacar(valor);
    }

    public double getSaldoCorrente() {
        return corrente.getSaldo();
    }

    public double getSaldoPoupanca() {
        return poupanca.getSaldo();
    }
}
