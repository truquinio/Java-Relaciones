/*
Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a 
tener que contar con muchas personas y muchos perros. 

El programa deberá preguntarle a cada persona, que perro según su nombre, quiere adoptar. 
Dos personas no pueden adoptar al mismo perro, si la persona eligió un perro que ya estaba adoptado,
se le debe informar a la persona.

Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las 
personas con sus respectivos perros.
 */
package service;

import Enum.Raza;
import Enum.Tamanio;
import entidad.Perro;
import entidad.Persona;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author FT
 */
public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Persona person = new Persona();

    Perro dog = new Perro();

    ArrayList<Persona> listaPersonas = new ArrayList<>();

    ArrayList<Perro> listaPerros = new ArrayList<>();

    public void crearPersona() {

        System.out.println("¿Cuántas personas desea cargar?");
        int cantidadPersonas = leer.nextInt();

///Crear variables auxiliares de nombre, apellido... para que no me escriba solo el última
        String nombre;
        String apellido;
        int edad;
        int dni;

        for (int i = 0; i < cantidadPersonas; i++) {

            System.out.println("\nNombre:");
            nombre = leer.next();

            System.out.println("Apellido:");
            apellido = leer.next();

            System.out.println("Edad:");
            edad = leer.nextInt();

            System.out.println("DNI:");
            dni = leer.nextInt();

            listaPersonas.add(new Persona(nombre, apellido, edad, dni));
        }
    }

    public void crearPerro() {

        System.out.println("¿Cuántos perros desea cargar?");
        int cantidadPerros = leer.nextInt();

//Crear variables auxiliares de nombre, apellido... para que no me escriba solo el último con el FOR.-
        String nombre;
        int edad;
        int posicionRaza;
        int posicionTamanio;

        for (int i = 0; i < cantidadPerros; i++) {

            System.out.println("\nNombre del perro:");
            nombre = leer.next();

            System.out.println("Elija una raza:");

            for (posicionRaza = 0; posicionRaza < Raza.values().length; posicionRaza++) {

                System.out.println(posicionRaza + " " + Raza.values()[posicionRaza]);
            }
            posicionRaza = leer.nextInt();

            /* OTRA FORMA:
            contador = 0;
            
            for (Raza razaForEach : Raza.values()) {
                System.out.println(contador + " " +  razaForEach);
                contador++;
            }
            int elegirRaza = leer.nextInt();*/
            
            System.out.println("Edad del perro:");
            edad = leer.nextInt();

            System.out.println("Tamaño del perro:");

            for (posicionTamanio = 0; posicionTamanio < Tamanio.values().length; posicionTamanio++) {
                System.out.println(posicionTamanio + " " + Tamanio.values()[posicionTamanio]);
            }
            posicionTamanio = leer.nextInt();

            /*OTRA FORMA:
            contador = 0;
            
            for (Tamanio tamanioForEach : Tamanio.values()) {
                System.out.println(tamanioForEach);
            }
            int elegirTamanio = leer.nextInt();*/
            listaPerros.add(new Perro(nombre, Raza.values()[posicionRaza], edad, Tamanio.values()[posicionTamanio]));
        }
    }

    public void mostrarPersonas() {

        System.out.println("Mostrando Personas:\n");

        for (Persona personasForEach : listaPersonas) {
            System.out.println(personasForEach);
        }
    }

    public void mostrarPerros() {

        System.out.println("Mostrando Perros:\n");

        for (Perro perrosForEach : listaPerros) {
            System.out.println(perrosForEach);
        }
    }

    public void adoptarPerro() {

        for (Persona personasForEach : listaPersonas) {

            System.out.println("Para " + personasForEach);

            System.out.println("\nLos perros disponibles son:");

            for (Perro recorrePerrosForEach : listaPerros) {

                //Muestro 
                System.out.println(recorrePerrosForEach);
            }

            System.out.println("Escriba el perro que desea adoptar:");
            String nombrePerro = leer.next();

            if (dog.getNombre().equals(nombrePerro)) {

                for (Perro perroAdoptadoForEach : listaPerros) {

                    System.out.println(perroAdoptadoForEach);

                    if (Objects.isNull(dog.getDueno())) {
                        dog.setDueno(person);

                        System.out.println("¡¡FELICIDADES Adoptaste un perro!!");
                        person.setPerro(dog);

                    } else {

                        System.out.println("Ese perro ya fue adoptado.");
                    }
                }
            } else {
                System.out.println("Perro inexistente.");
            }
        }
    }

///FÁBRICA DE PERSONAS:
    public void fabricaPersonas() {

        System.out.println("¿Cuántas personas desea cargar?");
        int cantidadPersonas = leer.nextInt();

        for (int i = 0; i < cantidadPersonas; i++) {

            listaPersonas.add(new Persona());
        }
    }

///FÁBRICA DE PERROS:
    public void fabricaPerros() {

        System.out.println("¿Cuántos perros desea cargar??");
        int cantidadPerros = leer.nextInt();

        for (int i = 0; i < cantidadPerros; i++) {

            listaPerros.add(new Perro());
        }
    }
}