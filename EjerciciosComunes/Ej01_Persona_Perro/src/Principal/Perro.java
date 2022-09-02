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

public class Perro {
    
///ATTR:
    private String nombre;
    private String raza;
    private int edad;
    private String tamanio;
    
///CONSTR:
    public Perro() {
    }
    public Perro(String nombre, String raza, int edad, String tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

/// G & S:
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getTamanio() {
        return tamanio;
    }
    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    
///ToSTRING:
    @Override
    public String toString() {
        return "Nombre perro: " + nombre + ", Raza: " + raza + ", Edad: " + edad + ", Tamaño: " + tamanio;
    }
}