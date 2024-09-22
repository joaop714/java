public class Escola {
    public String nome;
    public Turma[] turmas;

    public Escola(String nome, Turma[] turmas){
        this.nome=nome;
        this.turmas= turmas;
    }

    public void exibirAlunosPorTurma(){
        for(Turma turma:turmas ){
            turma.exibirAlunos();
        }

    }
}
