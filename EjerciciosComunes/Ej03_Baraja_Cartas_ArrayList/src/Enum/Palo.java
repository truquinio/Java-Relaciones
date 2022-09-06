/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe 
contener un método toString() que retorne el número de carta y el palo. La baraja estará 
compuesta por un conjunto de cartas, 40 exactamente.
 */
package Enum;

/**
 *
 * @author FT
 */
public enum Palo {
    
    ESPADA("♠"), BASTO("♣"), ORO("♦"), COPA("♥");
    
///ATTR:    
    private String nombre;
    
///CONSTR:
    private Palo(String nombre) {
        this.nombre = nombre;
    }
    
///G & S:
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
///ToSTRING:

    @Override
    public String toString() {
        return nombre;
    }
}