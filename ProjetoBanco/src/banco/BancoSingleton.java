package banco;

public class BancoSingleton {
    private static BancoSingleton instancia;
    private String nomeBanco;

    // Construtor privado para impedir a criação de múltiplas instâncias
    private BancoSingleton(String nome) {
        this.nomeBanco = nome;
    }

    // Método estático para obter a instância única
    public static BancoSingleton getInstancia(String nome) {
        if (instancia == null) {
            instancia = new BancoSingleton(nome);
        }
        return instancia;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }
}
