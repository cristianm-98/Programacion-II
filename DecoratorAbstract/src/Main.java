public class Main {
    public static void main(String[] args) {

        Bebida pedido1 = new CafeSimple();
        pedido1 = new ChocolateDecorator(pedido1);

        System.out.println(pedido1.getDescripcion() + " " + pedido1.getCosto());


        Bebida pedido2 = new TeSimple();
        pedido2 = new AzucarDecorator(pedido2);
        System.out.println(pedido2.getDescripcion() +" " + pedido2.getCosto());


    }
}