/*
Trabajo Práctico 7: Herencia y Polimorfismo
Kata 3 - Empleados y polimorfismo
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package kata3_empleados;
public abstract class Empleado {
    protected String nombre;
    protected final String legajo;

    public Empleado(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    @Override
    public String toString() {
        return "Empleado[" + "Nombre: " + nombre + ", Legajo: " + legajo + ']';
    }

    public abstract double calcularSueldo();
    }
