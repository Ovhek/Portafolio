/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenacion;

import java.util.Arrays;

/**
 *
 * @author Cole
 */
public class Ordenacion {
    public static void main(String[] args) {
        int[] numeros = {4,12,7,6,9,5,2};
        Arrays.sort(numeros);
        for (int numero : numeros) {
            System.out.println(numero + " ");
        }
    }
}
