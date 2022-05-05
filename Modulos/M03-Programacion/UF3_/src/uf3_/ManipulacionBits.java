/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf3_;

/**
 *
 * @author Cole
 */
public class ManipulacionBits {
    public static void main(String[] args) {
        int valor = 0x3C;
        
        
        //X[*/](2/(2^(n+1)))
        //Se multiplica el numero por  2/(2^(n+1)) --> 60*(2/(2^(4+1)))
        System.out.println(valor>>4);
        System.out.println(valor);
        //Division entre 2/(2^(n+1)) --> 60/(2^(1+1))
        System.out.println(valor<<1);
        
        //AND de bits
        System.out.println(valor & 0b00001111);
        
        //OR de bits
        System.out.println(valor | 0b00000001);
    }
}
