/*
Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe 
contener un método toString() que retorne el número de carta y el palo. La baraja estará 
compuesta por un conjunto de cartas, 40 exactamente.
 */
package entidad;

import Enum.Numero;
import Enum.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author FT
 */
public class Baraja {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Baraja inicial = Lista vacía que contendrá todas las cartas el mazo.-
    private ArrayList<Carta> barajaInicial = new ArrayList<>();

    //Cartas repartidas = Lista vacía que contendrá todas las cartas que se vayan dando.-
    private ArrayList<Carta> cartasRepartidas = new ArrayList<>();

///•    CREAR BARAJA:
    public static Baraja crearBaraja() {
        return new Baraja();
    }

///•    LLENAR la BARAJA en el CONSTRUCTOR.-
    public Baraja() {

        //Con FOR Each recorro el ENUM de NÚMEROS.-
        for (Numero numeroForEach : Numero.values()) {

            //Con FOR Each recorro el ENUM de PALOS.-
            for (Palo paloForEach : Palo.values()) {

                //Lleno la BARAJA INICIAL con una NUEVA CARTA (NÚMERO y PALO recorridos por los FOR EACH).-
                this.barajaInicial.add(new Carta(numeroForEach, paloForEach));
            }
        }
    }

//•     barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar() {

        //SHUFFLE: modifica la posición de los elementos de una lista de manera aleatoria. 
        Collections.shuffle(this.barajaInicial);
        
        System.out.print(this.barajaInicial);
    }

//•     cartasDisponibles(): indica el número de cartas que aún se puede repartir.   
    public int cartasDisponibles() {

        return this.barajaInicial.size();
    }


/*•     siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o 
se haya llegado al final, se indica al usuario que no hay más cartas.-*/
    public Carta siguienteCarta() {

        //Tomo un objeto SIGUIENTE CARTA (Con posición 0) de la BARAJA INICIAL.-
        Carta nextCard = this.barajaInicial.get(0);

        //Lo REMUEVO de la BARAJA INICIAL.-
        barajaInicial.remove(0);

        //AGREGO objeto SIGUIENTE CARTA a la lista CARTAS REPARTIDAS.-
        this.cartasRepartidas.add(nextCard);

        if (this.cartasDisponibles() == 0) {

            System.out.println("\nNo hay más cartas.\n");
        }
        return nextCard;
    }

/*•     darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de 
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero 
debemos indicárselo al usuario.-*/

//PIDO una CANTIDAD de CARTAS desde el MAIN y las paso x parámetro
   
    public ArrayList<Carta> darCartas(int cantidadCartas) {
//    public ArrayList<Carta> darCartas() {

        //En caso de que haya MAS CARTAS DISPONIBLES que las pedidas.-
        if (cartasDisponibles() >= cantidadCartas) {

            //Creo una LISTA AUXILIAR para contener las CARTAS QUE PIDA.-
            ArrayList<Carta> repartidas = new ArrayList<>();

            //Recorro la LISTA desde 0 hasta la CANTIDAD de CARTAS que pedí en el SERVICIO.-
            for (int i = 0; i < cantidadCartas; i++) {

                //Uso el MÉTODO SIGUIENTE CARTA, para agregar las repartidas.-
                repartidas.add(this.siguienteCarta());
            }
            //RETORNO las CARTAS que REPARTÍ.-
            return repartidas;
        }

        System.out.println("\nNo hay tantos naipes.");

        //RETORNO una nueva LISTA de clase CARTA.-
        return new ArrayList<Carta>();
    }

/*•     cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna 
indicárselo al usuario.-*/
    
    public void cartasMonton() {

        //Si las CARTAS REPARTIDAS es = 0
        if (this.cartasRepartidas.size() == 0) {

            System.out.println("No ha pedido naipes.\n");

            //Con RETURN hago que termine la CONDICIÓN del IF.-
            return;
        }
        System.out.println("Naipes repartidos:");

        //Recorro y muestro las CARTAS REPARTIDAS con FOR EACH.-
        for (Carta cartaForEach : cartasRepartidas) {

            System.out.println(cartaForEach);
        }
        System.out.println("");
    }

/*•     mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y 
luego se llama al método, este no mostrara esa primera carta.-*/
    public void mostrarBaraja() {

        if (barajaInicial.size() == 0) {

            System.out.println("\nNo hay cartas.\n");

            //Con RETURN hago que termine la CONDICIÓN del IF.-
            return;
        }

        //Recorro y muestro las CARTAS REPARTIDAS con FOR EACH.-
        for (Carta cartaForEach : barajaInicial) {

            System.out.println(cartaForEach);
        }
        System.out.println("");
    }
}