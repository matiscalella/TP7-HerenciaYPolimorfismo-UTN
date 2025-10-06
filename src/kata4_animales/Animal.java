/*
Trabajo Práctico 7: Herencia y Polimorfismo
Kata 4 - Animales y comportamiento sobreescrito
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package kata4_animales;
public class Animal {
    protected String nombre;
    protected String tipo;

    public Animal(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    protected void hacerSonido(){
        System.out.println("Sonido generico del sonido de un animal.");
    }
    
    protected void describirAnimal(){
        System.out.println("Hola, soy un " + tipo + " y mi nombre es " + nombre);
    }

    @Override
    public String toString() {
        return "Animal[" + "Nombre: " + nombre + ", Tipo: " + tipo + ']';
    }
    
    
}
