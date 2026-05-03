public class CombatEvent {
    public static void main(String[] args) {
        Lutador[] l = new Lutador[6];

        l[0] = new Lutador("Paul Cabanes", "França", 31,
                1.75, 68.9, 11, 3, 1);
        l[1] = new Lutador("Alex Oliveira", "Brasil", 29,
                1.68, 57.8, 14, 2, 3);
        l[2] = new Lutador("Justin McGregor", "EUA", 35,
                1.65, 80.9, 12, 2, 1);
        l[3] = new Lutador("Martin Luther", "Australia", 28,
                1.93, 81.6, 13, 0, 2);
        l[4] = new Lutador("Charles Poatan", "Brasil", 37,
                1.70, 119.3, 5, 4, 3);
        l[5] = new Lutador("David Conor", "EUA", 37,
                1.70, 119.3, 5, 4, 3);

        Luta luta1 = new Luta();

        try {
            luta1.marcarLuta(l[4], l[5]);
            luta1.lutar();

            l[4].status();
            l[5].status();
        } catch (IllegalArgumentException e) {
            System.out.println("Não foi possivel realizar a luta pois: " + e.getMessage());
        }
    }
}