public class Simulation {
    public static void main(String[] args) {
        Person[] p = new Person[2];
        Book[] l = new Book[3];

        try {
            p[0] = new Person("Maria", 20, "F");
            p[1] = new Person("Jorge", 18, "M");

            l[0] = new Book("Java para Iniciantes", "Guanabara", 300, p[0]);
            l[1] = new Book("JAVA POO", "Guanabara", 500, p[1]);
            l[2] = new Book("Java Avançado", "Guanabara", 800, p[1]);

            l[0].toOpen();
            l[0].browse(147);
            l[0].advancePage();
            l[0].details();

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}