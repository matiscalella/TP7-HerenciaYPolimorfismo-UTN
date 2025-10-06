/*
Trabajo Práctico 7: Herencia y Polimorfismo
Kata 2
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package kata2_figuras_geometricas;
public abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public abstract double calcularArea();
    
    public void mostrarInfo(){
        System.out.println("Nombre de la figura: " + nombre);
        System.out.println("Area: " + calcularArea());
    }
}
