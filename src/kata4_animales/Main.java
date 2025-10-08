/*
Trabajo Práctico 7: Herencia y Polimorfismo
Kata 4 - Animales y comportamiento sobreescrito
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package kata4_animales;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Firulais", "Dogo"));
        animales.add(new Vaca("Lola", "Angus"));
        animales.add(new Gato("Elmishi", "Persa"));
        
        for (Animal animal : animales) {
            System.out.println(animal.toString());
            System.out.print("Sonido: ");
            animal.hacerSonido();
            System.out.println("Traduccion: ");
            animal.describirAnimal();
            System.out.println("-----------------------------");
        }
    }
}