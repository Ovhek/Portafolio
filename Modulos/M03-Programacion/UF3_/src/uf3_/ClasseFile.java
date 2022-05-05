/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf3_;

import java.io.File;

/**
 *
 * @author Cole
 */
public class ClasseFile {
    public static void main(String[] args) {
        File fichero = new File("c:/Users/Alex/Desktop/");
        
        if(fichero.exists()){
            System.out.println("El fichero existe.");
            System.out.println("Nombre del fichero: " + fichero.getName());
            System.out.println("Ruta absoluta");
            System.out.println(fichero.getAbsolutePath());
            
            if (fichero.canRead())
                System.out.println("El fichero se puede leer");
            else
                System.out.println("El fichero no se puede leer");
            if(fichero.canWrite())
                System.out.println("El fichero se puede modificar");
            else
                System.out.println("El fichero no se puede modificar");
            
            System.out.println("La longitud del fichero es: " + fichero.length());
        }
        else
            System.out.println("El fichero no existe");
        
        if (fichero.isDirectory())
            System.out.println("Es una carpeta");
        else
            System.out.println("Es un fichero");
    }
}
