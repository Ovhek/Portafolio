/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_uf2a1_02;

import java.util.Scanner;

/**
 *
 * @author Cole
 */
public class Ej_4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        String[] paises = pedirPaises(num, entrada);
        String pais = entrada.nextLine();
        indexOfBinario(paises, pais);
    }

    static void indexOfBinario(String[] array, String pais) {
        int pasos = 0;

        int valorI = 0;
        int valorF = array.length - 1;

        int indice = 0;
        while (valorI <= valorF) {
            pasos++;
            indice = (valorI + valorF) / 2;

            if (array[indice].equals(pais)) {
                break;
            }

            if (valorI == valorF) {
                break;
            }

            if (array[indice].compareTo(pais) < 0) {
                valorI = indice + 1;
            } else {
                valorF = indice - 1;
            }

        }
        System.out.println("Total passades: " + pasos);
        if(indice == 0)
            System.out.println("No trobat");
        else
            System.out.println("Trobat a la posició: " + indice);

    }

    static String[] pedirPaises(int num, Scanner entrada) {
        entrada.nextLine();
        String[] paises = new String[num];
        for (int i = 0; i < paises.length; i++) {
            paises[i] = entrada.nextLine();

        }
        return paises;
    }
}
