/*
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición 
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho 
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.
 */
package Principal;

import java.util.ArrayList;

/**
 *
 * @author FT
 */
public class Equipo {

///ATRIBUTOS:    
    private ArrayList<Jugador> playersList = new ArrayList<>();
    
///CONSTR:
    public Equipo() {
    }

///G & S:
    public ArrayList<Jugador> getPlayersList() {
        return playersList;
    }
    public void setPlayersList(ArrayList<Jugador> playersList) {
        this.playersList = playersList;
    }

///TO STRING:
    @Override
    public String toString() {
        return "Lista Jugadores: " + playersList;
    }
}