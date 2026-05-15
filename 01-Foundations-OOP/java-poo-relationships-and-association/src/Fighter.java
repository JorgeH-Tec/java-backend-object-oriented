public class Fighter {
    // Attributes
    private String name;
    private String nacionality;
    private int age;
    private double height;
    private double weight;
    private int wins;
    private int loses;
    private int draws;

    // Constructor
    public Fighter(String name, String nacionality, int age, double height, double weight, int wins, int loses, int draws) {
        this.name = name;
        this.nacionality = nacionality;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.wins = wins;
        this.loses = loses;
        this.draws = draws;
    }

    // Public Methods
    public void toApresent() {
        System.out.println("---------- APRESENTAÇÂO ----------");
        System.out.println("Lutador: " + getName());
        System.out.println("Nacionalidade: " + getNacionality());
        System.out.println("Categoria: peso " + getCategory());
        System.out.println("Idade: " + getAge() + " anos");
        System.out.println("Altura: " + getHeight() + "m");
        System.out.println("Peso: " + getWeight() + "Kg");
        System.out.println("Vitorias: " + getWins());
        System.out.println("Derrotas: " + getLoses());
        System.out.println("Empates: " + getDraws());
    }

    public void status() {
        System.out.println("---------- STATUS ----------");
        System.out.println(getName());
        System.out.println("Categoria: peso " + getCategory());
        System.out.println("Vitorias: " + getWins());
        System.out.println("Derrotas: " + getLoses());
        System.out.println("Empates: " + getDraws());
    }

    public void winFight() {
        setWins(getWins() + 1);
    }

    public void loseFight() {
        setLoses(getLoses() + 1);
    }

    public void drawFight() {
        setDraws(getDraws() + 1);
    }

    // Getters and Setters
    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getNacionality() {
        return nacionality;
    }

    private void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    private void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCategory() {
        if (this.weight < 52.2 || this.weight > 120.2) {
            return "Inválido";
        }
        if (this.weight <= 70.3) {
            return "Leve";
        }
        if (this.weight <= 83.9) {
            return "Médio";
        }
        return "Pesado";
    }

    public int getWins() {
        return wins;
    }

    private void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }

    private void setLoses(int loses) {
        this.loses = loses;
    }

    public int getDraws() {
        return draws;
    }

    private void setDraws(int draws) {
        this.draws = draws;
    }
}
