/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a 
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a 
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar 
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la 
persona.

Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las 
personas con sus respectivos perros.
 */
package service;

import java.util.Scanner;

/**
 *
 * @author FT
 */
public class Menu {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Servicio service = new Servicio();

    public void menuOpciones() {

        int opcionMenu = 0;
        boolean opcionLetra = true;

        do {
            do {
                System.out.println("╔══════════════╗");
                System.out.println("║  Elija una opción: ☻  ║");
                System.out.println("╚══════════════╝");

                System.out.println("1. Cargar Persona.");
                System.out.println("2. Cargar Perro.");
                System.out.println("3. Mostrar Persona.");
                System.out.println("4. Mostrar Perro.");
                System.out.println("5. Adoptar Perro.");
                System.out.println("6. Eliminar Persona.");
                System.out.println("7. Eliminar Perro.");
                System.out.println("0. Salir.");

                try {
                    opcionMenu = Integer.parseInt(leer.next());
                    opcionLetra = false;
                    
                } catch (Exception e) {
                    
                    leer.reset();
                }
            } while (opcionLetra);

            //opcionMenu = leer.nextInt();
            System.out.println();

            switch (opcionMenu) {

                case 1:

                    service.crearPersona();

                    System.out.println();

                    break;

                case 2:

                    service.crearPerro();

                    System.out.println();

                    break;

                case 3:

                    service.mostrarPersonas();

                    System.out.println();

                    break;

                case 4:

                    service.mostrarPerros();

                    System.out.println();

                    break;

                case 5:
                    service.adoptarPerro();

                    System.out.println();

                    break;

                case 6:

                    service.eliminarPersonas();

                    break;

                case 7:

                    service.eliminarPerros();

                    break;

                default:

                    System.out.println("Ingrese una opción válida...\n");
            }
        } while (opcionMenu != 0);
    }
}