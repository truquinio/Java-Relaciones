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
public class MainJugador {

    public static void main(String[] args) {
       
        Jugador player1 = new Jugador("Lalo", "Landa", "Delantero", 10);
        Jugador player2 = new Jugador("Fernando", "Chiquito", "Arquero", 9);
       
        ArrayList<Jugador> playersList = new ArrayList<>();
        playersList.add(player1);
        playersList.add(player2);
        
        Equipo team1 = new Equipo();
        team1.setPlayersList(playersList);
        
        for (Jugador playerForEach : playersList) {
            
            System.out.println(playerForEach + "\n");
        }
    }  
}