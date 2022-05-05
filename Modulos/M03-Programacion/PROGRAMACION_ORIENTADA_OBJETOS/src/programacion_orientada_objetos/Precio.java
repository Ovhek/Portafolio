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
public class Precio {
    //precio en una variable double
    private double precio;

    //Getter del precio
    public double getPrecio() {
        return precio;
    }
    
    //Setter del precio, si no tiene modificador de acceso, solo se puede llamar desde el mismo package
     void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
