import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Investor {
    // Attributes
    private String name;
    private final List<Asset> portfolio = new ArrayList<>();

    // Constructor
    public Investor(String name) {
        setName(name);
    }

    // public Methods
    public void addAsset(Asset asset) {
        portfolio.add(asset);
    }

    public void showGeneralReport() {
        if (portfolio.isEmpty()) {
            System.out.println("Seu portifolio está vazio no momento.");
            return;
        }
        for (Asset asset : portfolio) {
            asset.showReport();
        }
        System.out.println("VALOR TOTAL: " + calculateTotalEquity());
    }

    public BigDecimal calculateTotalEquity() {
        BigDecimal total = BigDecimal.ZERO;

        for (Asset asset : portfolio) {
            total = total.add(asset.calculateCurrentValue());
        }

        return total.setScale(2, RoundingMode.HALF_UP);
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Erro, o nome não pode ser vazio nem nulo.");
        }
        this.name = name;
    }

    public List<Asset> getPortfolio() {
        return portfolio;
    }
}
