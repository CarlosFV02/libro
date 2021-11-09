
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
    private String numeroReferencia;
    private int vecesPrestado;
    private boolean esLibroDeTexto;

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas, boolean deTexto)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
        numeroReferencia = "";
        vecesPrestado = 0;
        esLibroDeTexto = deTexto;
    }

    /**
     * Introduces el número de referencia
     */
    public void setNumeroReferencia(String numeroDeReferencia) {
        if (numeroDeReferencia.length() >= 3) {        
            numeroReferencia = numeroDeReferencia;
        }
        else {
            System.out.println("Error. Número de referencia muy corto");
            System.out.println();
        }
    }

    /**
     * Incrementa en uno el atributo vecesPrestado
     */
    public void prestar() {
        vecesPrestado = vecesPrestado + 1;
    }

    /**
     * Devuelve si es libro de texto
     */
    public boolean getEsLibroDeTexto() {
        return esLibroDeTexto;
    }

    /**
     * Devuelve el número de referencia
     */
    public String getNumeroReferencia() {
        return numeroReferencia;
    }

    /**
     * Devuelve el número de veces que se ha prestado un número
     */
    public int getVecesPrestado() {
        return vecesPrestado;
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
        System.out.println("Número de préstamos: " + vecesPrestado);
        if (esLibroDeTexto == true) {
            System.out.println("Sí es libro de texto");
        }
        else {
            System.out.println("No es libro de texto");
        }
        if (numeroReferencia.length() == 0) {        
            System.out.println("ZZZ");
            System.out.println();
        }

        else {
            System.out.println("Número de referencia: " + numeroReferencia);
            System.out.println();
        }
    }

    /**
     * Devuelve los detalles del libro
     */
    public String getDetalles() {
        String aDevolver;
        if (numeroReferencia.length() == 0) {        
            aDevolver = "Título: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas + ", Número de préstamos: " + vecesPrestado + ", ZZZ";
        }

        else {
            aDevolver = "Título: " + titulo + ", Autor: " + autor + ", Páginas: " + numeroPaginas + ", Número de préstamos: " + vecesPrestado + ", Número de referencia: " + numeroReferencia;
        }
        if (esLibroDeTexto == true) {        
            aDevolver = aDevolver + ", Sí es libro de texto";
        }

        else {
            aDevolver = aDevolver + ", No es libro de texto";    
        }        
        return aDevolver;
    };
}
