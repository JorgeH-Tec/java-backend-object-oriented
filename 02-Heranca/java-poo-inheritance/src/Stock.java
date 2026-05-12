import java.math.BigDecimal;
import java.math.RoundingMode;

public class Stock extends Asset {
    // Constant
    private static final BigDecimal MINIMAL_LIMIT = new BigDecimal("-1.00");

    // Attributes
    private BigDecimal appreciationPercentage;

    // Constructor
    public Stock(String name, BigDecimal initialValue, BigDecimal appreciationPercentage) {
        super(name, initialValue);
        setAppreciationPercentage(appreciationPercentage);
    }

    // Public Methods
    @Override
    public BigDecimal calculateCurrentValue() {
        BigDecimal actualValue;
        actualValue = getInitialValue().add(getInitialValue().multiply(getAppreciationPercentage()));
        return actualValue.setScale(2, RoundingMode.HALF_UP);
    }

    // Getters and Setters
    public BigDecimal getAppreciationPercentage() {
        return appreciationPercentage;
    }

    private void setAppreciationPercentage(BigDecimal appreciationPercentage) {
        validateBigDecimal(appreciationPercentage, MINIMAL_LIMIT, "ERRO! O percentual deve ser maior ou igual a no mínimo -1.00");
        this.appreciationPercentage = appreciationPercentage;
    }
}
