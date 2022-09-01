/*
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un 
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba 
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
*/
package Principal;

import java.util.Scanner;

/**
 *
 * @author FT
 */
public class MainPersona {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Dni objDni = new Dni('A', 12345678);
        
        Persona person = new Persona("Fernando", "Chiquito", objDni);
        
        System.out.println("\n" + person + "\n");
        
        System.out.println("__________________________________________\n");
        
        System.out.println("Ingrese nombre y apellido del sujeto:");
        person.setNombre(leer.next());
        person.setApellido(leer.next());
        
        System.out.println("\nIngrese serie y N° de DNI:");
        objDni.setSerie(leer.next().charAt(0));
        objDni.setNumero(leer.nextInt());
        
        System.out.println("\n" + person + "\n");
    }
}