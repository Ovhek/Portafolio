
import programacion_orientada_objetos.Punto;
import programacion_orientada_objetos.Segmento;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cole
 */
public class PruebaPunto {
    public static void main(String[] args) {
        Punto test1 = new Punto(1,2);
        test1.set(1, 2);
        
        Punto test2 = new Punto(2,3);
        test2.set(2, 3);
        
        test1.imprimir();
        test2.imprimir();
        
        System.out.println(test1.esMayor(test2));
        
        Segmento seg = new Segmento(new Punto(1,1), new Punto(2,2));
        System.out.println(seg.getPuntoInicial());
        System.out.println(seg.getPuntoFinal());
        System.out.println(seg.modulo());
        
        
    }
}
