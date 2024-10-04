public class App {
    public static void main(String[] args) throws Exception {
        Gtarefa gerenciador = new Gtarefa();

        gerenciador.adicionarTarefa(new Tarefa("Estudar programação", "alta"));
        gerenciador.adicionarTarefa(new Tarefa("Comprar mantimentos", "media"));
        gerenciador.adicionarTarefa(new Tarefa("Limpar a casa", "baixa"));

        gerenciador.listarTarefas();

        gerenciador.marcarConcluida(0);
        gerenciador.listarTarefas();

        gerenciador.listarTarefasPrioridade("media");

        gerenciador.removerTarefa(1);
        gerenciador.listarTarefas();

    }
}
