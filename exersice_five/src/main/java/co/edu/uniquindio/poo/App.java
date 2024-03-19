package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("juan", "Garcia", "1");
        Documento documento = new Documento("Star Wars", "juan Garcia", "largo");
        Editor editor = new Editor(documento, usuario);
        
        Object copyOne =  documento.clone();
        documento.setAutor("poloncia");
        System.out.println(copyOne.toString());
        System.out.println(documento);
    }
}
