/*
Trabajo Práctico 7: Herencia y Polimorfismo
Kata 4 - Animales y comportamiento sobreescrito
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package kata4_animales;
public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, String raza) {
        super(nombre, "Perro");
        this.raza = raza;
    }

    @Override
    protected void hacerSonido() {
        System.out.println("Guau guau guau!");
    }  
}