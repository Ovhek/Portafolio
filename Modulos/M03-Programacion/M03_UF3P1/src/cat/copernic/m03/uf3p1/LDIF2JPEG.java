/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03.uf3p1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Cole
 */
public class LDIF2JPEG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Pedir nombre de fichero
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el nombre del fichero:");
        String nombrefichero = entrada.nextLine();
        try {
            BufferedReader flujoEntrada = new BufferedReader(new FileReader("datos/"+nombrefichero));
            
            String texto = "";
            String linea = "";
            
            while((linea = flujoEntrada.readLine()) != null){
                texto+= linea+"\n";
            }
            int numero_fotos = texto.split("jpegphoto").length-1;
            
            String[] fotos_base64 = new String[numero_fotos];
            
            for (int i = 0; i < fotos_base64.length; i++) {
                fotos_base64[i] = texto.split("jpegphoto::")[i+1].split("loginshell")[0].replace(" ", "").replace("\n", "");
                String nombreImagen = "";
                if(i+1 >= texto.split("uid:").length)
                    nombreImagen = "no_uid_img_"+i;
                else
                    nombreImagen = texto.split("uid:")[i+1].split("uidnumber:")[0].trim();
                StringToPhoto(fotos_base64[i], nombreImagen+".jpg");
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    static byte [] decode(char [] val){
        byte[] resultado = new byte[3];
        for (int i = 0; i < 3; i++) {
            if(i == 0)
                resultado[i] = (byte)((codiBase64(val[i])<<2) | ((codiBase64(val[i+1]))>>4));
            else if(i == 1)
                resultado[i] = (byte)((codiBase64(val[i])<<4) | ((codiBase64(val[i+1]))>>2));
            else if (i == 2)
                resultado[i] = (byte)((codiBase64(val[i])<<6) | ((codiBase64(val[i+1]))));
        }
        
        return resultado;
    }

    static void StringToPhoto(String datos, String nombreFichero){
        char[] caracteresfoto = datos.toCharArray();
        byte[] buffer = new byte[caracteresfoto.length/4*3];
        for (int i = 0,j=0; i < caracteresfoto.length; i+=4,j+=3) {
            byte[] bytesdecodificados = new byte[3];
            if(j+2 < buffer.length){
                bytesdecodificados = decode(new char[]{caracteresfoto[i],caracteresfoto[i+1],caracteresfoto[i+2],caracteresfoto[i+3]});
                buffer[j] = bytesdecodificados[0];
                buffer[j+1] = bytesdecodificados[1];
                buffer[j+2] = bytesdecodificados[2];
            } 
        }
        
        try {
            FileOutputStream fo = new FileOutputStream("imagenes/"+nombreFichero);
            fo.write(buffer);
            fo.close();
            
            System.out.println("Se han generado la imagen "+nombreFichero +" correctamente.");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    static int codiBase64(char caracter) {
        int resultat = -1;        
        if (caracter >= 'A' && caracter <= 'Z')
            resultat = caracter - 'A';
        else if (caracter >= 'a' && caracter <= 'z')
            resultat = 26 + caracter - 'a';
        else if (caracter >= '0' && caracter <= '9')
            resultat = 52 + caracter - '0';
        else if (caracter == '+')
            resultat = 62;
        else if (caracter == '/')
            resultat = 63;                
        return resultat; 
    }
}
