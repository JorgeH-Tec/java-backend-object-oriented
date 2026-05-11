import java.math.BigDecimal;
import java.math.RoundingMode;

public class Stock extends Asset {
    // Constant
    private static final BigDecimal LIMITE_MINIMO = new BigDecimal("-1.00");

    // Attributes
    private BigDecimal percentualValorizacao;

    // Constructor
    public Stock(String nome, BigDecimal valorInicial, BigDecimal percentualValorizacao) {
        super(nome, valorInicial);
        setPercentualValorizacao(percentualValorizacao);
    }

    // Public Methods
    @Override
    public BigDecimal calcularValorAtual() {
        BigDecimal valorAtual;
        valorAtual = getValorInicial().add(getValorInicial().multiply(getPercentualValorizacao()));
        return valorAtual.setScale(2, RoundingMode.HALF_UP);
    }

    // Getters and Setters
    public BigDecimal getPercentualValorizacao() {
        return percentualValorizacao;
    }

    private void setPercentualValorizacao(BigDecimal percentualValorizacao) {
        validarBigDecimal(percentualValorizacao, LIMITE_MINIMO, "ERRO! O percentual deve ser maior ou igual a no mínimo -1.00");
        this.percentualValorizacao = percentualValorizacao;
    }
}
