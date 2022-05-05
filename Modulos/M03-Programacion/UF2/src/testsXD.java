/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cole
 */
public class testsXD {

    public static void main(String[] args) {
        char[][] estadoPartida
                = {
                    {' ', ' ', ' ', '_', '_', '_', '_', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {' ', '_', '|', '_', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                    {'|', ' ', ' ', ' ', '|', '_', '_', '_', '_', '_', '_', ' '},
                    {'|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|'},
                    {'|', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '|'},};
        for (char[] cs : estadoPartida) {
            for (char c : cs) {
                System.out.print(c);
            }
            System.out.println("");
        }
    }
}
