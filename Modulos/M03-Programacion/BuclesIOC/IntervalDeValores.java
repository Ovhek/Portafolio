/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuclesIOC;

import java.util.Scanner;


/**
 *
 * @author Cole
 */
public class IntervalDeValores {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1 = entrada.nextInt();
        int n2 = entrada.nextInt();
        n2++;
        if(n1 < n2){
            while(n1 < n2){
                System.out.println(n1++);
            }
        }
        else{
            System.out.println("Error");
        }
    }
}
