public class Fighter {
    // Attributes
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private int vitorias;
    private int derrotas;
    private int empates;

    // Constructor
    public Fighter(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    // Public Methods
    public void apresentar() {
        System.out.println("---------- APRESENTAÇÂO ----------");
        System.out.println("Lutador: " + getNome());
        System.out.println("Nacionalidade: " + getNacionalidade());
        System.out.println("Categoria: peso " + getCategoria());
        System.out.println("Idade: " + getIdade() + " anos");
        System.out.println("Altura: " + getAltura() + "m");
        System.out.println("Peso: " + getPeso() + "Kg");
        System.out.println("Vitorias: " + getVitorias());
        System.out.println("Derrotas: " + getDerrotas());
        System.out.println("Empates: " + getEmpates());
    }

    public void status() {
        System.out.println("---------- STATUS ----------");
        System.out.println(getNome());
        System.out.println("Categoria: peso " + getCategoria());
        System.out.println("Vitorias: " + getVitorias());
        System.out.println("Derrotas: " + getDerrotas());
        System.out.println("Empates: " + getEmpates());
    }

    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }

    // Getters and Setters
    public String getNome() {
        return this.nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    private void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    private void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    private void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCategoria() {
        if (this.peso < 52.2 || this.peso > 120.2) {
            return "Inválido";
        }
        if (this.peso <= 70.3) {
            return "Leve";
        }
        if (this.peso <= 83.9) {
            return "Médio";
        }
        return "Pesado";
    }

    public int getVitorias() {
        return vitorias;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }
}
