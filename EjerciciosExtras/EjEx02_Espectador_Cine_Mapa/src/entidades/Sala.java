/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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