package com.michiappone.bank.model;

import java.util.ArrayList;

public class CuentaBancaria {

    private String cbu;
    private Cliente cliente;
    private double saldo = 0;
    private ArrayList<String> historial;

    public CuentaBancaria(String cbu, Cliente cliente) {
        this.cbu = cbu;
        this.cliente = cliente;
        this.historial = new ArrayList<>();
    }

    // Métodos

    public boolean depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            historial.add("DEP " + monto + " OK Saldo: " + saldo);
            return true;
        } else {
            historial.add("DEP " + monto + " FAIL Saldo: " + saldo);
            return false;
        }
    }

    public boolean extraer(double monto) {
        if (monto <= saldo && monto > 0) {
            saldo -= monto;
            historial.add("EXT " + monto + " OK Saldo: " + saldo);
            return true;
        } else {
            historial.add("EXT " + monto + " FAIL Saldo: " + saldo);
            return false;
        }
    }

    public void imprimirHistorial() {
        System.out.println("--- Historial de transacciones ---");
        for (String operacion : historial) {
            System.out.println(operacion);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Cuenta Bancaria:\n" +
                "cbu=" + cbu +
                "\ncliente=" + cliente +
                "\nsaldo=" + saldo;
    }
}
