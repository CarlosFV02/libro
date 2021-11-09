
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

    /**
     * Fija el autor y el titulo del libro a los dados como parametro
     */
    public Libro(String autorLibro, String tituloLibro, int numeroDePaginas)
    {
        autor = autorLibro;
        titulo = tituloLibro;
        numeroPaginas = numeroDePaginas;
        numeroReferencia = "";
        vecesPrestado = 0;
    }
    
    /**
     * Introduces el n�mero de referencia
     */
    public void setNumeroReferencia(String numeroDeReferencia) {
        if (numeroDeReferencia.length() >= 3) {        
            numeroReferencia = numeroDeReferencia;
        }
        else {
            System.out.println("Error. N�mero de referencia muy corto");
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
     * Devuelve el n�mero de referencia
     */
    public String getNumeroReferencia() {
        return numeroReferencia;
    }
    
    /**
     * Devuelve el n�mero de veces que se ha prestado un n�mero
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
        System.out.println("N�mero de pr�stamos: " + vecesPrestado);
        if (numeroReferencia.length() == 0) {        
                System.out.println("ZZZ");
                System.out.println();
        }
            
        else {
                System.out.println("N�mero de referencia: " + numeroReferencia);
                System.out.println();
        }
    }
    
    /**
     * Devuelve los detalles del libro
     */
    public String getDetalles() {
        String aDevolver;
        if (numeroReferencia.length() == 0) {        
                aDevolver = "T�tulo: " + titulo + ", Autor: " + autor + ", P�ginas: " + numeroPaginas + ", N�mero de pr�stamos: " + vecesPrestado + ", ZZZ";
        }
            
        else {
                aDevolver = "T�tulo: " + titulo + ", Autor: " + autor + ", P�ginas: " + numeroPaginas + ", N�mero de pr�stamos: " + vecesPrestado + ", N�mero de referencia: " + numeroReferencia;
        }
        return aDevolver;
    };
}
