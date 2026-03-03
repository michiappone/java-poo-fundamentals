package com.michiappone.bank;

import com.michiappone.bank.model.Cliente;
import com.michiappone.bank.model.CuentaBancaria;

public class Main {
    public static void main(String[] args) {
    
        Cliente c = new Cliente(1, "Jose Lopez", "426900876");
        CuentaBancaria cuentaC = new CuentaBancaria("0000123456", c);
         
        System.out.println("-- DATOS DEL CLIENTE --");
        System.out.println(c);
        
        System.out.println("Depositar 1500: " + cuentaC.depositar(1500));
        System.out.println("");
        
    
        System.out.println("Saldo Inicial: " + cuentaC.getSaldo());
        System.out.println("");
    
        System.out.println("Extraer -200: " + cuentaC.extraer(-200));
        System.out.println("Saldo: " + cuentaC.getSaldo());
        System.out.println("");
        
        System.out.println("Depositar -500: " + cuentaC.depositar(-500));
        System.out.println("Saldo: " + cuentaC.getSaldo());
        System.out.println("");
        
        System.out.println("Depositar 500: " + cuentaC.depositar(500));
        System.out.println("Saldo: " + cuentaC.getSaldo());
    
    }
  
}
 