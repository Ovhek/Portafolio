package Bucles;

import java.util.Scanner;

public class EXAMEN_ESCACS_COSAS_INTERESANTES_EXAMEN {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introdueix l'amplada: ");
        int amplada = entrada.nextInt();
        //Duplicar un string --> funcion "".repeat();
        
        String sucessionUno = "|"+(" ".repeat(amplada) + "#".repeat(amplada)).repeat(4)+"|";
        String sucessionDos = "|"+("#".repeat(amplada) + " ".repeat(amplada)).repeat(4)+"|";
        System.out.print("|");
        System.out.print("-".repeat(8*amplada));
        System.out.println("|");
        
        boolean sucessionUno_Bucle = true;
        for (int fila = 1, contador = 1; fila <= amplada*8; fila++, contador++) {
            if (sucessionUno_Bucle) System.out.println(sucessionUno);
            else System.out.println(sucessionDos);
            if(contador == amplada) sucessionUno_Bucle = false;
            if (contador == amplada*2){
                sucessionUno_Bucle = true;
                contador = 0;
            }
            
        }
        System.out.print("|");
        System.out.print("-".repeat(8*amplada));
        System.out.println("|");
        entrada.close();
    }
}
