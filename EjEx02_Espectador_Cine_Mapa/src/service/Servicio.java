/*
Nos piden hacer un programa sobre un Cine, que tiene una cine con un conjunto de asientos 
(8 filas por 6 columnas). 

De Cine nos interesa conocer la película que se está reproduciendo, la cine con los espectadores
y el precio de la entrada. 

Luego, de las películas nos interesa saber el título, duración, edad mínima y director.

Por último, del espectador, nos interesa saber su nombre, edad y el dinero que tiene disponible.

Para representar la cine con los espectadores vamos a utilizar una matriz. Los asientos son 
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en 
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta 
ocupado se muestra una X, sino un espacio vacío.

8AX|8BX|8CX|8D |8EX|8FX 
7AX|7BX|7CX|7DX|7E |7FX 
6AX|6BX|6C |6DX|6EX|6F 
5AX|5BX|5CX|5DX|5EX|5FX 
4AX|4BX|4CX|4DX|4EX|4FX 
3AX|3BX|3CX|3D |3EX|3FX 
2AX|2B |2CX|2DX|2EX|2F 
1AX|1BX|1CX|1DX|1EX|1FX

Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los 
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este 
ocupado el asiento).

Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se 
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio 
libre en la cine y si tiene la edad requerida para ver la película. En caso de que el asiento este 
ocupado se le debe buscar uno libre.

Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de 
cada asiento o solo las X y espacios vacíos.
 */
package service;

import entidades.Espectador;
import entidades.Sala;
import java.util.Scanner;

/**
 *
 * @author FT
 */
public class Servicio {

    public static Scanner leer = new Scanner(System.in);

///CREAR ESPECTADOR:
    public static Espectador crearEspectador() {

        System.out.println("Nombre:");
        String nombre = leer.nextLine();

        System.out.println("Edad:");
        int edad = Integer.valueOf(leer.nextLine());

        System.out.println("Dinero:");
        int dinero = Integer.valueOf(leer.nextLine());

        return new Espectador(nombre, edad, dinero);
    }

///CREAR ESPECTADOR ALEATORIO:    
    public static Espectador crearEspectadorRandom(int minimo, int maximo) {
        
        String nombre = "Espectador " + aleatorio(1, minimo * maximo);
        
        return new Espectador(nombre, aleatorio(1, 100), aleatorio(0, 5000));
    }

    
    public static int aleatorio(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

///AGREGAR ESPECTADOR ALEATORIO:    
    public static void agregarEspectadoresRandom(Sala sala, int cantidad_personas) {
        
        Espectador espectador;
        
        int filas = sala.getAsientos().length;
        int columnas = sala.getAsientos()[0].length;
        int num_fila, num_columna;
        boolean ocupado;

        for (int i = 0; i < cantidad_personas; i++) {
            
            espectador = crearEspectadorRandom(filas, columnas);
            
            if (espectador.getEdad() < sala.getPelicula().getEdadMinima()) {
                
                System.out.println("\n" + espectador.getNombre() + " tiene " + espectador.getEdad() + " años. No cumple la edad mínima.");
                
                continue;
            }
            
            if (espectador.getDinero() < sala.getPrecio()) {
                
                System.out.println("\n" + espectador.getNombre() + " tiene $" + espectador.getEdad() + ". No puede pagar la entrada.");
                
                continue;
            }
            
            System.out.println("\nUbicando a " + espectador.getNombre() + "...");
            
            do {
                num_fila = aleatorio(0, filas - 1);
                
                num_columna = aleatorio(0, columnas - 1);
                
                ocupado = sala.getAsientos()[num_fila][num_columna];
                
                if (ocupado) {
                    
                    System.out.println("El asiento esta ocupado, reubicando...");
                    
                }
                
            } while (ocupado);
            
            System.out.println(espectador.getNombre() + " ubicado en fila: " + (num_fila + 1) + " / columna: " + ((char) (65 + num_columna)));
            
            sala.setAsiento(num_fila, num_columna, true);
        }
    }
}