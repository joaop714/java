public class App {
    public static void main(String[] args) throws Exception {
        Calc calc = new Calc();
        double res = calc.mult(5,10);
        System.out.println(res);
        System.out.println("----------------");

        Pessoa nanda=new Pessoa();
        nanda.idade=26;
        nanda.setNome("Nanda");
        System.out.println(nanda);
        System.out.println("----------------");

        Produto prod1 = new Produto("Teclado", 50,2);
        System.out.println (prod1.precoTotal());
        System.out.println (prod1.precoDesc());

    }
}
