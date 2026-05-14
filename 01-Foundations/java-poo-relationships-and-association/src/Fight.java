import java.util.Objects;
import java.util.Random;

public class Fight {
    // Attributes
    private Fighter challenged;
    private Fighter challenging;
    private int rounds;
    private boolean approved;
    private final Random generator = new Random();

    // Constructor
    public Fight() {
        this.approved = false;
    }

    // Public Methods
    public void scheduleFight(Fighter challenged, Fighter challenging) {
        if (Objects.equals(challenged.getName(), challenging.getName())) {
            throw new IllegalArgumentException("Um Lutador não pode lutar contra ele mesmo!");
        }

        if (!(Objects.equals(challenged.getCategory(), challenging.getCategory()))) {
            throw new IllegalArgumentException("Os lutadores não podem ser de categorias de peso diferentes!");
        }

        setApproved(true);
        setChallenged(challenged);
        setChallenging(challenging);
    }

    public void toFight() {
        if (!(isApproved())) {
            throw new IllegalArgumentException("Está luta não foi aprovada!");
        }
        System.out.println("\n----- " + challenged.getName() + " vs " + challenging.getName() + " -----\n");
        challenged.toApresent();
        challenging.toApresent();

        int result = generator.nextInt(3);

        switch (result) {
            case 0 -> {
                System.out.println("\nEmpate!\n");
                challenged.drawFight();
                challenging.drawFight();
            }
            case 1 -> {
                System.out.println("\n" + challenged.getName() + " é o Vencedor!\n");
                challenged.winFight();
                challenging.loseFight();
            }
            case 2 -> {
                System.out.println("\n" + challenging.getName() + " é o Vencedor!\n");
                challenging.winFight();
                challenged.loseFight();
            }
            default -> System.out.println("Erro, resultado inesperado!");
        }
    }

    // Setters and Getters
    public Fighter getChallenged() {
        return challenged;
    }

    private void setChallenged(Fighter challenged) {
        this.challenged = challenged;
    }

    public Fighter getChallenging() {
        return challenging;
    }

    private void setChallenging(Fighter challenging) {
        this.challenging = challenging;
    }

    public int getRounds() {
        return rounds;
    }

    private void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isApproved() {
        return approved;
    }

    private void setApproved(boolean approved) {
        this.approved = approved;
    }
}
