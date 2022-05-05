package programacion_orientada_objetos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cole
 */
//Clase Gos
public class GOS {
    static String TIPUS_MENJAR = "Omnivoro";
    //Enumeración estat
    enum Estat {
        MENJANT,DORMINT,BORDANT,DESPERT,CORRENT
    };
    
    
    int nombrePotes;
    //Oculta la variable y no deja acceder a esta de forma directa (desde fuera)
    private String nom;
    String raza;
    
    Estat estat;
    
    //Constructor --> Se llama al instanciar la clase
    public GOS() {
        this.nombrePotes = 4;
        estat = Estat.MENJANT;
    }
    
    
    //Editamos la variable nombre de una variable de acceso privado utilizando un Setter
    void setNom(String nom){
        this.nom = nom;
    }
    void mostrarPedigri(){
        System.out.println("Pedigree:");
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
    //Clase estatica, se puede llamar utilizando el nombre de la clase sin más
    static void nombre_cientifico(){
        System.out.println("Canis Familiaris");
    }
}
