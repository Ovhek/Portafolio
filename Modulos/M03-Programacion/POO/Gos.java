/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author Cole
 */
//Clase Gos
public class Gos {
    int nombrePotes;
    String nom;
    String raza;
    
    //Enumeración estat
    enum Estat {
        MENJANT,DORMINT,BORDANT,DESPERT,CORRENT
    };
    
    Estat estat;
    
    //Constructor --> Se llama al instanciar la clase
    public Gos() {
        this.nombrePotes = 4;
        estat = Estat.MENJANT;
    }
    
    
    
    void mostrarPedigri(){
        System.out.println("Nom del gos: " + nom);
        System.out.println("Raça de " +nom +": "+ raza);
        System.out.println(nom+ " té "+nombrePotes+" potes");
    }
    
    //Metodo utilizando los enumerations
    void correr(){
        if (estat == Estat.DORMINT) 
            System.out.println(nom+" no pot córrer, està dormint.");
        
        else if(estat == Estat.CORRENT)
            System.out.println(nom+ " ja està corrent.");
        else{
            System.out.println(nom+ " s'ha posat a córrer.");
            estat = Estat.CORRENT;
        }
    }
    
}
