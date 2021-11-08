
/**
 * Una clase que representa objetos libro.
 * Esta clase podria formar parte de un
 * proyecto mas grande, como el de una aplicacion de
 * una biblioteca
 * 
 * @author Miguel Bayon 
 * @version 1.2
 */
public class Libro {

    private String autor;
    private String titulo;
    private int numeroPaginas;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
    }
    
    /**
     * Devuelve el nombre del autor
     */
    public String getAutor() {
        return autor;
    }
    
    /**
     * Devuelve el título del libro
     */
    public String getTitulo() {
        return titulo;
    }
    
    /**
     * Devuelve el número de páginas
     */
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    
    /**
     * Imprime el nombre del autor
     */
    public void imprimeAutor() {
        System.out.println(autor);
        System.out.println();
    }
    
    /**
     * Imprime el título del libro
     */
    public void imprimeTitulo() {
        System.out.println(titulo);
        System.out.println();
    }
    
    /**
     * Imprime los detalles del libro
     */
    public void imprimirDetalles() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + numeroPaginas);
        System.out.println();
    }
    
    /**
     * Devuelve los detalles del libro
     */
    public String getDetalles() {
        return "Título: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas;
    }
}
