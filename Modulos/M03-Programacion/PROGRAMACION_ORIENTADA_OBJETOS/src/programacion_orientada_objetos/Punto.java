/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion_orientada_objetos;

import java.util.Locale;

/**
 *
 * @author Cole
 */
public class Punto {
    
    /*Coordenada x*/
    private double x;
    /*Coordenada y*/
    private double y;

    public Punto(double x, double y) {
        Locale.setDefault(new Locale("en", "EN"));
        this.x = x;
        this.y = y;
    }
    
    public void set(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public double modulo(){
        return Math.sqrt(x*x+y*y);
    }
    
    public String toString(){
        return String.format("(%.2f,%.2f)\n",this.x,this.y);
    }
    
    public void imprimir (){
        System.out.println(toString());
    }
    public void sumar(Punto otro){
        this.x+= otro.x;
        this.y+= otro.y;
    }
    public Punto restar(Punto otro){
        return new Punto(this.x - otro.x, this.y - otro.y);
    }
    public boolean esMayor(Punto otro){
        return this.modulo() > otro.modulo();
    }
}
