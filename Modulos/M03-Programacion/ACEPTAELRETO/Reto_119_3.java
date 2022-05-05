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
public class Reto_119_3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n = 0;
        int escudos = 0;
        do {
            escudos = 0;
            if (entrada.hasNextInt()) n = entrada.nextInt();
            else entrada.next();
            
            while(true){
                int legionarios = (int)Math.sqrt(n);
                int cabezas = legionarios*legionarios;
                int lados = 4*legionarios;
                escudos += cabezas + lados;
                
                n = n - legionarios*legionarios;
                if(n == 0)
                    break;
            }
            System.out.println(escudos);
        } while (true);

    }
}
