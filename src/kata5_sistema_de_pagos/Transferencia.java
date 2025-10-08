/*
Trabajo Práctico 7: Herencia y Polimorfismo
Kata 5 - Sistema de pagos con polimorfismo y genéricos
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package kata5_sistema_de_pagos;
public class Transferencia implements Pagable {
    private String cuentaOrigen;
    private String cuentaDestino;
    private double monto;
    private double saldoDisponible;
    private double comision;

    public Transferencia(String cuentaOrigen, String cuentaDestino, double monto, double saldoDisponible) {
        if (monto < 0) throw new IllegalArgumentException("El monto debe ser mayor a cero.");
        if (cuentaOrigen == null || cuentaDestino == null) throw new IllegalArgumentException("Ingrese cuenta de origen/destino valida.");
        if (saldoDisponible <= 0) throw new IllegalArgumentException("El saldo disponible debe ser mayor a cero.");
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
        this.monto = monto;
        this.saldoDisponible = saldoDisponible;
        this.comision = 0.02;
    }

    @Override
    public void pagar() {
        if (monto <= 0) throw new IllegalArgumentException("El monto debe ser mayor a 0.");
        double total = monto + (monto * comision);
        if (total > saldoDisponible) {
            throw new IllegalArgumentException("La cuenta de Origen no tiene saldo disponible.");
        } else {
            saldoDisponible -= total;
            System.out.println("Transferencia realizada con exito.");
            System.out.printf("Monto: $%.2f%n", monto);
            System.out.printf("Comisión (%.0f%%): $%.2f%n", (comision * 100), (monto * comision));
            System.out.printf("Total debitado: $%.2f%n", total);   
        }    
    } 
    
    @Override
    public String toString() {
        return "Transferencia[" + "Origen: " + cuentaOrigen 
                + ", Monto: $" + monto + ", Destino: " + cuentaDestino 
                + ", Comision: " + comision*100 +"% ]";
    }
}
