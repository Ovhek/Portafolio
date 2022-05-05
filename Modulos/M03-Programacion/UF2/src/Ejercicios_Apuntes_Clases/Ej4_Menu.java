/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Apuntes_Clases;

import java.util.Scanner;

/**
 *
 * @author Cole
 */
public class Ej4_Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String opcio = "";
        do {
            System.out.println("* * * * * * M E N U * * * * * *");
            System.out.println("===============================");
            System.out.println("A - [Ex. 23] Taula divisió entera");
            System.out.println("B - [Ex. 26] Fibonacci");
            System.out.println("C - [Ex. 01] Compta vocals");
            System.out.println("X - SORTIR");
            System.out.print("Tria una opció: ");
            

            opcio = entrada.nextLine().toLowerCase();
            System.out.println("===============================");
            switch (opcio) {
                case "a":
                    DivisionEntera();
                    break;
                case "b":
                    Fibonacci();
                    break;
                case "c":
                    ContarVocales();
                    break;
                case "x":
                    break;
                default:
                    System.out.print("Opció incorrecta!");
            }
            System.out.println("");
        } while (!opcio.equals("x"));
    }
    static void DivisionEntera(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Numero:");
        int num = entrada.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d / %d: quocient =  %d i residu = %d\n",num,i,num/i,num%i);
            
        }
    }
    static void Fibonacci(){
        System.out.println("Numero:");
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        String fibonacci = "1 ";
        int fibonacciCalculo = 0;
        int fibonacciNum1 = 1;
        int fibonacciNum2 = 1;
        if(num > 1){
            fibonacci = "1 1 ";
            if(num > 2){
                for (int i = 0; i < (num-2); i++) {
                    fibonacciCalculo = fibonacciNum1 + fibonacciNum2;
                    fibonacci += fibonacciCalculo+" ";
                    fibonacciNum1 = fibonacciNum2;
                    fibonacciNum2 = fibonacciCalculo;
                }
            }
        }
        System.out.println(fibonacci);
    }
    static void ContarVocales(){
        System.out.println("Frase");
        Scanner entrada = new Scanner(System.in);
        String frase = entrada.nextLine();
        frase = frase.toLowerCase();
        int vocals = 0;
        for (int i = 0; i < frase.length(); i++) {
            switch (frase.charAt(i)) {
                case 'a':
                case 'à':
                case 'á':
                case 'e':
                case 'é':
                case 'è':
                case 'i':
                case 'í':
                case 'ì':
                case 'o':
                case 'ó':
                case 'ò':
                case 'u':
                case 'ú':
                case 'ù':
                case 'ü':
                    vocals++;
                    break;
            }  
        }
        System.out.printf("La frase conté %d vocals.%n",vocals);
    }
}
