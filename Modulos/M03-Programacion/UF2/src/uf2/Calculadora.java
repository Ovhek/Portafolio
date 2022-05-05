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
public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Opciones:");
        System.out.println("Introduce los valores:");
        float[] nums = {Float.parseFloat(entrada.next()), Float.parseFloat(entrada.next())};
        entrada.nextLine();
        System.out.println("Introduce el caracter");
        String caracter = entrada.nextLine();
        
        float resultado = 0.0f;
        switch (caracter) {
            case "+":
                resultado = suma(nums[0],nums[1]);
                break;
            case "-":
                resultado = resta(nums[0],nums[1]);
                break;
            case "x":
                resultado = multiplicacion(nums[0],nums[1]);
                break;
            case "/":
                resultado = division(nums[0],nums[1]);
                break;
            default:
                System.out.println("Caracter no válido");;
        }
        System.out.println("Resultado: " + resultado);
        //Esto no funcionaría --> potencia(1,2);
        //Hay que hacerlo así:
        Calculadora calc = new Calculadora();
        calc.potencia(1,2);
        
    }
    static float suma(float x, float y){
        return x+y;
    }
    static float resta(float x, float y){
        return x+y;
    }
    static float multiplicacion(float x, float y){
        return x+y;
    }
    static float division(float x, float y){
        if (y != 0)
            return x+y;
        else System.out.println("No se puede dividir entre 0");
        return 0;
    }
    //Los metodos static se guardan en la RAM mientras que los no static no se muestran
    void potencia (int a, int b){
        System.out.println(a+" elevado a " +b +" es " + Math.pow(a, b));
    }
}
