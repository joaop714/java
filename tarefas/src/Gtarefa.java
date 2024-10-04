public class Gtarefa {
    private Tarefa[] tarefas = new Tarefa[50];
    private int count = 0;

    public void adicionarTarefa(Tarefa tarefa) {
        if (count < tarefas.length) {
            tarefas[count++] = tarefa;
        } else {
            System.out.println("Limite de tarefas atingido.");
        }
    }

    public void removerTarefa(int posicao) {
        if (posicao >= 0 && posicao < count) {
            tarefas[posicao] = tarefas[count - 1];
            tarefas[count - 1] = null;
            count--;
        } else {
            System.out.println("Posição inválida.");
        }
    }

    public void marcarConcluida(int posicao) {
        if (posicao >= 0 && posicao < count) {
            tarefas[posicao].marcarConcluida();
        } else {
            System.out.println("Posição inválida.");
        }
    }

    public void listarTarefas() {
        System.out.println("\nTarefas Pendentes:");
        for (int i = 0; i < count; i++) {
            if ("pendente".equals(tarefas[i].getStatus())) {
                System.out.println(tarefas[i]);
            }
        }
        System.out.println("\nTarefas Concluídas:");
        for (int i = 0; i < count; i++) {
            if ("concluida".equals(tarefas[i].getStatus())) {
                System.out.println(tarefas[i]);
            }
        }
    }

    public void listarTarefasPrioridade(String prioridade) {
        System.out.println("\nTarefas com prioridade " + prioridade + ":");
        for (int i = 0; i < count; i++) {
            if (tarefas[i].getPrioridade().equalsIgnoreCase(prioridade)) {
                System.out.println(tarefas[i]);
            }
        }
    }
}

