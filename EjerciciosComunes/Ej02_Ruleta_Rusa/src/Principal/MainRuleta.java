/*
Realizar el game de la ruleta rusa de agua en Java. Como muchos saben, el game se trata de 
un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua, 
se dispara y se moja. Las clases por hacer del game son las siguientes:

Clase Revolver de agua:
•  llenarRevolver()
•  mojar()
•  siguienteChorro()
•  toString()

Clase Jugador:
• disparo(Revolver gun)

Clase Juego:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver gun)
• ronda()

Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package Principal;

import Entidad.Juego;
import Servicio.Service;

/**
 *
 * @author FT
 */
public class MainRuleta {

    public static void main(String[] args) {
        
        System.out.println("RULETA RUSA:\n");
        
        Service objetoServicio = new Service();
        
        Juego game = objetoServicio.crearJuego();
        
        game.llenarJuego(objetoServicio.crearJugadores(), objetoServicio.crearRevolver());
        
        System.out.println(game.getGun());
        
        game.ronda();
    }
}