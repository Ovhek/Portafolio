/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_uf2;

import java.util.Scanner;

/**
 *
 * @author Cole
 */
public class JocDeTaula {
    public static void main(String[] args) {
        //Algoritmo Principal
        Scanner entrada = new Scanner(System.in);
        //Para poder colocar ficha;
            // La casilla ha de estar vacía ([i][j] == 0)
            // No puede ser el borde (tocaVora == false)
        
        int MAX_INTENTOS = 11;
        int intentosActuales = 1;
        int fichasColocadas = 0;
        int[][] tablero = creaTauler();
        while(intentosActuales != MAX_INTENTOS){
            System.out.println("Intent " + intentosActuales);
            System.out.print("Fila: ");
            int fila = entrada.nextInt()-1;
            System.out.print("Columna: ");
            int columna = entrada.nextInt()-1;
            
            boolean vora = tocaVora(fila, columna);
            boolean hay_ficha = existeixFitxa(tablero, fila, columna);
            
            if(vora)
                System.out.println("No és vàlida. Toca la vora!");
            else if(hay_ficha)
                System.out.println("No és vàlida. Ja hi ha una fitxa!");
            else{
                System.out.println("Perfecte! La posició és vàlida");
                tablero[fila][columna] = 2;
                fichasColocadas++;
            }
            System.out.println("");
            if (fichasColocadas == 4) break;
            intentosActuales++;
        }
        if(fichasColocadas == 4)
            System.out.println("Enhorabona! Has guanyat!");
        else
            System.out.println("Has perdut!");
        System.out.println("");
        System.out.println("El tauler:");
        mostraTauler(tablero);
    }
    //generar tablero 8x8 --> aleatoriamente llena con fichas blancas (20)
    static int [][] creaTauler(){
        int[][] tablero = new int[8][8];
        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j] = 0;
            }
        }
        
        int pasos = 0;
        while (true) {
            int randomFila = (int)(Math.random()*8);
            int randomColumna = (int)(Math.random()*8);
            if (tablero[randomFila][randomColumna] == 0){
                pasos++;
                tablero[randomFila][randomColumna] = 1;
            }
            if (pasos == 20) break;
        }
        return tablero;
    }
    //Indica cuando una tirada de fichas negras toca la vora.
    static boolean tocaVora(int fila, int columna){
        return !((columna > 0 && columna < 7) && (fila > 0 && fila < 7));
    }
    //Indica si hay una ficha blanca o negra
    static boolean existeixFitxa(int [][]tauler, int fila, int columna){
        return tauler[fila][columna] != 0;
    }
    //Muestra el tablero como en el ejemplo
    static void mostraTauler(int[][] tauler){
        //por lo menos un for estilo foreach
        for (int[] fila : tauler) {
            for (int columna : fila) {
                if (columna == 0)
                    System.out.print("0 ");
                else if (columna == 1)
                    System.out.print("B ");
                else if (columna == 2)
                    System.out.print("N ");
            }
            System.out.println("");
        }
    }
}
