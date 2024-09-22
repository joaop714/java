public class App {
    public static void main(String[] args) throws Exception {

        Aluno aluno = new Aluno(1, "Joao", 8);
        Aluno aluno2 = new Aluno(2, "Maria", 9);
        Aluno aluno3 = new Aluno(3, "Ale", 7);
        Aluno aluno4 = new Aluno(4, "Julia", 8);

       // System.out.println(aluno);
       // System.out.println(aluno2);

        Aluno[] clase ={aluno,aluno2};
        Aluno[] clase1 ={aluno3,aluno4};
        Turma turma = new Turma("ADS",clase);
        Turma turma1 = new Turma("Medi", clase1);
        System.out.println(turma.nome);
        turma.exibirAlunos();
        System.out.println("-----------------");
        System.out.println(turma1.nome);
        turma1.exibirAlunos();
        
    }
}
