/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isidora;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cole
 */
public class ISIDORA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader flujoEntrada;
        try {
            flujoEntrada = new BufferedReader(new FileReader("mesures.txt"));
            String texto = "";
            String linea = "";
            while((linea = flujoEntrada.readLine()) != null){
                texto+= linea+"\n";
            }
            String[] numeros = texto.split("\n");
            
            int contador = 0;
            for (int i = 1; i < numeros.length; i++) {
                if(Integer.parseInt(numeros[i]) > Integer.parseInt(numeros[i-1]))
                    contador++;
                
            }
            System.out.println(contador);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ISIDORA.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ISIDORA.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
