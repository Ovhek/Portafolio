/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringsClase;

import java.util.Scanner;

/**
 *
 * @author Cole
 */
public class EJ1_Fecha {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String fecha = entrada.nextLine();

        int dia = Integer.parseInt(fecha.substring(0, 2));
        int mes = Integer.parseInt(fecha.substring(3, 5));
        int año = Integer.parseInt(fecha.substring(6, 10));
        System.out.println(dia);
        System.out.println("Faltan " + (30 - dia) + " para final de mes.");
        System.out.println(mes);
        System.out.println(año);

        //21/11/2021 09:22
        int hora = Integer.parseInt(fecha.substring(11, 13));
        int minuts = Integer.parseInt(fecha.substring(14));
        System.out.println(hora);
        System.out.println(minuts);

        /*for (String fecha2: fecha.split("/")){
            System.out.println((Integer.parseInt(fecha2)));
        }*/
        //Ejercicio 3:
        String nombreApellido = entrada.nextLine();
        nombreApellido = nombreApellido.trim();
        String nombre = nombreApellido.substring(0, nombreApellido.indexOf(" "));
        String apellido1 = nombreApellido.substring(nombreApellido.indexOf(" ") + 1, nombreApellido.lastIndexOf(" ")).trim();
        String apellido2 = nombreApellido.substring(nombreApellido.lastIndexOf(" ") + 1).trim();
        //String apellido = nombreApellido.substring(nombreApellido.lastIndexOf(" ")+1,nombreApellido.length());

        System.out.println(nombre);
        System.out.println(apellido1);
        System.out.println(apellido2);
        /*for (String unidad : nombreApellido.split(" ")) {
            System.out.println(unidad);
        }*/

        //Ejercico 4: Binario a decimal
        String binario = entrada.nextLine();
        System.out.println(Integer.parseInt(binario, 2));
        String hexadecimal = entrada.nextLine();
        System.out.println(Integer.parseInt(hexadecimal, 16));
    }
}
