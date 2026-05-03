import java.util.Objects;
import java.util.Random;

public class Luta {
    // Attributes
    private Lutador desafiado; // tipo abstrato de dado, o tipo é uma instacia/agregação da Classe Lutador
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    private final Random gerador = new Random();

    // Public Methods
    public Luta() {
        this.aprovada = false;
    }

    public void marcarLuta(Lutador desafiado, Lutador desafiante) {
        if (Objects.equals(desafiado.getNome(), desafiante.getNome())) {
            throw new IllegalArgumentException("Um Lutador não pode lutar contra ele mesmo!");
        }

        if (!(Objects.equals(desafiado.getCategoria(), desafiante.getCategoria()))) {
            throw new IllegalArgumentException("Os lutadores não podem ser de categorias de peso diferentes!");
        }

        setAprovada(true);
        setDesafiado(desafiado);
        setDesafiante(desafiante);
    }

    public void lutar() {
        if (!(isAprovada())) {
            throw new IllegalArgumentException("Está luta não foi aprovada!");
        }
        System.out.println("\n----- " + desafiado.getNome() + " vs " + desafiante.getNome() + " -----\n");
        desafiado.apresentar();
        desafiante.apresentar();

        int resultado = gerador.nextInt(3);

        switch (resultado) {
            case 0 -> {
                System.out.println("\nEmpate!\n");
                desafiado.empatarLuta();
                desafiante.empatarLuta();
            }
            case 1 -> {
                System.out.println("\n" + desafiado.getNome() + " é o Vencedor!\n");
                desafiado.ganharLuta();
                desafiante.perderLuta();
            }
            case 2 -> {
                System.out.println("\n" + desafiante.getNome() + " é o Vencedor!\n");
                desafiante.ganharLuta();
                desafiado.perderLuta();
            }
            default -> System.out.println("Erro, resultado inesperado!");
        }
    }

    // Special Methods
    public Lutador getDesafiado() {
        return desafiado;
    }

    private void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    private void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    private void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    private void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
