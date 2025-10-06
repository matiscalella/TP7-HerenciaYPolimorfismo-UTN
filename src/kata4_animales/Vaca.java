/*
Trabajo Práctico 7: Herencia y Polimorfismo
Kata 4 - Animales y comportamiento sobreescrito
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package kata4_animales;
public class Vaca extends Animal {
    private String raza;

    public Vaca(String nombre, String raza) {
        super(nombre, "Vaca");
        this.raza = raza;
    }
    
    @Override
    protected void hacerSonido() {
        System.out.println("Mmmmmuuuuuuuu!");
    }
    @Override
    protected void describirAnimal() {
        System.out.println("Soy una vaca " + raza + ". Mi nombre es " + nombre + "!");
    }
}