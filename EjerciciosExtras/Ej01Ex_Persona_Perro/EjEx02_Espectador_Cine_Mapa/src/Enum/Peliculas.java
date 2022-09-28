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
package Enum;

/**
 *
 * @author FT
 */
public enum Peliculas {

    AVENGERS("Avengers", 3, "#1", 13),
    TITANIC("Titanic", 3, "#2", 13),
    SHREK("Shrek", 1.5, "#3", 1),
    TERMINATOR("Terminator", 2, "#4", 18),
    PINOCHO("Pinocho", 1, "#5", 1),
    LA_SIRENITA("La Sirenita", 2, "#6", 1),
    BUZZLIGHTYEAR("Buzz Lightyear", 2, "#7", 1),
    XMEN("X-men", 2.5, "#8", 18);

    private String titulo;
    private Double duracion;
    private String director;
    private int edad_minima;

///CONSTR:
    private Peliculas(String titulo, Double duracion, String director, int edad_minima) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.director = director;
        this.edad_minima = edad_minima;
    }

    private Peliculas(String titulo, int duracion, String director, int edad_minima) {
        this.titulo = titulo;
        this.duracion = (double) duracion;
        this.director = director;
        this.edad_minima = edad_minima;
    }

///G & S:
    public String getTitulo() {
        return titulo;
    }
    public int getEdadMinima() {
        return edad_minima;
    }
    public Double getDuracion() {
        return duracion;
    }
    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public int getEdad_minima() {
        return edad_minima;
    }
    public void setEdad_minima(int edad_minima) {
        this.edad_minima = edad_minima;
    }
    
///ToSTRING:
    @Override
    public String toString() {
        return "" + this.titulo + " / Duración: " + this.duracion + " / Director: " + this.director
                + " / Edad Min: " + this.edad_minima;
    }
}