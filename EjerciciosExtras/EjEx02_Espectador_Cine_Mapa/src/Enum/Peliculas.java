/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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