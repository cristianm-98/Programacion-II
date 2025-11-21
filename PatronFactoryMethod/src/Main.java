void main() {

    PersonaFactory factory = new ClienteFactory();
    Persona cliente = factory.crearPersona("1010", "Carlos", "Restrepo", "Manzana 70", "857144", "carlos@mail.com");

    System.out.println(cliente);
}
