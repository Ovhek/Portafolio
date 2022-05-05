/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion_orientada_objetos;

/**
 *
 * @author Cole
 */
public class PruebaCuentasBancaria {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria();
        c1.totalCuentas++;
        System.out.println("Total Cuentas = " + c1.totalCuentas);
        c1.movimiento(10000000);
        
        CuentaBancaria c2 = new CuentaBancaria();
        c2.totalCuentas++;
        
        System.out.println("Total Cuentas = " + c2.totalCuentas);
        
        CuentaBancaria.totalCuentas++;
        System.out.println("Total Cuentas = " + CuentaBancaria.totalCuentas);
        
       
    }
}
