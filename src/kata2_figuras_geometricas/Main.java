/*
Trabajo Práctico 7: Herencia y Polimorfismo
Kata 2
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package kata2_figuras_geometricas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>(); // 1 crear el array de las figuras
        figuras.add(new Circulo("Circulo 1", 20));
        figuras.add(new Circulo("Circulo 2", 15.66));
        figuras.add(new Rectangulo("Rectangulo 1", 20, 10.1));
        figuras.add(new Rectangulo("Rectangulo 2", 12, 8.4));
        
        for (Figura figura : figuras) {
            System.out.println("===== Figura : " + figura.getNombre() + " =====");
            System.out.printf("Área: %.2f%n", figura.calcularArea());
            System.out.println("------------------------------");
        }
    }
}
