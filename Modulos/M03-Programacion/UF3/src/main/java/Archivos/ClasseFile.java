/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.File;

/**
 *
 * @author Cole
 */
public class ClasseFile {
    public static void main(String[] args) {
        File fichero = new File("c:/Users/Alex/Escritorio/Aya slaves.txt");
        
        System.out.println("Nombre del fichero: " + fichero.getName());
    }
}
