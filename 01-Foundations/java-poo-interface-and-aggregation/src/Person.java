public class Person {
    // Attributes
    private String name;
    private int age;
    private String gender;

    // Constructor
    public Person(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    // Public Methods
    public void haveBirthday() {
        setAge(getAge() + 1);
        System.out.println("Feliz Aniversario!");
        System.out.println("Agora você tem " + getAge() + " anos");
    }

    // Intern Methods
    private void validateText(String value, String field) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("Erro! O campo " + field + " não pode ser nulo ou vazio.");
        }
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    private void setName(String name) {
        validateText(name, "nome");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Erro! A idade não pode ser negativa.");
        }
        if (age > 120) {
            throw new IllegalArgumentException("Erro! Limite biológico de idade excedido (máximo 120 anos).");
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    private void setGender(String gender) {
        validateText(gender, "sexo");

        if (gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("f")) {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Sexo invalido! digite M(Masculino) ou F(Feminino).");
        }
    }
}
