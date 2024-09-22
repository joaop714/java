public class Pessoa {
    // Abstração, encapsulamento, polimorfismo e herança 
    // é um encapsulamento (public acessivel em qqlr parte todo projeto,
// private acesso dentro da classe e protected acesso dentro do pacote)
    //public String nome; 
    private String nome; 
    public int idade;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nomePr){
        this.nome = nomePr;
    }
    @Override
    public String toString(){
        //return super.toString();
        return " Pessoa \n"+
            " - Nome: " + this.nome+"\n"+
            " - Idade: "+this.idade;
    }


}
