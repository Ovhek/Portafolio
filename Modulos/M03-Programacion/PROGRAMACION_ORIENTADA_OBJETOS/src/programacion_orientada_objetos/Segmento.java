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
public class Segmento{
    private Punto puntoInicial;
    private Punto puntoFinal;

    public Segmento(Punto puntoInicial, Punto puntoFinal) {
        this.puntoFinal = puntoFinal;
        this.puntoInicial = puntoInicial;
    }
    
    public void set(Punto a, Punto b){
        puntoInicial = a;
        puntoFinal = b;
    }

    public Punto getPuntoInicial() {
        return puntoInicial;
    }

    public Punto getPuntoFinal() {
        return puntoFinal;
    }
    
    public double modulo(){
        return (puntoFinal.restar(puntoInicial)).modulo();
    }
}
