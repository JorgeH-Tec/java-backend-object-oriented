import java.math.BigDecimal;
import java.math.RoundingMode;

public class RealEstateFund extends Asset {
    // Attributes
    private int quantityQuotas;
    private BigDecimal dividendByQoutas;

    // Constructor

    public RealEstateFund(String name, BigDecimal initialValue, int quantityQuotas, BigDecimal dividendByQoutas) {
        super(name, initialValue);
        setQuantityQuotas(quantityQuotas);
        setDividendByQoutas(dividendByQoutas);
    }

    // Public Methods
    @Override
    public BigDecimal calculateCurrentValue() {
        BigDecimal actualValue;
        actualValue = getInitialValue().add(BigDecimal.valueOf(getQuantityQuotas()).multiply(getDividendByQoutas()));
        return actualValue.setScale(2, RoundingMode.HALF_UP);
    }

    // Getters and Setters
    public int getQuantityQuotas() {
        return quantityQuotas;
    }

    private void setQuantityQuotas(int quantityQuotas) {
        if (quantityQuotas < 0) {
            throw new IllegalArgumentException("Erro! A quantidade de cotas não pode ser menor que 0.");
        }

        this.quantityQuotas = quantityQuotas;
    }

    public BigDecimal getDividendByQoutas() {
        return dividendByQoutas;
    }

    private void setDividendByQoutas(BigDecimal dividendByQoutas) {
        validateBigDecimal(dividendByQoutas, BigDecimal.ZERO, "Erro! O dividendo por cota não pode ser menor que 0.");
        this.dividendByQoutas = dividendByQoutas;
    }
}
