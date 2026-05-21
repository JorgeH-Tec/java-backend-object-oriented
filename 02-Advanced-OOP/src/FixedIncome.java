import java.math.BigDecimal;
import java.math.RoundingMode;

public final class FixedIncome extends Asset {
    // Attributes
    private BigDecimal annualTax;

    // Constructor
    public FixedIncome(String name, BigDecimal initialValue, BigDecimal annualTax) {
        super(name, initialValue);
        setAnnualTax(annualTax);
    }

    // Public Methods
    @Override
    public BigDecimal calculateCurrentValue() {
        BigDecimal actualValue;
        actualValue = getInitialValue().multiply(BigDecimal.ONE.add(annualTax));
        return actualValue.setScale(2, RoundingMode.HALF_UP);
    }

    // Getters and Setters
    public BigDecimal getAnnualTax() {
        return annualTax;
    }

    private void setAnnualTax(BigDecimal annualTax) {
        validateBigDecimal(annualTax, BigDecimal.ZERO, "Erro! a taxa anual não pode ser menor que 0.");
        this.annualTax = annualTax;
    }
}
