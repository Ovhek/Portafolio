/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicis_UF2;

import java.util.Scanner;

/**
 *
 * @author Cole
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            int num1 = 0, num2 = 0;
            String cadena = entrada.nextLine();
            if (cadena.equals("S")) break;
            num1 = Integer.parseInt(cadena);
            num2 = Integer.parseInt(entrada.nextLine());
            String caracter = entrada.nextLine();
            switch (caracter) {
                case "+":
                    sumar(num1, num2);
                    break;
                case "-":
                    restar(num1, num2);
                    break;
                case "x":
                    multiplicar(num1, num2);
                    break;
                case "/":
                    dividir(num1, num2);
                    break;
                case " ":
                    salir = true;
                    break;
            }
        }
    }

    static void sumar(int x, int y) {
        System.out.printf("%d + %d = %d\n", x, y, x + y);
    }

    static void restar(int x, int y) {
        System.out.printf("%d - %d = %d\n", x, y, x - y);
    }

    static void multiplicar(int x, int y) {
        System.out.printf("%d x %d = %d\n", x, y, x * y);
    }

    static void dividir(int x, int y) {
        if (y != 0) {
            System.out.printf("%d / %d = %d\n", x, y, x / y);
        } else {
            System.out.println("No es pot dividir per 0.");
        }
    }
}
