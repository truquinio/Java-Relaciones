/*
Realizar una mazo de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe 
contener un método toString() que retorne el número de carta y el palo. La mazo estará 
compuesta por un conjunto de cartas, 40 exactamente.

Las operaciones que podrá realizar la mazo son:

•   barajar(): cambia de posición todas las cartas aleatoriamente.
•   siguienteCarta(): devuelve la siguiente carta que está en la mazo, cuando no haya más o 
se haya llegado al final, se indica al usuario que no hay más cartas.
•   cartasDisponibles(): indica el número de cartas que aún se puede repartir.
•   darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de 
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero 
debemos indicárselo al usuario.
•   cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna 
indicárselo al usuario
•   mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y 
luego se llama al método, este no mostrara esa primera carta.
 */
package service;

import entidad.Baraja;
import java.util.Scanner;

/**
 *
 * @author FT
 */
public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Baraja mazo = new Baraja();

    public void menuOpciones() {
        
        int opcionMenu;

        do {
            System.out.println("╔══════════════╗");
            System.out.println("║  Elija una opción: ☻  ║");
            System.out.println("╚══════════════╝");
            
            System.out.println("1. Mostrar baraja.");
            System.out.println("2. Mezclar baraja.");
            System.out.println("3. Siguiente naipe.");
            System.out.println("4. Pedir naipes.");
            System.out.println("5. Naipes repartidos.");
            System.out.println("6. Naipes en baraja.");
            System.out.println("0. Salir.");

            opcionMenu = leer.nextInt();
            System.out.println("");

            switch (opcionMenu) {

                case 1:
                    System.out.println("Hay " + mazo.cartasDisponibles() + " naipes en baraja.\n");
                    mazo.mostrarBaraja();
                    break;

                case 2:
                    System.out.println("Baraja mezclada:\n");
                    
                    mazo.barajar();
                    System.out.println("");
                    
                    System.out.println("\nDisponibles: " + mazo.cartasDisponibles() + " naipes en baraja.\n");
                    break;

                case 3:
                    System.out.print("Siguiente naipe: ");

                    System.out.println(mazo.siguienteCarta());

                    System.out.println("\nDisponibles: " + mazo.cartasDisponibles() + " naipes en baraja.\n");
                    break;

                case 4:

                    String opcionSiNo;
                    int cantidadCartas;

                    do {
                        System.out.println("¿Cuántos naipes desea?");
                        cantidadCartas = leer.nextInt();

                        System.out.println("");
                        
                        mazo.darCartas(cantidadCartas);
                        
                        mazo.cartasMonton();
                        
                        System.out.println("Disponibles: " + mazo.cartasDisponibles() + " naipes en baraja.\n");

                        do {
                            System.out.println("¿Desea + naipes? s/n");
                            opcionSiNo = leer.next().toLowerCase();
                            
                            System.out.println("");

                        } while (!opcionSiNo.equals("n") && !opcionSiNo.equals("s"));

                    } while (!opcionSiNo.equals("n"));
                    
                    break;

                case 5:

                    mazo.cartasMonton();

                    System.out.println("Disponibles: " + mazo.cartasDisponibles() + " naipes en baraja.\n");

                    break;

                case 6:
                    System.out.println("Disponibles: " + mazo.cartasDisponibles() + " naipes en baraja.\n");

                    break;
            }
        } while (opcionMenu != 0);
    }
}