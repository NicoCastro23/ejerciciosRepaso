package co.edu.uniquindio.poo;

public class TransporteFactory {
    public Transporte obteneTransporte(TipoTransporte TipoTransporte) throws NoSuchFieldException{
        return switch (TipoTransporte) {
            case BARCO -> new TransporteBarco();
            case AVION -> new TransporteAvion();
            case CAMION -> new TransporteCamion();   
            default -> throw new NoSuchFieldException("Tipo de pago no encontrado");
        };
    }
}
