/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACEPTAELRETO;

import java.util.Scanner;

/**
 *
 * @author Cole
 */
public class Reto_122 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String km = "";
        do {
            String test = entrada.next();
            if(test.equals("-1"))
                break;
            km += test + " ";
            
        } while (true);
        km = km.trim();
        System.out.println("");
        
        
        
    }
}
