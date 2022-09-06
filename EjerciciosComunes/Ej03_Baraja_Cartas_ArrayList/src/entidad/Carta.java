/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe 
contener un método toString() que retorne el número de carta y el palo. La baraja estará 
compuesta por un conjunto de cartas, 40 exactamente.
 */
package entidad;

import Enum.Numero;
import Enum.Palo;

/**
 *
 * @author FT
 */
public class Carta {
    
///ATTR:
    private Numero numero;
    private Palo palo;
    
///CONSTR:
    public Carta() {
    }

    public Carta(Numero numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }

/// G & S:

    public Numero getNumero() {
        return numero;
    }
    public void setNumero(Numero numero) {
        this.numero = numero;
    }
    public Palo getPalo() {
        return palo;
    }
    public void setPalo(Palo palo) {
        this.palo = palo;
    }
    
///ToSTRING:

    @Override
    public String toString() {
        return numero + " de " + palo;
    }
}