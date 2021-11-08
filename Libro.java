
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
     * Devuelve el t�tulo del libro
     */
    public String getTitulo() {
        return titulo;
    }
    
    /**
     * Devuelve el n�mero de p�ginas
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
     * Imprime el t�tulo del libro
     */
    public void imprimeTitulo() {
        System.out.println(titulo);
        System.out.println();
    }
    
    /**
     * Imprime los detalles del libro
     */
    public void imprimirDetalles() {
        System.out.println("T�tulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("P�ginas: " + numeroPaginas);
        System.out.println();
    }
    
    /**
     * Devuelve los detalles del libro
     */
    public String getDetalles() {
        return "T�tulo: " + titulo + ", Autor: " + autor + ", P�ginas: " + numeroPaginas;
    }
}
