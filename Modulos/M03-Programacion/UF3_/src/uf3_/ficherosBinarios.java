/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf3_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static uf3_.EquiposFutbol_APUNTESFICHEROS.MostrarRanking;
import static uf3_.EquiposFutbol_APUNTESFICHEROS.Ordenar;

/**
 *
 * BINARI:
 *  LECTURA --> FileInputStream
 *              metodo: read() --> lee 1 byte (int)
 *                      read(array de bytes) --> contenido del fichero en el array de bytes 
 *  ESCRITURA --> FileOutputStream
 *              metodo: write(array de bytes) --> escribe el array de bytes
 * @author Cole
 */
public class ficherosBinarios {

    public static void main(String[] args) {
        try {
            FileInputStream fi = new FileInputStream("kitten.bmp");
            

            
            /*for (int i = 0; i < 16; i++) {
                    int valor = fi.read();
                    String representacion = "0"+ Integer.toHexString(valor);
                    System.out.print(representacion.substring(representacion.length()-2,representacion.length()));
                    System.out.print(" ");
            }*/
            
            //Cuantos bytes quedan para leer el fichero
            byte[] buffer = fi.readAllBytes();
            
            fi.read(buffer);
            fi.close();
            for (int i = 0; i < buffer.length; i++) {
                    String representacion = "0"+ Integer.toHexString(buffer[i]);
                    System.out.print(representacion.substring(representacion.length()-2,representacion.length()));
                    System.out.print(" ");
                    
                    if(i%16 == 0 && i!= 0)
                        System.out.println("");
            }
            fi.close();
            
            //Escritura
            FileOutputStream fo = new FileOutputStream("kitten_copia.bmp");
            /*
                buffer[1000] = 0x6B;
                buffer[1001] = (byte)0b10100010;
                buffer[1002] = 39;
            */  
            
            //Desplazamiento bits a la derecha
            // valor >> 1;
            
            fo.write(buffer);
            
            fo.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}
