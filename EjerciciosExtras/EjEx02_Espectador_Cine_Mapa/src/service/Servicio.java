/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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