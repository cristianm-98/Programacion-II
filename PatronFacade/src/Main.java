public class Main {
    public static void main(String[] args) {

        CheckFaceda cliente1= new CheckFaceda();
        cliente1.buscar("10/05/2025","25/06/2025","Bogota","Medellin");

        CheckFaceda cliente2=new CheckFaceda();
        cliente2.buscar("03/06/2025","15/08/2025","Bogota","España");
        }
    }
