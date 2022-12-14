/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a 
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a 
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar 
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la 
persona.

Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las 
personas con sus respectivos perros.
 */
package Enum;

/**
 *
 * @author FT
 */
public enum Raza {
    
    CANICHE("Caniche"),SALCHICA("Salchica"),PEQUINEZ("Pequinez"),DOGO("Dogo"), DELA("Dela");
    private String raza;
    
///CONSTR:
    private Raza() {
    }
    private Raza(String raza) {
        this.raza = raza;
    }

///GET:
    public String getRaza() {
        return raza;
    }

///ToSTRING:

    @Override
    public String toString() {
        return "" + raza;
    }
}