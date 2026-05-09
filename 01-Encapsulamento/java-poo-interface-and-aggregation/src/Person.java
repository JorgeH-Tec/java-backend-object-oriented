public class Person {
    // Attributes
    private String nome;
    private int idade;
    private String sexo;

    // Constructor
    public Person(String nome, int idade, String sexo) {
        setNome(nome);
        setIdade(idade);
        setSexo(sexo);
    }

    // Public Methods
    public void fazerAniver() {
        setIdade(getIdade() + 1);
        System.out.println("Feliz Aniversario!");
        System.out.println("Agora você tem " + getIdade() + " anos");
    }

    // Intern Methods
    private void validarTexto(String valor, String campo) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("Erro! O campo " + campo + " não pode ser nulo ou vazio.");
        }
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        validarTexto(nome, "nome");
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Erro! A idade não pode ser negativa.");
        }
        if (idade > 120) {
            throw new IllegalArgumentException("Erro! Limite biológico de idade excedido (máximo 120 anos).");
        }
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    private void setSexo(String sexo) {
        validarTexto(sexo, "sexo");

        if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
            this.sexo = sexo;
        } else {
            throw new IllegalArgumentException("Sexo invalido! digite M(Masculino) ou F(Feminino).");
        }
    }
}
