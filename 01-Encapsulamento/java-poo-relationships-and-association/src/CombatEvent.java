public class CombatEvent {
    public static void main(String[] args) {
        Fighter[] l = new Fighter[6];

        l[0] = new Fighter("Paul Cabanes", "França", 31,
                1.75, 68.9, 11, 3, 1);
        l[1] = new Fighter("Alex Oliveira", "Brasil", 29,
                1.68, 57.8, 14, 2, 3);
        l[2] = new Fighter("Justin McGregor", "EUA", 35,
                1.65, 80.9, 12, 2, 1);
        l[3] = new Fighter("Martin Luther", "Australia", 28,
                1.93, 81.6, 13, 0, 2);
        l[4] = new Fighter("Charles Poatan", "Brasil", 37,
                1.70, 119.3, 5, 4, 3);
        l[5] = new Fighter("David Conor", "EUA", 37,
                1.70, 119.3, 5, 4, 3);

        Fight luta1 = new Fight();

        try {
            luta1.scheduleFight(l[4], l[5]);
            luta1.toFight();

            l[4].status();
            l[5].status();
        } catch (IllegalArgumentException e) {
            System.out.println("Não foi possivel realizar a luta pois: " + e.getMessage());
        }
    }
}