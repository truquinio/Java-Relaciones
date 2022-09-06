/*
Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de 
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua, 
se dispara y se moja. 
 */
package Servicio;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.Revolver;
import java.util.ArrayList;

/**
 *
 * @author FT
 */
public class Service {
    
    private static final int JUGADORES_MAXIMOS = 6;

///CREAR LISTA DE JUGADORES:
    public ArrayList<Jugador> crearJugadores() {
        
        ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
        
        for (int i = 1; i < JUGADORES_MAXIMOS + 1; i++) {
            
            listaJugadores.add(new Jugador(i));
        }
        return listaJugadores;
    }

///CREAR REVOLVER:
    public Revolver crearRevolver() {
        return new Revolver();
    }

///CREAR JUEGO:
    public Juego crearJuego() {
        return new Juego();
    }
}