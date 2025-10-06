/*
Trabajo Práctico 7: Herencia y Polimorfismo
Kata 2
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package kata2_figuras_geometricas;
public class Circulo extends Figura {
    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Figura: " + nombre +
                           " | Radio: " + radio +
                           " | Área: " + calcularArea());
    }    
}
