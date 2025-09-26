import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = Empresa.getInstance();

        Bicicleta bici = BicicletaFactory.crearBicicleta("electrica", "001", true, 2.5, 50);

        Alquiler alquiler=new Alquiler(20,bici);
        double total= alquiler.calcularTotal();
        System.out.println(total);


//        menuPrincipal(empresa);
//
//
//    }
//    public static void menuPrincipal(Empresa empresa){
//        int opcion=0;
//        do{
//            System.out.println("*** MENU PRINCIPAL");
//            System.out.println("1. MENU USUARIO");
//            System.out.println("2. MENU BICICLETA");
//            System.out.println("3. MENU ALQUILER");
//            System.out.println("4. SALIR");
//            System.out.println("Ingrese la opcion: ");
//            Scanner teclado= new Scanner(System.in);
//            opcion=teclado.nextInt();
//
//            switch (opcion){
//                case 1:
//                    menuUsuario(Empresa.getInstance());
//                    break;
//                case 2:
//                    break;
//            }
//        }while(opcion!=4);
//
//    }
//    public static void menuUsuario(Empresa empresa){
//        int opcion=0;
//        do{
//            System.out.println("1. INGRESAR USUARIOS");
//            System.out.println("2. MOSTRAR USUARIOS");
//            System.out.println("3. REGRESAR");
//            Scanner teclado=new Scanner(System.in);
//            opcion= teclado.nextInt();
//
//            switch(opcion){
//                case 1:
//                    break;
//                case 2:
//                    break;
//            }
//        }while(opcion!=3);
//    }
    }
}