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
public class EJ_Piedra_Papel_Tijeras_Lagarto_Spock {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean partida = true;
        int ronda = 1;
        int jugador = 0;
        int ordenador = 0;
        int[][] matrizGanador = 
            {
                {0,-1,1,1,-1},
                {1,0,-1,-1,1},
                {-1,1,0,1,-1},
                {-1,1,-1,0,1},
                {1,-1,1,-1,0}
            };
                    
        while(partida){
            System.out.printf("Ronda: %d [Jugador: %d - Ordenador: %d]\n",ronda,jugador,ordenador);
            System.out.printf("pierda(0), papel(1), tijeras(2), lagarto(3), Spock(4)\n");
            int jugadaHumano = jugadaHumano(entrada);
            int jugadaOrdenador = jugadaOrdenador();
            

            
            int ganador = ganador(jugadaHumano,jugadaOrdenador,matrizGanador);
            String[] jugadas = {"piedra","papel","tijeras","lagarto","Spock"};
            System.out.printf("El ordenador ha sacado %s. El jugador ha sacado %s. ",jugadas[jugadaOrdenador],jugadas[jugadaHumano]);
            
            switch (ganador) {
                case 1:
                    System.out.println("Gana el Jugador.");
                    jugador++;
                    break;
                case -1:
                    System.out.println("Gana la máquina.");
                    ordenador++;
                    break;
                default:
                    System.out.println("Empate.");
                    break;
            }
            ronda++;
            
            if(jugador == 3 || ordenador == 3){
                System.out.println("La partida ha acabado en la ronda " + ronda);
                System.out.println("El marcador ha sido:");
                System.out.printf("Jugador: %d - Ordenador: %d\n",jugador,ordenador);
                System.out.println("Quieres realizar otra partida? [S/N]");
                entrada.nextLine();
                String decision = entrada.nextLine().toLowerCase();
                if(decision.equals("s")){
                    ronda = 1;
                    jugador = 0;
                    ordenador = 0;
                }
                else
                    partida = false;
            }
            System.out.println("");
        }
    }
    public static int jugadaHumano(Scanner scan){
        return scan.nextInt();
    }
    public static int jugadaOrdenador(){
        return(int) (Math.random()*5);
    }
    public static int ganador(int jugadaHumano,int jugadaOrdenador,int[][]matrizGanador){
        return matrizGanador[jugadaHumano][jugadaOrdenador];
    }
}
