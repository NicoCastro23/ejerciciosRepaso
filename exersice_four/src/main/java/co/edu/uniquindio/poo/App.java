package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws NoSuchFieldException {
        Paquete paquete = new Paquete(20, "Colombia");
        SistemaLogistica sistemaLogistica = new SistemaLogistica(paquete, TipoTransporte.CAMION);
        SistemaLogistica.procesarTransporte(sistemaLogistica.getTipoTransporte());

        Paquete paqueteDos = new Paquete(50, "España");
        SistemaLogistica sistemaLogisticaDos = new SistemaLogistica(paqueteDos, TipoTransporte.BARCO);
        sistemaLogisticaDos.procesarTransporte(sistemaLogisticaDos.getTipoTransporte());
        
        Paquete paqueteTres = new Paquete(90, "Rusia");
        SistemaLogistica sistemaLogisticaTres= new SistemaLogistica(paqueteTres, TipoTransporte.AVION);
        sistemaLogisticaTres.procesarTransporte(sistemaLogistica.getTipoTransporte());
    }
}
