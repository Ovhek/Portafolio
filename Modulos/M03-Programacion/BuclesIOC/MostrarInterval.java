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
public class MostrarInterval {
    public static void main (String[] args) {
Scanner lector = new Scanner(System.in);
 
System.out.print("Quin és el valor de n1? ");
int n1 = lector.nextInt();
lector.nextLine();
 
System.out.print("Quin és el valor de n2 (més gran que n1)? ");
int n2 = lector.nextInt();
lector.nextLine();
 
if (n1 < n2) {
for (int i = n1; i <= n2; i++) {
System.out.println(i);
}
} else {
System.out.println("n2 no és més gran que n1!");
}
}
}
