/*
Trabajo Práctico 7: Herencia y Polimorfismo
Kata 5 - Sistema de pagos con polimorfismo y genéricos
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package kata5_sistema_de_pagos;
public class TarjetaCredito implements Pagable {
    private String titular;
    private String numeroDeTarjeta;
    private double monto;
    private double limiteDisponible;
    private int cuotas;
    private double tasaTotal;

    public TarjetaCredito(String titular, String numeroDeTarjeta, double monto, double limiteDisponible, int cuotas) {
        if (monto < 0) throw new IllegalArgumentException("El monto debe ser mayor a cero.");
        if (cuotas < 1 || cuotas > 12) throw new IllegalArgumentException("Cuotas 1..12");
        if (limiteDisponible < 0) throw new IllegalArgumentException("El limite disponible debe ser mayor a cero.");
        this.titular = titular;
        this.numeroDeTarjeta = numeroDeTarjeta;
        this.monto = monto;
        this.limiteDisponible = limiteDisponible;
        this.cuotas = cuotas;
        this.tasaTotal = tasaTotalPorCuotas(cuotas);
    }
    
    private String enmascararNumero() {
        return "**** **** **** " + numeroDeTarjeta.substring(numeroDeTarjeta.length() - 4);
    }

    private static double tasaTotalPorCuotas(int cuotas) {
        if (cuotas < 1 || cuotas > 12) throw new IllegalArgumentException("Cuotas 1..12");
        switch (cuotas) {
            case 1, 2, 3: return 0.00;   // 0%
            case 4: return 0.06;         // 6%
            case 5: return 0.08;         // 8%
            case 6: return 0.10;         // 10%
            case 7: return 0.14;         // 14%
            case 8: return 0.18;         // 18%
            case 9: return 0.22;         // 22%
            case 10: return 0.27;        // 27%
            case 11: return 0.32;        // 32%
            case 12: return 0.38;        // 38%
            default: return 0.0;
        }
    }        

    @Override
    public void pagar() {
        if (monto < 0) {
            System.out.println("Pago rechazado: El monto es invalido.");
            return;
        }
        if (cuotas < 1 || cuotas > 12) {
            System.out.println("Pago rechazado: cantidad de cuotas inválida.");
            return;
        }
        double total = monto *( 1 + tasaTotal);
        if (total > limiteDisponible) {
            System.out.println("Pago rechazado: límite insuficiente: $" + limiteDisponible);
            return;
        }
        double cuotaMensual = total / cuotas;
        System.out.println("Pago con Tarjeta: " + enmascararNumero() + " APROBADO.");
        System.out.println("Titular: " + titular);
        System.out.println("Cuotas: " + cuotas);
        System.out.println("Tasa total: " + tasaTotal);
    }

    @Override
    public String toString() {
        return "TarjetaCredito[" + "Titular: " + titular + ", Numero: " + enmascararNumero() 
                + ", Monto: " + monto + ", Limite disponible: " + limiteDisponible
                + ", Cuotas: " + cuotas + ", Tasa total: " + tasaTotal + ']';
    }
}