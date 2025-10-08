/*
Trabajo Práctico 7: Herencia y Polimorfismo
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package kata1_vehiculos;

public class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
        
    public void mostrarInfo(){
        System.out.println("*** Datos del Vehiculo ***");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }   
}