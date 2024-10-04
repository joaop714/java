public class Estoque {
    private Livro[] livros = new Livro [100];
    private int cont = 0;

    public void adicionar(Livro livro) {
        for (int i = 0; i < cont; i++) {
            if (livros[i].getIsbn().equals(livro.getIsbn())) {
                livros[i].setQuant(livros[i].getQuant() + livro.getQuant());
                return;
            }
        }
        
        if (cont < livros.length) {
            livros[cont] = livro;
            cont++;
        } else {
            System.out.println("Estoque cheio, não é possível adicionar mais livros.");
        }
    }

    public void remover(String isbn) {
        for (int i = 0; i < cont; i++) {
            if (livros[i].getIsbn().equals(isbn)) {
                for (int j = i; j < cont - 1; j++) {
                    livros[j] = livros[j + 1];
                }
                livros[cont - 1] = null;
                cont--;
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public Livro buscar(String isbn) {
        for (int i = 0; i < cont; i++) {
            if (livros[i].getIsbn().equals(isbn)) {
                return livros[i];
            }
        }
        System.out.println("Livro não encontrado.");
        return null;
    }

    
    public void listar() {
        if (cont == 0) {
            System.out.println("Estoque vazio.");
            return;
        }
        for (int i = 0; i < cont; i++) {
            System.out.println(livros[i]);
        }
    }

    public void atualizarQuant(String isbn, int quant) {
        for (int i = 0; i < cont; i++) {
            if (livros[i].getIsbn().equals(isbn)) {
                livros[i].setQuant(quant);
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

}
