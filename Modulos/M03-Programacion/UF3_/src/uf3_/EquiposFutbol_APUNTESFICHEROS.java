/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uf3_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Cole
 */
public class EquiposFutbol_APUNTESFICHEROS {
    public static void main(String[] args) {
        
        try 
        {
            //Ficheros de texto
            //Leemos y escribimos lineas de texto.
            
            //Lectura:      FileReader(nombreFichero) --> flujo
            //Filtro:       BufferedReader(flujo)
            FileReader ficheroEntrada = new FileReader("m03_equipos_futbol.txt");
            BufferedReader flujoEntrada = new BufferedReader(ficheroEntrada);
            //Alternativa --> BufferedReader flujoEntrada = new BufferedReader(new FileReader("m03_equipos_futbol.txt"));
            int totalPartidos = Integer.parseInt(flujoEntrada.readLine());
            System.out.println("Total partidos: "+totalPartidos);
            
            String[] equipos = new String[totalPartidos*2];
            int[] puntuacion = new int[equipos.length];
            
            for (int i = 0; i < totalPartidos; i++) {
                String partido = flujoEntrada.readLine();
                String equipo1 = partido.split("-")[0].split(":")[0];
                equipos[i*2] = equipo1;
                int golesEquipo1 = Integer.parseInt(partido.split("-")[0].split(":")[1]);
                
                
                String equipo2 = partido.split("-")[1].split(":")[0];
                equipos[2*i+1] = equipo2;
                int golesEquipo2 = Integer.parseInt(partido.split("-")[1].split(":")[1]);
                
                if(golesEquipo1 > golesEquipo2)
                    puntuacion[i*2]+=3;
                else if(golesEquipo1 < golesEquipo2)
                    puntuacion[2*i+1]+=3;
                else if(golesEquipo1 == golesEquipo2){
                     puntuacion[i*2]++;
                     puntuacion[2*i+1]++;
                }   
            }
            flujoEntrada.close();
            //Ordenar
            Ordenar(equipos, puntuacion);
            MostrarRanking(equipos, puntuacion);
            
            //Escritura:    FileWriter(nombreFichero) --> flujo
            //Filtro:       BufferedWriter(flujo)
            BufferedWriter flujoSalida = new BufferedWriter(new FileWriter("ficheroSalida.txt"));
            
            for (int i = 0; i < puntuacion.length; i++) {
                flujoSalida.write(String.format("%s | puntos: %d\n", equipos[i], puntuacion[i]));
            }
            //ficheroEntrada.readline()     --> Lee una linea (String)
            //ficheroSalida.write(String)   --> Escribe en el fichero (String)
            
            
            //cerramos los ficheros
            flujoSalida.close();
            
            
            //Salir de un bucle while que lee todas las lineas:
            //if(fichero.readLine() == null) break;
            //while(variable = entrada.readLine() != null)
        } catch (FileNotFoundException ex) 
        {
            //Imprime el recorrido hasta el error.
            System.out.println("Error (File Not Found): "+ex.getMessage());
            
        }catch (IOException ioe){
            System.out.println("Error: (Input/Output)"+ioe.getMessage());
        }
        
    }
    static void MostrarRanking(String[] equipos, int[] puntuaciones){
        for (int i = 0; i < puntuaciones.length; i++) {
            System.out.printf("%s | puntos: %d\n", equipos[i], puntuaciones[i]);
            
        }
    }
    static void Ordenar(String equipos[], int [] puntuaciones){
        int n = puntuaciones.length;
        int temp = 0;
        String temp2 = "";
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (puntuaciones[j - 1] < puntuaciones[j]) {
                    //swap elements  
                    temp = puntuaciones[j - 1];
                    puntuaciones[j - 1] = puntuaciones[j];
                    puntuaciones[j] = temp;
                    
                    temp2 = equipos[j - 1];
                    equipos[j - 1] = equipos[j];
                    equipos[j] = temp2;
                }

            }
        }

    }
}
