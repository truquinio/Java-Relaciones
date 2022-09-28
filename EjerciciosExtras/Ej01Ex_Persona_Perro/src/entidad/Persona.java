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

import java.util.Objects;

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
    public Persona(String nombre, String apellido, int edad, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
    }
    public Persona(String nombre, String apellido, int edad, int dni, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.perro = perro;
    }

///G & S:
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
    
///ToSTRING (MODIFICADO para evitar el bucle infinito de los ToString):
    @Override
    public String toString() {

        //Si la persona aún no adoptó (PERRO = NULO).-
        if (Objects.isNull(this.perro)) {

            //Retorna Persona con todos los atributos menos PERRO ADOPTADO.-
            return "Persona // " + "Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad + ", DNI: " + dni + ", Perro adoptado: 0";
        }

        //Si la persona ya adoptó un perro; retorna Persona con todos los atributos + el nombre y la raza del Perro.-
        return "Persona // " + "Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad + ", DNI: " + dni + ", Perro adoptado / Nombre: " + this.perro.getNombre() + " / Raza: " + this.perro.getRaza();
    }
}