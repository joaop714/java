public class App {
    public static void main(String[] args) throws Exception {
        Estoque estoque = new Estoque();

        Livro livro1 = new Livro("1984", "George Orwell", "123456789", 10);
        Livro livro2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "987654321", 5);

        estoque.adicionar(livro1);
        estoque.adicionar(livro2);

        estoque.listar();

        estoque.atualizarQuant("123456789", 15);
        System.out.println("Após atualização:");
        estoque.listar();

        estoque.remover("987654321");
        System.out.println("Após remoção:");
        estoque.listar();


    }
}
