package Ejercicios_Apuntes_Clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cole
 */
public class Try_Catch {

    public static void main(String[] args) {
        try {
            int[] array = new int[10];
            array[9] = 5;
            
            int divident = 3, divisor = 0;
            int quocient = divident / divisor;
            System.out.println("Quocinet = " + quocient);
        } 
        /*Catch con dos excepciones*/
        catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Error (fuera del rango): "+e.getMessage());
        }
        catch(Exception e2){
            System.out.println("Error Aritmetico: " + e2.getMessage());
        }
        /*catch (Exception e) {
            System.out.println(e);
        }*/

    }
}
