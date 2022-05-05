/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf2;

import java.util.Scanner;

/**
 *
 * @author Cole
 */
public class Menu {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Opciones:");
        System.out.println("1- Entrada de valores");
        System.out.println("2- Mostrar la suma");
        System.out.println("3- Mostrar el producto");
        System.out.println("4- Salir");
        
        int opcion = entrada.nextInt();
        int valores[] = null;
        
        //Mas mantenible y modular
        switch (opcion) {
            case 1:
                //Hacer cosas --> mejor hacerlo en un metodo
                introducirValores(valores);
                break;
            case 2:
                //Hacer cosas --> Mejor hacerlo en un metodo
                //mostrarSuma(valores);
                break;
            case 3:
                //Hacer cosas --> Mejor hacerlo en un metodo
                //mostrarProducto();
                break;
            case 4: 
                //Hacer cosas --> Mejor hacerlo en un metodo
                break;
            default:
                throw new AssertionError();
        }
    }
    
    static void introducirValores (int[] valores){
        System.out.println("Total de valores:");
        int total = entrada.nextInt();
        valores = new int[total];
        int valor = -1;
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Introduce un valor:");
            valor = entrada.nextInt();
            valores[i] = valor;
                    
        }
    }
}
