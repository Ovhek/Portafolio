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
public class ProvaGos {
    public static void main(String[] args) {
        //Instanciación de clase "Gos"
        Gos tobi = new Gos();
        //Asignación de nombre a clase
        tobi.nom = "Tobi";
        tobi.raza = "Mastí";
        
        /*
        tobi.mostrarPedigri();
        System.out.println("");
        
        tobi.nombrePotes = 5;
        tobi.mostrarPedigri();
        */
        
        /*System.out.println("");
        
        //Probando Enum
        tobi.correr();
        System.out.println("");
        tobi.estat = Gos.Estat.DORMINT;
        tobi.correr();
        
        System.out.println("");
        tobi.estat = Gos.Estat.CORRENT;
        tobi.correr();
        */
        
        //Strings
        /*byte[] b = {12,34,22,5,6,22,78,34};
        String c = new String(b);
        System.out.println(c);
        
        char d = 'H';
        d = 'Z';
        String stri = "Bon ", stri2 = "dia";
        String str3 = stri.concat(stri2);
        System.out.println(str3);
        
        
        String str4 = "Bon dia";
        System.out.println(str4.charAt(2));
        
        //Esto da incorrecta ya que compara referencias de direcciones
        if(str3 == "Bon dia") System.out.println("Correcte");
        else    System.out.println("Incorrecte");
        
        //Esto da correcte ya que compara el contenido
        if(str3.equals("Bon dia")) System.out.println("Correcte");
        else    System.out.println("Incorrecte");
        
        //indexOf
        System.out.println(str3.indexOf("dia"));
        
        if (str3.indexOf("DIA345") != -1)
            System.out.println("Cadena trobada");
        else
            System.out.println("Cadena no trobada");
        
        //Index of a partir de un indice (indice incluido)
        str3 = "bon dia maca.";
        System.out.println(str3.indexOf("a", 7));
        
        
        
        
        //String compareTo --> Compara posiciones Alfabeticamente 
        System.out.println("a".compareTo("A"));
        System.out.println("asasd * * * asasd".replace("asasd", "HOLA"));
        
        //String trim() --> Elimina espacios al principio y al final
        System.out.println(" A ".trim());
        
        //String valueOf() --> Convierte X a String
        System.out.println(String.valueOf(12)+1); // --> 121
        
        ClasePruebaStatic.main(null);
        ClasePruebaStatic cps = new ClasePruebaStatic();
        cps.run();
        */
        
        Gos chiki = new Gos();
        chiki.nom = "Chiki";
        chiki.raza = "Chihuahua";
        chiki.nombrePotes = 4;
        
        
        Gos[] gossos = new Gos[10];
        gossos[0] = tobi;
        gossos[1] = chiki;
        for (int i = 0; i < gossos.length; i++) {
            if(gossos[i] != null){
                gossos[i].mostrarPedigri();
                System.out.println(""); 
            }
        }
        
        /*chiki.nom = "  ";
        if (chiki.nom.isBlank())
            System.out.println("No tiene Nombre");
        */
        //llamada a un metodo estatico, los metodos estaticos se llaman utilizando directamente la clase
        System.out.println("Nombre cientifico del perro: ");
        Gos.nombre_cientifico();
        
        System.out.println("Tipo de comida del Perro: "+ Gos.TIPUS_MENJAR);
    }
    
   
}
