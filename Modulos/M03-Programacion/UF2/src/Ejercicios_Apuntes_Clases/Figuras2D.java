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
public class Figuras2D {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        
        float area = 0.0f, perimetro = 0.0f;
        float[] area_perimetro = new float[2];
        boolean salir = false;
        String escogido = "";
        while(!salir){
            String caracter = entrada.nextLine().toLowerCase();
            switch (caracter) {
                case "q":
                    escogido = "Quadrat";
                    area_perimetro = areaPerimetroCuadrado(Float.parseFloat(entrada.next()));
                    entrada.nextLine();
                    break;
                case "r":
                    escogido = "Rectangle";
                    area_perimetro = areaPerimetroRectangulo(Float.parseFloat(entrada.next()), Float.parseFloat(entrada.next()));
                    entrada.nextLine();
                    break;
                case "t":
                    escogido = "Triangle isòsceles";
                    area_perimetro = areaPerimetroTriangulo(Float.parseFloat(entrada.next()), Float.parseFloat(entrada.next()));
                    entrada.nextLine();
                    break;
                case "c":
                    escogido = "Cercle";
                    area_perimetro = areaPerimetroCiruclo(Float.parseFloat(entrada.next()));
                    entrada.nextLine();
                    break;
                case "s":
                    salir = true;
                    break;
            }
            if(!salir){
                System.out.printf("==%s==\n",escogido);
                System.out.printf("Perímetre : %.2f\n",area_perimetro[1]);
                System.out.printf("Superfície: %.2f\n",area_perimetro[0]);
            }
                
        }

    }
    static float[] areaPerimetroCuadrado(float lado){
       float[] area_perimetro = {lado*lado,lado*4};
       return area_perimetro;
    }
    static float[] areaPerimetroRectangulo(float lado_a, float lado_b){
       float[] area_perimetro = {lado_a*lado_b,lado_a*2+lado_b*2};
       return area_perimetro;
    }
    static float[] areaPerimetroTriangulo(float lado, float diagonal){
        float[] area_perimetro = {(float)((diagonal/4)*Math.sqrt(4*Math.pow(lado, 2)-Math.pow(diagonal, 2))),(float)(lado*2+diagonal)};
       return area_perimetro;
    }
    static float[] areaPerimetroCiruclo(float radio){
        float[] area_perimetro = {(float)(Math.PI*Math.pow(radio, 2)),(float)(2*Math.PI*radio)};
       return area_perimetro;
    }
    
}
