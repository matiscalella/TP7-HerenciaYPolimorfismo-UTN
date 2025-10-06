/*
Trabajo Práctico 7: Herencia y Polimorfismo
Kata 2
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package kata2_figuras_geometricas;
public class Rectangulo extends Figura {
    private double base, altura;
    
    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
        
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Figura: " + nombre + 
                       " | Base: " + base + 
                       " | Altura: " + altura + 
                       " | Área: " + calcularArea());
    }
    
}
