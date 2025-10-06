/*
Trabajo Práctico 7: Herencia y Polimorfismo
Kata 3 - Empleados y polimorfismo
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package kata3_empleados;
public class EmpleadoTemporal extends Empleado {
    private static final double VALOR_HORA = 30000; // Porcentaje extra por trabajo temporal
    private int horasTrabajadas;

    public EmpleadoTemporal(String nombre, String legajo, int horasTrabajadas) {
        super(nombre, legajo);
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSueldo() {
        return VALOR_HORA * horasTrabajadas;
    }
    
    @Override
    public String toString() {
        return super.toString() +
               "\nTipo de Empleado: Empleado Temporal\n" +
               "Horas trabajadas: " + horasTrabajadas + "\n" +
               String.format("Sueldo: $%.2f%n", calcularSueldo());
    }
}
