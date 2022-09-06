/*
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un 
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba 
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
*/
package Principal;

/**
 *
 * @author FT
 */
public class Dni {
    
///ATTR:    
    private char serie;
    private int numero;
    
///CONSTR:
    public Dni() {
    }
    public Dni(char serie, int numero) {
        this.serie = serie;
        this.numero = numero;
    }

///G & S:
    public char getSerie() {
        return serie;
    }
    public void setSerie(char serie) {
        this.serie = serie;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
 
///TO STRING:
    @Override
    public String toString() {
        return "Serie: " + serie + ", N°: " + numero;
    }
}