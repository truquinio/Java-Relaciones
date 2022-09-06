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
public class Persona {
    
///ATTR:    
    private String nombre;
    private String apellido;
    private Dni dni;
    
///CONSTR:
    public Persona() {
    }
    public Persona(String nombre, String apellido, Dni dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
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
    public Dni getDni() {
        return dni;
    }
    public void setDni(Dni dni) {
        this.dni = dni;
    }
    
///ToString:
    @Override
    public String toString() {
        return "Persona{" + "Nombre: " + nombre + ", Apellido: " + apellido + ", DNI: " + dni + '}';
    }
}