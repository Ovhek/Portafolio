/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion_orientada_objetos;

import programacion_orientada_objetos.GOS;

/**
 *
 * @author Cole
 */
public class PROGRAMACION_ORIENTADA_OBJETOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GOS chiki = new GOS();
        //Cambiando una variable privada
        chiki.setNom("Chiki");
        chiki.raza = "Chihuahua";
        chiki.nombrePotes = 4;
        
        Math.sqrt(0);
        GOS[] gossos = new GOS[10];
        gossos[0] = chiki;
        for (int i = 0; i < gossos.length; i++) {
            if(gossos[i] != null){
                gossos[i].mostrarPedigri();
                System.out.println(""); 
            }
        }
    }
    
}
