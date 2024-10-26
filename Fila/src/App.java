public class App {
    public static void main(String[] args) throws Exception {
        Fila fila = new Fila();
        fila.enfileirar("Ale");
        fila.enfileirar("Maria");
        fila.enfileirar("João");
        System.out.println(fila);
        
        fila.desenfileirar();
        
        fila.enfileirar("Natália");
        System.out.println(fila);

        fila.enfileirar("Bruno");

        System.out.println(fila.cabeca());
        System.out.println(fila.tamanho());

        //System.out.println(fila);
    }
}
