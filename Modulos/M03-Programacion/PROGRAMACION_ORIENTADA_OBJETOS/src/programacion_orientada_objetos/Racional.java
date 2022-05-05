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
public class Racional {
    private int numerador;
    private int denominador;

    public Racional(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }
    
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
  
    public void imprimir(){
        System.out.println(numerador+"."+denominador);
    }
    //Al sobreescribir toString al hacer un print nos devuelve este mensaje sin necesitar llamar a la función 
    public String toString(){
        return numerador+"/"+denominador;
    }
    public void simplificar(){
        int mcd = mcd(numerador, denominador);
        this.numerador /= mcd;
        this.denominador /= mcd;
    }
    public void sumar (Racional b){
        this.numerador = this.numerador*b.denominador+b.numerador*this.denominador;
        this.denominador*=b.denominador;
        simplificar();
    }
    public void producto (Racional b){
        this.numerador*=b.numerador;
        this.denominador*=b.denominador;
        simplificar();
    }
    
    private int mcd(int n1,int n2){
        int mcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                mcd = i;
            }
        }
        return mcd;
    }
    
}
