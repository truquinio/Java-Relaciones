/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición 
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho 
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package Principal;

/**
 *
 * @author FT
 */
public class Jugador {

///ATRIBUTOS:
    private String nombre;
    private String apellido;
    private String posicion;
    private int numero;

///CONSTR:
    public Jugador() {
    }
    public Jugador(String nombre, String apellido, String posicion, int numero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.numero = numero;
    }

/// G & S:
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
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
        return "Jugador{" + "Nombre: " + nombre + ", Apellido: " + apellido + ", Posición: " + posicion + ", N°: " + numero + '}';
    }
}