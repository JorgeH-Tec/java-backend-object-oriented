import java.math.BigDecimal;
import java.math.RoundingMode;

public final class FixedIncome extends Asset {
    // Attributes
    private BigDecimal taxaAnual;

    // Constructor
    public FixedIncome(String nome, BigDecimal valorInicial, BigDecimal taxaAnual) {
        super(nome, valorInicial);
        setTaxaAnual(taxaAnual);
    }

    // Public Methods
    @Override
    public BigDecimal calcularValorAtual() {
        BigDecimal valorAtual;
        valorAtual = getValorInicial().multiply(BigDecimal.ONE.add(taxaAnual));
        return valorAtual.setScale(2, RoundingMode.HALF_UP);
    }

    // Getters and Setters
    public BigDecimal getTaxaAnual() {
        return taxaAnual;
    }

    private void setTaxaAnual(BigDecimal taxaAnual) {
        validarBigDecimal(taxaAnual, BigDecimal.ZERO, "Erro! a taxa anual não pode ser menor que 0.");
        this.taxaAnual = taxaAnual;
    }
}
