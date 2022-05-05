/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf3_;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *
 * @author Cole
 */
public class SalidaConsola {
    public static void main(String[] args) {
        try{
            BufferedWriter salida = new BufferedWriter(new OutputStreamWriter(System.out));
            for (int i = 0; i < 10; i++) { 
                String cadena = "3x" + i + " = " + (3*i);
                salida.write(cadena,0,cadena.length());
            }
           
        }catch(IOException e){
            
        }
    }
}
