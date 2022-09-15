package entidades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author FT
 */
public class Espectador {

    private String nombre;
    private int edad, dinero;

///CONSTR:
    public Espectador() {
    }
    public Espectador(String nombre, int edad, int dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

///G & S:
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return this.edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getDinero() {
        return this.dinero;
    }
    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

///ToSTRING:
    @Override
    public String toString() {
        return "Espectador: " + getNombre() + " / Edad: " + getEdad() + " / Dinero: $" + getDinero();
    }
}