import java.math.BigDecimal;
import java.math.RoundingMode;

public class RealEstateFund extends Asset {
    // Attributes
    private int quantidadeCotas;
    private BigDecimal dividendoPorCota;

    // Constructor

    public RealEstateFund(String nome, BigDecimal valorInicial, int quantidadeCotas, BigDecimal dividendoPorCota) {
        super(nome, valorInicial);
        setQuantidadeCotas(quantidadeCotas);
        setDividendoPorCota(dividendoPorCota);
    }

    // Public Methods
    @Override
    public BigDecimal calcularValorAtual() {
        BigDecimal valorAtual;
        valorAtual = getValorInicial().add(BigDecimal.valueOf(getQuantidadeCotas()).multiply(getDividendoPorCota()));
        return valorAtual.setScale(2, RoundingMode.HALF_UP);
    }

    // Getters and Setters
    public int getQuantidadeCotas() {
        return quantidadeCotas;
    }

    private void setQuantidadeCotas(int quantidadeCotas) {
        if (quantidadeCotas < 0) {
            throw new IllegalArgumentException("Erro! A quantidade de cotas não pode ser menor que 0.");
        }

        this.quantidadeCotas = quantidadeCotas;
    }

    public BigDecimal getDividendoPorCota() {
        return dividendoPorCota;
    }

    private void setDividendoPorCota(BigDecimal dividendoPorCota) {
        validarBigDecimal(dividendoPorCota, BigDecimal.ZERO, "Erro! O dividendo por cota não pode ser menor que 0.");
        this.dividendoPorCota = dividendoPorCota;
    }
}
