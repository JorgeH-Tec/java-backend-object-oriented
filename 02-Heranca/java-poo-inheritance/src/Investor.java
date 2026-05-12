import java.util.ArrayList;
import java.util.List;

public class Investor {
    // Attributes
    private String nome;
    private final List<Asset> portfolio = new ArrayList<>();

    // Constructor
    public Investor(String nome) {
        setNome(nome);
    }

    // public Methods
    public void addAsset (Asset asset) {
        portfolio.add(asset);
    }

    public void showGeneralReport() {
        for (Asset asset : portfolio) {
            asset.exibirRelatorio();
        }
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Erro, o nome não pode ser vazio nem nulo.");
        }
        this.nome = nome;
    }

    public List<Asset> getPortfolio() {
        return portfolio;
    }
}
