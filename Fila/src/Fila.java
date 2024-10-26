public class Fila {
    private Elemento cabeca;
    private Elemento fim;
    private int tamanho;

    public Fila(){
        this.cabeca = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public boolean vazio(){
        return this.tamanho == 0;
    }
    public int tamanho(){
        return this.tamanho;
    }

    public void enfileirar(Object valor){
        Elemento elemento = new Elemento(valor);
        if(vazio()){
        this.cabeca = elemento;
        this.fim = elemento;
        }else{
            this.fim.proximo = elemento;
            this.fim = elemento;
        }
        this.tamanho++;
    }

    public void desenfileirar(){
        if(vazio()){
            throw new IllegalStateException("A fila está vazia!");
        }
        this.cabeca = this.cabeca.proximo;
        this.tamanho--;
        if (this.tamanho == 0){
            this.fim = null;
        }
    }

    public Elemento cabeca(){
        if(vazio()){
            throw new IllegalStateException("A fila está vazia!");
        }
        return this.cabeca;
    }

    @Override
    public String toString(){
        if(vazio()){
            return "[]";
        }else{
            StringBuilder resultado = new StringBuilder("-{");
            Elemento atual = cabeca;
            while (atual!=null) {
                resultado.append(atual.valor);
                if (atual.proximo!=null) {
                    resultado.append(", ");
                }
                atual = atual.proximo;
            } 
            resultado.append("}-");
            return resultado.toString();
        }
    }

}
