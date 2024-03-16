package co.edu.uniquindio.poo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Data
@Getter

public class SistemaLogistica {
    private Paquete paquete;
    private TipoTransporte tipoTransporte;

    public static void procesarTransporte(TipoTransporte tipoTransporte) throws NoSuchFieldException {
        TransporteFactory transporteFactory = new TransporteFactory();
        Transporte transporte = transporteFactory.obteneTransporte(tipoTransporte);
        transporte.crearTransporte();
    }
}
