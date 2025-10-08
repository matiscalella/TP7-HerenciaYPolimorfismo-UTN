/*
Trabajo Práctico 7: Herencia y Polimorfismo
Kata 5 - Sistema de pagos con polimorfismo y genéricos
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package kata5_sistema_de_pagos;
public class Main {
    public static void main(String[] args) {
        Pagable efectivo = new Efectivo(126565, 200000);
        Pagable transf = new Transferencia("123456789", "987654321", 50230, 60000);
        Pagable tarjCredito = new TarjetaCredito("Matias Camps", "1234 1234 5555 6321", 150000, 3000000, 6);
        
        System.out.println("====== Pago en efectivo====== ");
        procesarPago(efectivo);

        System.out.println("\n====== Pago mediante transferencia ====== ");
        procesarPago(transf);

        System.out.println("\n====== Pago mediante tarjeta de credito ====== ");
        procesarPago(tarjCredito);
    }
    
    public static void procesarPago(Pagable medio) {
        medio.pagar();
    }
}
