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

///CREAR PERSONA:
    public void crearPersona() {

        System.out.println("¿Cuántas personas desea cargar?");
        int cantidadPersonas = leer.nextInt();

        //Crear variables auxiliares de nombre, apellido... para que no me escriba solo la última.-
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

///CREAR PERRO:
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
            
            listaPerros.add(new Perro(nombre, Raza.values()[posicionRaza], edad, Tamanio.values()[posicionTamanio]));

            /*OTRA FORMA:
            contador = 0;
            
            for (Tamanio tamanioForEach : Tamanio.values()) {
                System.out.println(tamanioForEach);
            }
            int elegirTamanio = leer.nextInt();*/
        }
    }

///MOSTRAR PERSONA:
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

///ADOPTAR PERRO:
    public void adoptarPerro() {

        for (Persona personasForEach : listaPersonas) {

            System.out.println("Para " + personasForEach);

            System.out.println("\nLos perros disponibles son:\n");

            for (Perro recorrePerrosForEach : listaPerros) {

                //Muestro los perros disponibles.-
                System.out.println(recorrePerrosForEach);
            }

            System.out.println("\nEscriba el perro que desea adoptar:");
            String nombrePerro = leer.next();

            for (Perro perroAdoptado : listaPerros) {

                //Si coincide el NOMBRE y el DUEÑO es NULO:
                if (perroAdoptado.getNombre().equals(nombrePerro) && Objects.isNull(perroAdoptado.getDueno())) {

                    perroAdoptado.setDueno(personasForEach);

                    personasForEach.setPerro(perroAdoptado);

                    System.out.println("¡¡FELICIDADES adoptaste un perro!!");

                    break;
                }
                //Si coincide el NOMBRE, pero el DUEÑO NO es NULO:
                if (perroAdoptado.getNombre().equals(nombrePerro) && !Objects.isNull(perroAdoptado.getDueno())) {

                    System.out.println(nombrePerro + " ya fue adoptado.");

                    break;
                }
                //Si no coincide el NOMBRE y vemos si el NOMBRE tmb coincide con la última posición de la LISTA PERROS.-
                if (!perroAdoptado.getNombre().equals(nombrePerro) && perroAdoptado.getNombre().equals(listaPerros.get(listaPerros.size() - 1).getNombre())) {

                    System.out.println("El perro no existe!");
                }
            }
        }
    }

    /* OTRA FORMA:
        boolean existe = false;
        boolean adoptado = false;
        
        for (Perro perroAdoptadoForEach : listaPerros) {
            
            //Me fijo si el NOMBRE del perro es igual.-
            if (dog.getNombre().equals(nombrePerro)) {
            existe = true;
            if (Objects.isNull(dog.getDueno())) {
            adoptado = false;
            dog.setDueno(person);
            Sysem.out.println("¡¡FELICIDADES adoptaste un perro!!");
            person.setPerro(dog);
            break;
            } else {
            adoptado = true;}
            } else {
            existe = false;}
            }
            if (adoptado == true) {
            System.out.println("Ese perro ya fue adoptado.");
            }
            if (existe == false) { //NO EXISTE!!!!!!
            System.out.println("Perro inexistente.");
            }}*/

///ELIMINAR PERRO:
    public void eliminarPerros() {

        //Muestro los perros disponibles.-
        mostrarPerros();

        System.out.println("\nIngrese el perro que desea eliminar");
        String perroEliminado = leer.next();

        for (Perro porEliminar : listaPerros) {

            if (porEliminar.getNombre().equals(perroEliminado) && Objects.isNull(porEliminar.getDueno())) {

                porEliminar.getDueno().setPerro(null);
                listaPerros.remove(porEliminar);

                System.out.println("Perro eliminado");

                break;
            }
        }
    }
    
///ELIMINAR PERSONA:
    public void eliminarPersonas() {

        //Muestro las personas disponibles.-
        mostrarPersonas();

        System.out.println("\nIngrese la persona que desea eliminar");
        String personaEliminada = leer.next();

        for (Persona porEliminar : listaPersonas) {

            if (porEliminar.getNombre().equals(personaEliminada) && Objects.isNull(person.getPerro())) {

                porEliminar.getPerro().setDueno(null);
                listaPersonas.remove(porEliminar);

                System.out.println("Persona eliminada");

                break;
            }
        }
    }

    /*        Iterator<Perro> iteratorPerros = listaPerros.iterator();
        
        while (iteratorPerros.hasNext()){
        
        if (iteratorPerros.next().getNombre().equals(perroEliminado)) {
        
        iteratorPerros.next().getDueno().getPerro().setDueno(null);
        
        iteratorPerros.remove();
        
        return;
        }
        System.out.println("Perro inexistente.");*/
    
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

        System.out.println("¿Cuántos perros desea cargar?");
        int cantidadPerros = leer.nextInt();

        for (int i = 0; i < cantidadPerros; i++) {

            listaPerros.add(new Perro());
        }
    }
}