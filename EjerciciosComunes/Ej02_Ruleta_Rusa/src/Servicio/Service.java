/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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