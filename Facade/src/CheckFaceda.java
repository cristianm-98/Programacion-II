public class CheckFaceda {
    private AvionAPI avionAPI;
    private HotelAPI hotelAPI;

    public CheckFaceda(){
        avionAPI=new AvionAPI();
        hotelAPI=new HotelAPI();
    }

    public void buscar(String fechaIda, String fechaVuelta, String origen, String destino){
        avionAPI.buscarVuelos(fechaIda,fechaVuelta,origen,destino);
        hotelAPI.buscarHotel(fechaIda,fechaVuelta,origen,destino);
    }
}
