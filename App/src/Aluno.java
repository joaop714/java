public class Aluno {
    public int matricula;
    public String nome;
    public double nota;

    public Aluno(int mat, String nome, double nota){
        this.matricula = mat;
        this.nome = nome;
        this.nota = nota;
    }


    @Override
    public String toString(){
        return "-------------------------\n"+"ALUNO:\n"+"MATR. "+this.matricula+"\nNOME. "+this.nome+"\nNOTA. "+this.nota;
    }
}
