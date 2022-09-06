/*
Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y 
Revolver

• ronda(): Al final del juego, se debe mostrar que jugador se mojó.
 */
package Entidad;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author FT
 */
public class Juego {

///ATTR:
    private HashSet<Jugador> conjuntoJugadores = new HashSet();
    private Revolver arma;

///CONSTR:
    public Juego() {
    }

/// G & S:
    public HashSet<Jugador> getJugadores() {
        return conjuntoJugadores;
    }

    public void setJugadores(HashSet<Jugador> jugadores) {
        this.conjuntoJugadores = jugadores;
    }

    public Revolver getGun() {
        return arma;
    }

    public void setGun(Revolver gun) {
        this.arma = gun;
    }

///LLENAR JUEGO: este método recibe los jugadores y el revolver para guardarlos en los atributos del juego.
    public void llenarJuego(ArrayList<Jugador> listaJugadores, Revolver gun) {

        this.conjuntoJugadores = new HashSet<Jugador>(listaJugadores);
        
        this.arma = gun;       
    }

///RONDA DE TIROS: cada ronda consiste en un jugador que se apunta con el revolver de agua y 
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se 
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que mojar.  
    
    public void ronda() {
        System.out.println(" ________________________");
        System.out.println("│Comienza el juego... ☻│");
        System.out.println(" ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        
       boolean mojado = false;
       
       do{
           for (Jugador jugadoresForEach : conjuntoJugadores) {
               
                if (jugadoresForEach.disparo(this.arma)) {
                    System.out.println("MOJADO: " + jugadoresForEach.getNombre() + ".\n");
                    mojado = true;
                    break;
                }
            }
        } while (!mojado);
    }
    
///ToSTRING:
    @Override
    public String toString() {
        return "Juego{" + "Jugadores: " + conjuntoJugadores + ", Revolver: " + arma + '}';
    }
}