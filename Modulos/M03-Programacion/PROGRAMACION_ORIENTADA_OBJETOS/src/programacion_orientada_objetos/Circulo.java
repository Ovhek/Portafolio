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
public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double perimetro(){
        return 2*Math.PI*radio;
    }
    public double area(){
        return Math.PI*radio*radio;
    }
    public boolean mayorQue(Circulo otro){
        return this.radio > otro.radio;
    }
    
    
}
