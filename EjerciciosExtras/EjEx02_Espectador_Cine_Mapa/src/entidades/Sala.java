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
package entidades;

import Enum.Peliculas;

/**
 *
 * @author FT
 */
public class Sala {
    
    private int precio;
    public Peliculas pelicula;
    private boolean[][] asientos; // TRUE = Ocupado.-

///CONSTR:    
    public Sala(int filas, int columnas, int precio, Peliculas pelicula) {
        this.asientos = new boolean[filas][columnas];
        this.precio = precio;
        this.pelicula = pelicula;
    }

///G & S:
    public int getPrecio() {
        return this.precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public boolean[][] getAsientos() {
        return this.asientos;
    }
    public void setAsientos(boolean[][] asientos) {
        this.asientos = asientos;
    }
    public Peliculas getPelicula() {
        return this.pelicula;
    }
    public void setPelicula(Peliculas pelicula) {
        this.pelicula = pelicula;
    }

///ToSTRING:    
    @Override
    public String toString() {
        return "Película // " + this.pelicula + " / Precio: $" + this.precio;
    }

    public void mostrarAsientos() {
        // 65 = "A" segun esto https://elcodigoascii.com.ar/
        // Entonces (char) (65) me da la letra A
        System.out.println();
        
        for (int fila = this.asientos.length - 1; fila >= 0; fila--) {
            
            for (int columna = 0; columna < this.asientos[fila].length; columna++) {
                
                if (asientos[fila][columna]) {
                    
                    System.out.print((fila + 1) + " " + ((char) (65 + columna)) + " ☻");
                    
                } else {
                    
                    System.out.print((fila + 1) + " " + ((char) (65 + columna)) + " ○");
                }
                if (columna < this.asientos[fila].length - 1)
                    
                    System.out.print(" |");
                
                if (columna == this.asientos[fila].length - 1)
                    
                    System.out.println();
            }
        }
        System.out.println();
    }

    public void setAsiento(int fila, int columna, boolean ocupado) {
        this.asientos[fila][columna] = ocupado;
    }
}