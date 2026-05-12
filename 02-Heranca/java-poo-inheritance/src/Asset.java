import java.math.BigDecimal;

public abstract class Asset implements Reportable {
    // Attributes
    private String name;
    private BigDecimal initialValue;

    // Constructor
    public Asset(String name, BigDecimal initialValue) {
        setName(name);
        setInitialValue(initialValue);
    }

    // Public Methods
    public abstract BigDecimal calculateCurrentValue();

    @Override
    public final void showReport() {
        System.out.println("Ativo: " + getName() + "\n Valor Atual: " + calculateCurrentValue());
    }

    // Intern Methods
    protected final void validateBigDecimal(BigDecimal value, BigDecimal limit, String errorMessage) {
        if (value == null) {
            throw new NullPointerException("ERRO INTERNO! valor não pode ser nulo!");
        }
        if (value.compareTo(limit) < 0) {
            throw new IllegalArgumentException(errorMessage);
        }
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Erro! O nome não pode ser nulo nem vazio.");
        }
        this.name = name;
    }

    public BigDecimal getInitialValue() {
        return initialValue;
    }

    private void setInitialValue(BigDecimal initialValue) {
        validateBigDecimal(initialValue, BigDecimal.ZERO, "Erro! O valor inicial não pode ser menor que 0.");
        this.initialValue = initialValue;
    }
}
