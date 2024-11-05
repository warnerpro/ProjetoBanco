package banco;

public class ContaPoupancaFactory implements ContaFactory {
    @Override
    public Conta criarConta() {
        return new ContaPoupanca();
    }
}
