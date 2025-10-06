/*
Trabajo Práctico 7: Herencia y Polimorfismo
Kata 3 - Empleados y polimorfismo
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package kata3_empleados;
public class EmpleadoPlanta extends Empleado {
    private static final double BONIFICACION_PLANTA = 1.20; // Porcentaje extra por empleado de planta
    private double sueldo;
    
    public EmpleadoPlanta(String nombre, String legajo, double sueldo) {
        super(nombre, legajo);
        this.sueldo = sueldo;
    }

    @Override
    public double calcularSueldo() {
        return sueldo * BONIFICACION_PLANTA;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nTipo de Empleado: Empleado de Planta\n" +
               String.format("Sueldo: $%.2f%n", calcularSueldo());
    }

    
}
