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
public class NomsICognoms {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //a) Amb el llistat de l’exemple anterior, fes un array de String que contingui els diferents noms amb els seus cognoms tal i com apareixen al llistat.
        String[] nomsComplets = {
                                    "Torres Hernández, Pere",
                                    "Majoral Gatell, Anna",
                                    "Pérez Gomis, Josep",
                                    "López López, Rosa",
                                    "Camps García, Ricard",
                                    "Sánchez Pasqual, Carles",
                                    "Mengual Sánchez, Gemma",
                                    "Puig Soler, Jordi"
                                };
        mostraNoms(nomsComplets);
        
        System.out.println("");
        System.out.print("Introdueix un nom: ");
        String nom = entrada.nextLine();
        cercaBinaria(nomsComplets, nom);
    }
    //El mètode ordenaBombolla() ordenarà el llistat per nom.
    public static void ordenaBombolla(String[] arr) {
        int n = arr.length;
        String temp = "";
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                
                if (arr[j - 1].split(",")[1].trim().compareTo(arr[j].split(",")[1].trim()) > 0) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    
                }

            }
        }
    }
    
    //El mètode mostraNoms() donarà la següent sortida un cop la llista estigui ordenada:
    static void mostraNoms(String[] nomsComplets){
        ordenaBombolla(nomsComplets);
        System.out.println("Llista de noms:");
        for (int i = 0; i < nomsComplets.length; i++) {
            System.out.println((i+1)+". "+nomsComplets[i]);
        }
    }
    
    //Fes un mètode que, a partit de la llista anterior ordenada per noms de pila, trobi si un cert nom de pila hi és o no a la llista. En cas de ser-hi, mostrarà la seva posició, en cas contrari dirà que no hi és.
    static void cercaBinaria(String[] nomsComplets, String nom) {
        int valorI = 0;
        int valorF = nomsComplets.length - 1;

        int indice = 0;
        while (valorI <= valorF) {
            indice = (valorI + valorF) / 2;

            if (nomsComplets[indice].split(",")[1].trim().equals(nom)) {
                break;
            }

            if (valorI == valorF) {
                indice = -1;
                break;
            }

            if (nomsComplets[indice].split(",")[1].trim().compareTo(nom) < 0) {
                valorI = indice + 1;
            } else {
                valorF = indice - 1;
            }

        }
        if(indice == -1)
            System.out.println("El nom "+nom+" no s'ha trobat a la llista.");
        else
            System.out.println("El nom "+nom+" s'ha trobat a la posició "+(indice+1)+" de la llista ordenada");

    }
}
