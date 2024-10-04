public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private int quant;

    public Livro (String titulo, String autor, String isbn, int quant){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.quant = quant;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    @Override
    
    public String toString() {
        return "\nTítulo: " + this.titulo + "\nAutor: " + this.autor + "\nISBN: " + this.isbn + "\nQuantidade: " + this.quant + "\n-----------------------";
    }
}
