/*
Realizar un programa para que una Persona pueda adoptar un Perro. 
Vamos a contar de dos clases:

• Perro, que tendrá como atributos: nombre, raza, edad y tamaño;
• Persona con atributos: nombre, apellido, edad, documento y Perro.

Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que 
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde 
la clase Persona, la información del Perro y de la Persona.
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
    private int edad;
    private int dni;
    private Perro perro;
    
///CONSTR:
    public Persona() {
    }
    public Persona(String nombre, String apellido, int edad, int dni, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.perro = perro;
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
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public Perro getPerro() {
        return perro;
    }
    public void setPerro(Perro perro) {
        this.perro = perro;
    }
    
///ToSTRING:
    @Override
    public String toString() {
        return "Persona // " + "Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad + ", DNI: " + dni + ", Perro: " + perro + '}';
    }
}