/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bucles;

/**
 *
 * @author Cole
 */
public class Break_TaulaProducte2 {
    public static void main(String[] args) {
        int valor;
        valor = 10;
        System.out.println("Tabla de multiplicar del numero " +valor);
        for (int i = 1; i <= 10; i++) {
            if (i==5) continue; //break
            System.out.println(valor+" * " + i + " = " + valor*i);
        }
        
    }
}
