/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_uf2a1_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Cole
 */
public class Ej_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        entrada.nextLine();
        ArrayList<String> paises = pedirPaises(num, entrada);
        
        Collections.sort(paises);
        
        System.out.println("Països ordenats:");
        paises.forEach(pais -> System.out.println(pais));
    }
    
    static ArrayList<String> pedirPaises(int num, Scanner entrada) {
        ArrayList<String> paises = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            paises.add(entrada.nextLine());
            
        }
        return paises;
    }
}
