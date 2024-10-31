public class App {
    public static void main(String[] args) throws Exception {
        Fila fila = new Fila();
        
        fila.enfileirar('J');
        fila.enfileirar('A');
        fila.enfileirar('D');
        fila.enfileirar('A');
        fila.enfileirar('H');
        fila.enfileirar('A');
        fila.enfileirar('B');
        fila.enfileirar('A');
        fila.enfileirar('D');

        System.out.println(fila);
        System.out.println(fila.contador('A'));
        System.out.println(fila.contador('D'));

        fila.inverter();
        System.out.println(fila);
    }
}
