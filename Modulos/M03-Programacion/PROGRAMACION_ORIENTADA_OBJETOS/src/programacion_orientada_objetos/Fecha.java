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
public class Fecha {
    private int dd;
    private int mm;
    private int aa;
    
    public void setFecha(int dd, int mm, int aa){
        this.dd = dd;
        this.mm = mm;
        this.aa = aa;
    }
    
    public boolean esPrimeroDeMes(){
        return dd == 1;
    }
    public boolean esAnterior(Fecha otra){
        return((dd+mm*5+aa*10) < (otra.dd+otra.mm*5+otra.aa*10));
    }
    public boolean esBisiesto (){
        return aa % 4 == 0 && aa % 100 != 0 || aa % 400 == 0;
    }
    public String getFecha(){
        return String.format("%02d/%02d/%04d", dd,mm,aa);
    }
    
    public String toString(){
        return getFecha();
    }
}
