/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a 
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a 
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar 
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la 
persona.

Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las 
personas con sus respectivos perros.
 */
package entidad;

import Enum.Raza;
import Enum.Tamanio;

/**
 *
 * @author FT
 */
public class Perro {

///ATTR:
    private String nombre;
    private Raza raza;
    private int edad;
    private Tamanio tamanio;
    private Persona dueno;
    
///CONSTR:
    public Perro() {
    }
     public Perro(String nombre, Raza raza, int edad, Tamanio tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }
    public Perro(String nombre, Raza raza, int edad, Tamanio tamanio, Persona dueno) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
        this.dueno = dueno;
    }
    
///G & S:
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Raza getRaza() {
        return raza;
    }
    public void setRaza(Raza raza) {
        this.raza = raza;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Tamanio getTamanio() {
        return tamanio;
    }
    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }
    public Persona getDueno() {
        return dueno;
    }
    public void setDueno(Persona dueno) {
        this.dueno = dueno;
    }

///ToSTRING:

    @Override
    public String toString() {
        return "Perro // Nombre: " + nombre + ", Raza: " + raza + ", Edad: " + edad + ", Tamaño: " + tamanio + ", Dueño: " + dueno;
    }
}