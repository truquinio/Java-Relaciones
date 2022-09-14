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

        //Lleno la LISTA de PERSONAS con FOR, para ingresar c/u de los datos.-
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

        //Lleno la LISTA de PERROS con FOR, para ingresar c/u de los datos.-
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

        //Recorro la LISTA PERSONAS con FOR EACH (MUESTRA PERSONAS).-
        for (Persona muestraPersonas : listaPersonas) {
            System.out.println(muestraPersonas);
        }
    }

    public void mostrarPerros() {

        System.out.println("Mostrando Perros:\n");

        //Recorro la LISTA PERROS con FOR EACH (MUESTRA PERROS).-
        for (Perro muestraPerros : listaPerros) {
            System.out.println(muestraPerros);
        }
    }

///ADOPTAR PERRO:
    public void adoptarPerro() {

        //Recorro la LISTA PERSONAS con FOR EACH (ADOPTANTE).-
        for (Persona adoptante : listaPersonas) {

            System.out.println("Para " + adoptante);

            System.out.println("\nLos perros disponibles son:\n");

            
            for (Perro recorrePerros : listaPerros) {

                //Muestro los perros disponibles.-
                System.out.println(recorrePerros);
            }

            System.out.println("\nEscriba el perro que desea adoptar:");
            String nombrePerro = leer.next();

            //Recorro la LISTA PERROS con FOR EACH (Perro Adoptado).-
            for (Perro perroAdoptado : listaPerros) {

                //Si coincide el NOMBRE y NO tiene DUEÑO (NULL):
                if (perroAdoptado.getNombre().equals(nombrePerro) && Objects.isNull(perroAdoptado.getDueno())) {

                    //Cambio el DUEÑO del PERRO ADOPTADO por la PERSONA ADOPTANTE.-
                    perroAdoptado.setDueno(adoptante);

                    //CAMBIO el PERRO de la PERSONA (ADOPTANTE) por PERRO ADOPTADO.-
                    adoptante.setPerro(perroAdoptado);

                    System.out.println("¡¡FELICIDADES adoptaste un perro!!");

                    break;
                }
                
                //Si el NOMBRE ingresado coincide con alguno de LISTA PERROS y SI tiene DUEÑO (!NULL):
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

        //Recorro la LISTA PERROS con FOR EACH (Por Eliminar).-
        for (Perro porEliminar : listaPerros) {

            //Si el NOMBRE ingresado coincide con alguno de LISTA PERROS y NO tiene DUEÑO (NULL):
            if (porEliminar.getNombre().equals(perroEliminado) && Objects.isNull(porEliminar.getDueno())) {

                //Cambio el PERRO ADOPTADO a NULO en el PERRO de la LISTA PERROS (Por Eliminar).-
                porEliminar.getDueno().setPerro(null);
                
                //REMUEVO el PERRO de la LISTA PERROS (Por Eliminar).-
                listaPerros.remove(porEliminar);

                System.out.println("Perro eliminado");

                break;
            }
        }
    }
    
///ELIMINAR PERSONA:
    public void eliminarPersonas() {

        //MUESTRO las PERSONAS disponibles.-
        mostrarPersonas();

        System.out.println("\nIngrese la persona que desea eliminar");
        String personaEliminada = leer.next();

        //Recorro la LISTA PERSONAS con FOR EACH (Por Eliminar).-
        for (Persona porEliminar : listaPersonas) {

            //Si el NOMBRE ingresado coincide con alguno de LISTA PERSONAS y tiene PERRO ADOPTADO:
            if (porEliminar.getNombre().equals(personaEliminada) && Objects.isNull(porEliminar.getPerro())) {

                //Cambio el DUEÑO a NULO en el PERRO de la LISTA PERSONAS (Por Eliminar).-
                porEliminar.getPerro().setDueno(null);
                
                //REMUEVO la PERSONA de la LISTA PERSONAS (Por Eliminar).-
                listaPersonas.remove(porEliminar);

                System.out.println("Persona eliminada");

                break;
            }
        }
    }

    /*  Iterator<Perro> iteratorPerros = listaPerros.iterator();
        
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