public class Main {
    public static void main(String[] args) {

        Bebida pedido1 = new CafeSimple();
        pedido1 = new ConLeche(pedido1);
        pedido1= new ConAzucar(pedido1);

        System.out.println("El pedido 1: " + pedido1.getDescripcion());
        System.out.println("Costo total $: " + pedido1.getCosto());
    }
}