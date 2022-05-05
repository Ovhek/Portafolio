/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf1.pa2.alexandrucruceat;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Cole
 */
public class Fruiteria {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en","US"));
        
        Scanner entrada = new Scanner(System.in);
        String[][] articulos_precio = {{"taronja", "1.55"}, {"poma", "1.99"}, {"pera", "2.40"}, {"mandarina", "1.80"}, {"maduixa", "5.00"}, {"platan", "2.20"}};
        float precio = 0.0f;
        String articulo = ".";
        System.out.println("Indiqui els articles i el pes (línia en blanc per finalitzar):");
        
        primerloop:
        while (!"".equals(articulo)) {
            float peso = 0.0f;
            boolean bucle = true;
            int ubicacion = 0;
            while (bucle) {
                System.out.print("Article: ");
                articulo = entrada.nextLine().toLowerCase();
                if(articulo.isBlank() || articulo.isEmpty()) break primerloop;
                for (int i = 0; i < articulos_precio.length; i++) {
                    if (articulos_precio[i][0].equals(articulo)) {
                        bucle = false;
                        ubicacion = i;
                        break;
                    }
                }
                if (bucle) System.out.println("ERROR, article no disponible");
            }
            System.out.print("Pes: ");
            peso = entrada.nextFloat();
            entrada.nextLine();
            precio += Float.parseFloat(articulos_precio[ubicacion][1]) * peso;
        }
        System.out.println("");
        
        if (precio > 0)
            System.out.printf("Total: %.2f€\n",precio);
        
    }
}
