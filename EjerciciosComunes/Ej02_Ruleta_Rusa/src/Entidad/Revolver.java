/*
Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de 
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua, 
se dispara y se moja. Las clases por hacer del juego son las siguientes:

Clase Revolver de agua: esta clase posee los siguientes atributos: 
* posición actual (posición del tambor que se dispara, puede que esté el agua o no) 
* posición agua (la posición del tambor donde se encuentra el agua). 
Estas dos posiciones, se generarán aleatoriamente.

Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package Entidad;

/**
 *
 * @author FT
 */
public class Revolver {

///ATTR:
    private int posicionActual;
    private int posicionAgua;
    final static int POSICIONES_REVOLVER = 6;

///CONSTR:
    public Revolver() {
        this.posicionActual = (int) (Math.random() * (POSICIONES_REVOLVER - 1));
        this.posicionAgua = (int) (Math.random() * (POSICIONES_REVOLVER - 1));
    }

/// G & S:
    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

///LLENAR REVOLVER: Le pone los valores de posición actual y de posición del agua.
    //Los valores deben ser aleatorios.-
    public void llenarRevolver() {
        this.posicionActual = (int) (Math.random() * (POSICIONES_REVOLVER - 1));
        this.posicionAgua = (int) (Math.random() * (POSICIONES_REVOLVER - 1));
    }

///MOJAR: Devuelve true si la posición del agua coincide con la posición actual.-
    public boolean mojar() {

        return this.posicionActual == this.posicionAgua; //Devuelve TRUE si se cumple la condición.-
    }

///SIGUIENTE CHORRO: Cambia a la siguiente posición del tambor.-
    public void siguienteChorro() {

        if (!mojar()) {
            this.posicionActual += 1;
        }
        if (this.posicionActual == POSICIONES_REVOLVER) {
            this.posicionActual = 0;
        }
    }
    
///ToSTRING: muestra información del revolver (posición actual y donde está el agua).-
    @Override
    public String toString() {
        return "Revolver{" + "Posición actual: " + posicionActual + ", Posición agua: " + posicionAgua + '}';
    }
}