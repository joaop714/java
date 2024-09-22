public class Produto {
    public String nomePrdt;
    public double preco;
    public int qtd;
    
    public  Produto(String nomePrdt, double preco, int qtd){
        this.nomePrdt = nomePrdt;
        this.preco = preco;
        this.qtd = qtd;
    }

    public double precoTotal(){
        return preco*qtd;
    }
    public double precoDesc(){
        return this.precoTotal()*0.90;// desconto de 10 %
    }
}
