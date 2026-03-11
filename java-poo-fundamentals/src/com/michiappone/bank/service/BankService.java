package com.michiappone.bank.service;

import com.michiappone.bank.model.Cliente;
import com.michiappone.bank.model.CuentaBancaria;
import java.util.ArrayList;

public class BankService{
    private ArrayList<CuentaBancaria> cuentas;

    public BankService() {
        cuentas = new ArrayList<>();
    }
    
    
    //Metodos
    public boolean crearCuenta(String cbu, Cliente cliente){
       CuentaBancaria cuenta = buscarCuenta(cbu);
       
       if(cuenta != null){
           return false;
           
        }else{
           cuenta = new CuentaBancaria(cbu, cliente);
           cuentas.add(cuenta);
           return true;
        }
    }
    
    public CuentaBancaria buscarCuenta(String cbu){
        for (CuentaBancaria cuenta : cuentas) {
            
            if(cuenta.getCbu().equals(cbu)){
                return cuenta;
            }
        } 
        return null;
    }
    
    public boolean depositar(String cbu, double monto){
        CuentaBancaria cuentaDepositar = buscarCuenta(cbu);
        
        if(cuentaDepositar == null){
            return false;
        }
        return cuentaDepositar.depositar(monto);
    }
        
    public boolean extraer(String cbu, double monto){
        CuentaBancaria cuenta = buscarCuenta(cbu);
        
        if(cuenta == null){
            return false;
        }
        return cuenta.extraer(monto); 
    }
    
}

