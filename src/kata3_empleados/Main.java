/*
Trabajo Práctico 7: Herencia y Polimorfismo
Kata 3 - Empleados y polimorfismo
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package kata3_empleados;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Matias Scalella", "ABC123", 3000000));
        empleados.add(new EmpleadoTemporal("Sol Santoro", "GHI789", 45));
        empleados.add(new EmpleadoPlanta("Magali Matilla", "DEF456", 3000000));
        empleados.add(new EmpleadoTemporal("Nicolas Camps", "JKL101", 30));
        
        System.out.println("========= Empleados de la Empresa =========");
        ArrayList<Empleado> empleadosDePlanta = new ArrayList<>();
        ArrayList<Empleado> empleadosTemporales = new ArrayList<>();
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoPlanta) {
                empleadosDePlanta.add(empleado);
            } else if (empleado instanceof EmpleadoTemporal) {
                empleadosTemporales.add(empleado);
            }
        }   
        
        System.out.println("========= Empleados de Planta =========");
        for (Empleado empleadoDePlanta : empleadosDePlanta) {
            System.out.println(empleadoDePlanta);
        }
        System.out.println("========= Empleados Temporales =========");
        for (Empleado empleadoTemporal : empleadosTemporales) {
                    System.out.println(empleadoTemporal);
                }
    }
}
