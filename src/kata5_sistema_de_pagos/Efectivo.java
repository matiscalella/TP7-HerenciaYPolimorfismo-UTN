/*
Trabajo Práctico 7: Herencia y Polimorfismo
Kata 5 - Sistema de pagos con polimorfismo y genéricos
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package kata5_sistema_de_pagos;
public class Efectivo implements Pagable {
    private double monto;         // monto a pagar
    private double entregado;     // dinero entregado por el cliente

    public Efectivo(double monto, double entregado) {
        this.monto = monto;
        this.entregado = entregado;
    }

    @Override
    public void pagar() {
        if (entregado >= monto) {
            double vuelto = entregado - monto;
            System.out.printf("Pago en efectivo realizado. Vuelto: $%.2f%n", vuelto);
        } else {
            System.out.println("Fondos insuficientes para realizar el pago en efectivo.");
        }
    }

    @Override
    public String toString() {
        return String.format("Efectivo [Monto: $%.2f, Entregado: $%.2f]", monto, entregado);
    }
}
