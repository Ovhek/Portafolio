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
public class EJ_Sudoku {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        
        int totalSudokus = entrada.nextInt();
        
        for (int i = 0; i < totalSudokus; i++) {
            //Leemos Sudoku por teclado
            int[][] sudoku = leerSudoku();
            
            //Validamos Sudoku --> Podemos poner condiciones de break en el for de por si xD
            //Comprobamos Filas y Columnas:
            boolean sudokuCorrecto = true;
            for (int j = 0; j < sudoku.length && sudokuCorrecto; j++)
                if(!esFilaValida(sudoku, j) || !esColumnaValida(sudoku, j))
                    sudokuCorrecto = false;
            
            //Comprobamos las Regiones
            if(sudokuCorrecto)
                for (int fila = 0; fila < sudoku.length && sudokuCorrecto; fila+=3)
                    for (int columna = 0; columna < sudoku[i].length && sudokuCorrecto; columna += 3)
                        if(!esRegionValida(sudoku, fila, columna))
                            sudokuCorrecto = false;

            //Imprimimos resultado
            System.out.println(sudokuCorrecto ? "SI" : "NO");
        }

    }

    static int[][] leerSudoku() {
        int[][] sudoku = new int[9][9];

        for (int i = 0; i < sudoku.length; i++)
            for (int j = 0; j < sudoku[i].length; j++)
                sudoku[i][j] = entrada.nextInt();

        return sudoku;
    }

    static boolean esFilaValida(int[][] sudoku, int fila) {
        
        //Tenemos un array de 0s desde el 0 al 8, le sumamos 1 si encontramos esa posicion como numero del array de la fila del sudoku
        int[] comprobacion = new int[9];
        for (int columna = 0; columna < sudoku.length; columna++){
            //Al hacer un return basicamente salimos del metodo devolviendo el valor, por lo que no hace falta un else ya que salimos
            if (comprobacion[sudoku[fila][columna]-1] == 1)
                return false;
            comprobacion[sudoku[fila][columna]-1] = 1;
        }
        return true;
    }

    static boolean esColumnaValida(int[][] sudoku, int col) {
        int[] comprobacion = new int[9];
        for (int fila = 0; fila < sudoku.length; fila++){
            if (comprobacion[sudoku[col][fila]-1] == 1)
                return false;
            comprobacion[sudoku[col][fila]-1] = 1;
        }
        return true;
    }

    static boolean esRegionValida(int[][] sudoku, int filaI, int colI) {
        int[] comprobacion = new int[9];
        
        for (int fila = filaI; fila < filaI+3; fila++){
            for (int columna = colI; columna < colI+3; columna++) {
                if(comprobacion[sudoku[fila][columna]-1] == 1)
                    return false;
                comprobacion[sudoku[fila][columna]-1] = 1;
            }
        }
        return true;
    }
}
