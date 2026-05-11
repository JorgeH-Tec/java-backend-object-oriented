import java.math.BigDecimal;

public abstract class Asset {
    // Attributes
    private String nome;
    private BigDecimal valorInicial;

    // Constructor
    public Asset(String nome, BigDecimal valorInicial) {
        setNome(nome);
        setValorInicial(valorInicial);
    }

    // Public Methods
    public abstract BigDecimal calcularValorAtual();

    public final void exibirRelatorio() {
        System.out.println(calcularValorAtual());
    }

    // Intern Methods
    protected final void validarBigDecimal(BigDecimal valor, BigDecimal limite, String mensagemErro) {
        if (valor == null) {
            throw new NullPointerException("ERRO INTERNO! valor não pode ser nulo!");
        }
        if (valor.compareTo(limite) < 0) {
            throw new IllegalArgumentException(mensagemErro);
        }
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        if (nome.isBlank()) {
            throw new IllegalArgumentException("Erro! O nome não pode ser nulo nem vazio.");
        }
        this.nome = nome;
    }

    public BigDecimal getValorInicial() {
        return valorInicial;
    }

    private void setValorInicial(BigDecimal valorInicial) {
        validarBigDecimal(valorInicial, BigDecimal.ZERO, "Erro! O valor inicial não pode ser menor que 0.");
        this.valorInicial = valorInicial;
    }
}
