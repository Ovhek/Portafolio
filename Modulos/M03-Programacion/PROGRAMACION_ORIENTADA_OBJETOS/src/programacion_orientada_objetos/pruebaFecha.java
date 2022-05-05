/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion_orientada_objetos;
/**
 *
 * @author Cole
 */
public class pruebaFecha {
    public static void main(String[] args) {
        Fecha fecha1 = new Fecha();
        fecha1.setFecha(01, 04, 2022);
        Fecha fecha2 = new Fecha();
        fecha2.setFecha(01, 05, 2022);
        
        
        
        System.out.println(fecha1);
        System.out.println(fecha2);
        
        System.out.println(fecha1.esAnterior(fecha2));
    }
}
