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
public class EJEMPLO_DO_WHILE {
    public static void main(String[] args) {
        double quantitatInicial = 100000;
        double quantiat = quantitatInicial;
        double interes = 5;
        int anys = 0;
        do {
            quantiat += quantiat*interes/100;
            ++anys;
        } while (quantiat < 2* quantitatInicial);
        System.out.println("La quantitat inicial és = " + quantitatInicial);
        
        System.out.println("El interes es * "+ interes);
        System.out.println("La quantita final es = " + quantiat);
        System.out.println("El nombre d'anys es = " + anys);
    }
}
