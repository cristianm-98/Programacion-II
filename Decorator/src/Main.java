public class Main {
    public static void main(String[] args) {


        Bebida pedido1 = new CafeSimple();
        pedido1 = new ConLeche(pedido1);
        pedido1 = new ConAzucar(pedido1);

        System.out.println("El pedido 1: " + pedido1.getDescripcion() + " el costo es: " + pedido1.getCosto());


        System.out.println("---------------------------");

        Bebida pedido2 = new TeSimple();
        pedido2 = new ConAzucar(pedido2);
        System.out.println("El pedido 2: " + pedido2.getDescripcion() + " el costo es: " + pedido2.getCosto()) ;

    }
}