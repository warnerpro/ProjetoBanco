package banco;

public class ContaCorrenteFactory implements ContaFactory {
    @Override
    public Conta criarConta() {
        return new ContaCorrente();
    }
}
