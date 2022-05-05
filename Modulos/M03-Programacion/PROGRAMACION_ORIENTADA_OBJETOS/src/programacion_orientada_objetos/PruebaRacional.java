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
public class PruebaRacional {
    public static void main(String[] args) {
        Racional a = new Racional(2,3);
        Racional b = new Racional(3,4);
        
        System.out.println(a);
        System.out.println(b);
        
        a.producto(b);
        System.out.println(a);
        
        a.sumar(b);
        System.out.println(a);
        
        
        
    }
}
