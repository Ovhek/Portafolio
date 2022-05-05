/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACEPTAELRETO;

import java.util.Scanner;

/**
 * https://www.aceptaelreto.com/problem/statement.php?id=407
 * @author Cole
 */
public class Reto_407 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int c, p, t;
        do{
            //la cantidad de casillas c del tablero
            c = entrada.nextInt();
            //la posición p en la que está la ficha del jugador
            p = entrada.nextInt();
            //número t obtenido en la última tirada de dados.
            t = entrada.nextInt();
            
            int x = c - (p+t);
            
            int posicionFinal = (x >= 0) ? c-x : c+x;
            
            if((c == 0 && p == 0 && t == 0)) break;
            
            System.out.println(posicionFinal);
            
        }while(true);
    }
}
