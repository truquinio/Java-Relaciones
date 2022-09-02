/*
Realizar un programa para que una Persona pueda adoptar un Perro. 
Vamos a contar de dos clases:

• Perro, que tendrá como atributos: nombre, raza, edad y tamaño;
• Persona con atributos: nombre, apellido, edad, documento y Perro.

Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que 
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde 
la clase Persona, la información del Perro y de la Persona.
 */
package Principal;

/**
 *
 * @author FT
 */
public class MainPersonaPerro {

    public static void main(String[] args) {
        
        Perro dog1 = new Perro("Chiquito", "Beagle", 3, "Chico");
        
        Perro dog2 = new Perro("Grandote", "Dálmata", 2, "Grande");
        
        Persona person1 = new Persona("Lalo", "Landa", 23, 87654321, dog1);
        
        Persona person2 = new Persona("Pepe", "Sarasa", 41, 12345678, dog2);
        
        System.out.println(person1.toString() + "\n");
        
        System.out.println(person2.toString() + "\n");
    }
}