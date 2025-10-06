/*
Trabajo Práctico 7: Herencia y Polimorfismo
Kata 4 - Animales y comportamiento sobreescrito
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package kata4_animales;
public class Gato extends Animal {
    private String raza;

    public Gato(String nombre, String raza) {
        super(nombre, "Gato");
        this.raza = raza;
    }
    
    @Override
    protected void hacerSonido() {
        System.out.println("Miau miaua miauaaau!");
    }

    @Override
    protected void describirAnimal() {
        System.out.println("Soy un gato " + raza + " y me llamo " + nombre);
    }
    
    
}