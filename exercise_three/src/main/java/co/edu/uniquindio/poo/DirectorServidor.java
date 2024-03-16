package co.edu.uniquindio.poo;

public class DirectorServidor {
    public Servidor crearServidorBasico(){
        return new Servidor
        .ServidorBuilder()
        .cantidadCPU("2 Nucleos")
        .cantidadRAM("2 Gb")
        .tipoRed("3G")
        .build();
    }

    public Servidor crearServidorMediano(){
        return new Servidor
        .ServidorBuilder()
        .cantidadCPU("4 Nucleos")
        .cantidadRAM("8 Gb")
        .tipoRed("4G")
        .build();
    }

    public Servidor crearServidorTop(){
        return new Servidor
        .ServidorBuilder()
        .cantidadCPU("9 Nucleos")
        .cantidadRAM("16 Gb")
        .tipoRed("5G")
        .build();
    }
    

}
