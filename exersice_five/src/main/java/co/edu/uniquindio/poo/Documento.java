package co.edu.uniquindio.poo;


public class Documento implements Cloneable{
    private String titulo;
    private String autor;
    private String contenido;

    
    public Documento(String titulo, String autor, String contenido) {
        this.titulo = titulo;
        this.autor = autor;
        this.contenido = contenido;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    
    @Override
    public  Object clone(){
        Documento cloneDocumento= new Documento(titulo, autor, contenido);
        cloneDocumento.setTitulo(this.getTitulo());
        cloneDocumento.setAutor(this.getAutor());
        cloneDocumento.setContenido(this.getContenido());
        return cloneDocumento;

    }

    @Override
    public String toString() {
        return "Documento [titulo=" + titulo + ", autor=" + autor + ", contenido=" + contenido + "]";
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
