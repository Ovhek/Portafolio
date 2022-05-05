/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf1.pa2.alexandrucruceat;

import java.util.Scanner;

/**
 *
 * @author Cole
 */
public class FrequenciaLletres {
    public static void main(String[] args) {
        System.out.println("Introdueix una frase:");
        Scanner entrada = new Scanner(System.in);
        char[] letras = entrada.nextLine().toLowerCase().replace(" ", "").toCharArray();
        
        String letrasunicas = "";
        
        for (int i = 0; i < letras.length; i++) {
            if(!letrasunicas.contains(String.valueOf(letras[i])))
                letrasunicas += String.valueOf(letras[i]);
        }
        
        int[] repetidas = new int[letrasunicas.length()];
        for (int i = 0; i < letras.length; i++) {
            repetidas[letrasunicas.indexOf(String.valueOf(letras[i]))]++;
        }
        
        for (int i = 0; i < repetidas.length; i++) {
            System.out.println(String.valueOf(letrasunicas.charAt(i)).toUpperCase() + ": "+repetidas[i]);
        }
        
    }
}
