import java.util.Arrays;

public class Vetor {
    private Aluno[] alunos = new Aluno[100];
    private int totalAlunos = 0;

    public void adiciona(Aluno aluno){
        this.alunos[totalAlunos]=aluno;
        this.totalAlunos++;

        
        // for(int c=0;c<alunos.length;c++){
        //     if(this.alunos[c]==null){
        //         this.alunos[c]=aluno;
        //         break;
        //     }
        // }
    }

    public void adiciona(int posicao, Aluno aluno){
        verifica(posicao);
            this.alunos[posicao]=aluno;
        

        // if(posicao>0 && posicao<alunos.length-1){
        //     this.alunos[posicao]=aluno;
        // }
        // else{
        //     System.out.println("Impossivel Adicionar");
        // }
        // this.alunos[posicao] = aluno;
    }

    public Aluno pega(int posicao){
        return alunos[posicao];

    }

    public void remove(int posicao){
        verifica(posicao);
        alunos[posicao]=null;
    }

    public boolean contem(Aluno aluno){
        int controle = 0;
        for(Aluno pessoa : alunos){
            if (pessoa.equals(aluno)) {
                controle = 1;
                return true;
            }
            break;
        }
        if(controle == 0){
        return false;
        }else{
            return true;
        }
    }

    @Override

    public String toString(){
        return Arrays.toString(alunos);
    }

    public boolean verifica(int posicao){
        if(posicao>=0 && posicao<alunos.length-1){
            return true;
        }else{
            throw new IllegalArgumentException("Posição Invalida!");
        }
    }

}
