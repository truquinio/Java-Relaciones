/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a 
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a 
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar 
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la 
persona.

Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las 
personas con sus respectivos perros.
 */
package servicio;

import Enum.Raza;
import Enum.Tamanio;
import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author FT
 */
public class Service {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //Lista vacía que contendrá todas las Personas que cargue.-
    private ArrayList<Persona> listaPersonas = new ArrayList<>();

    //Lista vacía que contendrá todos los perros que cargue.-
    private ArrayList<Perro> listaPerros = new ArrayList<>();
    
    Persona person = new Persona();
    Perro dog = new Perro();
    
///•    CREAR PERRO:
    public static Perro crearPerro() {
        return new Perro();
    }

///•    LLENAR PERRO con el CONSTRUCTOR.-
    public void llenarPerro() {

        //Con FOR Each recorro el ENUM de RAZA.-
        for (Raza razaForEach : Raza.values()) {

            //Con FOR Each recorro el ENUM de TAMAÑO.-
            for (Tamanio tamanioForEach : Tamanio.values()) {

                //Lleno la LISTA PERROS con un NUEVO PERRO (RAZA y TAMAÑO recorridos por los FOR EACH).-
                this.listaPerros.add(new Perro(razaForEach, tamanioForEach));
            }
        }
    }

    
}