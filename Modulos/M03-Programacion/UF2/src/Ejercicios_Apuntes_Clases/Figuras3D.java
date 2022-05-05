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
public class Figuras3D {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float area = 0.0f, volumen = 0.0f;
        float[] area_volumen = new float[2];
        boolean salir = false;
        
        String escogido = "";
        while (!salir) {
            String caracter = entrada.nextLine().toLowerCase();
            boolean no_valido = false;
            switch (caracter) {
                case "c":
                    escogido = "Cilindre";
                    area_volumen = superficieVolumenCilindo(Float.parseFloat(entrada.next()),Float.parseFloat(entrada.next()));
                    entrada.nextLine();
                    break;
                case "h":
                    escogido = "Hexaedre";
                    area_volumen = superficieVolumenHexaedro(Float.parseFloat(entrada.next()));
                    entrada.nextLine();
                    break;
                case "t":
                    escogido = "Tetraedre";
                    area_volumen = superficieVolumenTetraedro(Float.parseFloat(entrada.next()));
                    entrada.nextLine();
                    break;
                case "e":
                    escogido = "Esfera";
                    area_volumen = superficieVolumenEsfera(Float.parseFloat(entrada.next()));
                    entrada.nextLine();
                    break;
                case "s":
                    salir = true;
                    break;
                default:
                    no_valido = true;
                    break;
            }
            if(!salir && !no_valido){
                System.out.printf("==%s==\n",escogido);
                System.out.printf("Superfície: %.2f\n",area_volumen[0]);
                System.out.printf("Volum: %.2f\n",area_volumen[1]);
            }
                
        }

    }

    static float[] superficieVolumenCilindo(float radio, float altura) {
       float[] area_volumen = {(float)((2*Math.PI*radio)*(radio+altura)),(float)(Math.PI*Math.pow(radio, 2)*altura)};
       return area_volumen;
    }

    static float[] superficieVolumenHexaedro(float lado) {
        float[] area_volumen = {(float)(6*Math.pow(lado, 2)),(float)(Math.pow(lado, 3))};
       return area_volumen;
    }

    static float[] superficieVolumenTetraedro(float arista) {
        float[] area_volumen = {(float)(Math.pow(arista, 2)*(Math.sqrt(3))),(float)(Math.sqrt(2)/12*Math.pow(arista, 3))};
       return area_volumen;
    }

    static float[] superficieVolumenEsfera(float radio) {
        float[] area_volumen = {(float)(4*Math.PI*Math.pow(radio, 2)),(float)((4*Math.PI*Math.pow(radio, 3))/3)};
       return area_volumen;
    }
}
