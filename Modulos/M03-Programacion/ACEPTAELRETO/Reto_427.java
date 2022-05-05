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
public class Reto_427 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int loops = entrada.nextInt();
        
        entrada.nextLine();
        
        for (int i = 0; i < loops; i++) {
            String personaje = entrada.nextLine();
            String parentesco = entrada.nextLine();
            if(personaje.equals("Luke") && parentesco.equals("padre")){
                System.out.println("TOP SECRET");
            }
            else{
                System.out.println(personaje+", yo soy tu " + parentesco);
            }
        }
    }
}
