package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        DirectorServidor servidores = new DirectorServidor();
        Servidor servidorBasico = servidores.crearServidorBasico();

        System.out.println(servidorBasico.toString());

        Servidor servidorMedio = servidores.crearServidorMediano();

        System.out.println(servidorMedio.toString());

        Servidor servidorTop = servidores.crearServidorTop();
        
        System.out.println(servidorTop.toString());
    }
}
