public class Book implements Publication {
    // Attributes
    private String title;
    private String author;
    private int totalPages;
    private int currentPage;
    private boolean open;
    private Person reader;

    // Constructor Method
    public Book(String title, String author, int totalPages, Person reader) {
        setTitle(title);
        setAuthor(author);
        setTotalPages(totalPages);
        setReader(reader);
    }

    // Public Methods
    public void details() {
        System.out.println("---------- Informações do livro ----------");
        System.out.println("Título: " + getTitle());
        System.out.println("Autor: " + getAuthor());
        System.out.println("Total de páginas: " + getTotalPages());
        System.out.println("Leitor: " + getReader().getName());
        System.out.println("Página Atual: " + getCurrentPage());
    }

    @Override
    public void toOpen() {
        if (isOpen()) {
            throw new IllegalArgumentException("O livro já está aberto!");
        }
        setOpen(true);
    }

    @Override
    public void toClose() {
        if (!(isOpen())) {
            throw new IllegalArgumentException("O livro ja está fechado!");
        }
        setOpen(false);
    }

    @Override
    public void browse(int page) {
        openTest(open);
        setCurrentPage(page);
    }

    @Override
    public void advancePage() {
        openTest(open);
        setCurrentPage(getCurrentPage() + 1);
    }

    @Override
    public void backPage() {
        openTest(open);
        setCurrentPage(getCurrentPage() - 1);
    }

    // Intern Methods
    private void validateText(String valor, String campo) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("Erro! O campo " + campo + " não pode ser nulo ou vazio.");
        }
    }

    private void openTest(boolean open) {
        if (!(isOpen())) {
            throw new IllegalArgumentException("Erro! O livro está fechado, abra-o primeiro.");
        }
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        validateText(title, "título");
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    private void setAuthor(String author) {
        validateText(author, "autor");
        this.author = author;
    }

    public int getTotalPages() {
        return totalPages;
    }

    private void setTotalPages(int totalPages) {
        if (totalPages < 0) {
            throw new IllegalArgumentException("Erro! O total de páginas não pode ser negativo.");
        }
        this.totalPages = totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    private void setCurrentPage(int currentPage) {
        if (currentPage < 0) {
            throw new IllegalArgumentException("Você já está na primeira página, não é possivel voltar mais.");
        }
        if (currentPage > getTotalPages()) {
            throw new IllegalArgumentException("Você já está na última página, não é possivel avançar mais.");
        }
        this.currentPage = currentPage;
    }

    public boolean isOpen() {
        return open;
    }

    private void setOpen(boolean open) {
        this.open = open;
    }

    public Person getReader() {
        return reader;
    }

    private void setReader(Person reader) {
        if (reader == null) {
            throw new IllegalArgumentException("Erro! O leitor não pode ser nulo.");
        }
        this.reader = reader;
    }
}
