public class Turma {
    public String nome;
    public Aluno[] alunos;

    public Turma(String nome, Aluno[] alunos){
        this.nome=nome;
        this.alunos=alunos;
    }

    public void exibirAlunos(){
        for(Aluno aluno : alunos){
            System.out.println(aluno);
        }
    }

    public void mediaAlunos(){
        double soma=0,media=0;
        for(Aluno aluno : alunos){
            soma += aluno.nota;
        }
        media = soma/alunos.length;
        System.out.println("A média é: "+media);
    }

}
