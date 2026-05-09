public class Book implements Publication {
    // Attributes
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Person leitor;

    // Constructor Method
    public Book(String titulo, String autor, int totPaginas, Person leitor) {
        setTitulo(titulo);
        setAutor(autor);
        setTotPaginas(totPaginas);
        setLeitor(leitor);
    }

    // Public Methods
    public void detalhes() {
        System.out.println("---------- Informações do livro ----------");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Total de páginas: " + getTotPaginas());
        System.out.println("Leitor: " + getLeitor().getNome());
        System.out.println("Página Atual: " + getPagAtual());
    }

    @Override
    public void abrir() {
        if (isAberto()) {
            throw new IllegalArgumentException("O livro já está aberto!");
        }
        setAberto(true);
    }

    @Override
    public void fechar() {
        if (!(isAberto())) {
            throw new IllegalArgumentException("O livro ja está fechado!");
        }
        setAberto(false);
    }

    @Override
    public void folhear(int pagina) {
        testeAberto(aberto);
        setPagAtual(pagina);
    }

    @Override
    public void avancarPag() {
        testeAberto(aberto);
        setPagAtual(getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        testeAberto(aberto);
        setPagAtual(getPagAtual() - 1);
    }

    // Intern Methods
    private void validarTexto(String valor, String campo) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("Erro! O campo " + campo + " não pode ser nulo ou vazio.");
        }
    }

    private void testeAberto(boolean aberto) {
        if (!(isAberto())) {
            throw new IllegalArgumentException("Erro! O livro está fechado, abra-o primeiro.");
        }
    }

    // Getters and Setters
    public String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        validarTexto(titulo, "título");
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    private void setAutor(String autor) {
        validarTexto(autor, "autor");
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    private void setTotPaginas(int totPaginas) {
        if (totPaginas < 0) {
            throw new IllegalArgumentException("Erro! O total de páginas não pode ser negativo.");
        }
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    private void setPagAtual(int pagAtual) {
        if (pagAtual < 0) {
            throw new IllegalArgumentException("Você já está na primeira página, não é possivel voltar mais.");
        }
        if (pagAtual > getTotPaginas()) {
            throw new IllegalArgumentException("Você já está na última página, não é possivel avançar mais.");
        }
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    private void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Person getLeitor() {
        return leitor;
    }

    private void setLeitor(Person leitor) {
        if (leitor == null) {
            throw new IllegalArgumentException("Erro! O leitor não pode ser nulo.");
        }
        this.leitor = leitor;
    }
}
