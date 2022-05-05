package cat.copernic.m03.uf3p1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Scanner;

/**
 *
 * 
 */
public class EsteganografiaImatges {
    
    static final int ID            = 0x00;  // "BM"
    static final int OFFSET_BITMAP = 0x0a;  // Posició on comença la imatge (4 bytes)
    static final int WIDTH         = 0x12;  // Amplada de la imatge (4 bytes)
    static final int HEIGHT        = 0x16;  // Alçada de la imatge (4 bytes)
    static final int BITSPERPIXEL  = 0x1c;  // Bits per pixel (hauria de ser 24)

    static final String MESSAGE_HEADER = "SECRET";
    static final String CARPETA_IMATGES = "imagenes/";
    
    static Scanner sc = new Scanner(System.in);
                
    
    /**
     * 
     * Classe principal d'entrada del programa
     * 
    */
    public static void main(String[] args) {
        
                 
        boolean sortir = false;
        
        
        do {
            System.out.println("*** MENU ***\n"
                             + "1.- Ocultar missatge dins d'una imatge\n"
                             + "2.- Llegir missatge a una imatge\n"
                             + "0.- Sortir");


            System.out.print("\nTria una opció: ");

            int opcio = sc.nextInt();
            sc.nextLine();

            switch (opcio) {
                case 1:
                    processarImatge('W');
                    break;
                case 2:
                    processarImatge('R');
                    break;
                case 0:
                    sortir = true;
            }
            System.out.println("\n\n");
        } while(!sortir);
        
    }

    
    /**
     * 
     * @param operacio : Indica l'operació a realitzar:
     *                   - W : Escriptura d'una missatge dins d'una imatge
     *                   - R : Lectura d'un missatge dins d'una imatge
     */
    static void processarImatge(char operacio) {
        
        if (operacio == 'W')
            System.out.print("Nom del fitxer on ocultaràs el teu missatge: ");
        else
            System.out.print("Nom del fitxer amb el missatge ocult: ");
        String nomFitxer = sc.nextLine();
        
        try {
            // COMPLETAR 1:
            // Escriure aquí el codi per:
            //            - calcular la mida del fitxer de la imatge a processar -> mida
            //            - obrir el fitxer de la imatge a processar             -> fitxerEntrada
            //            - desar el contingut en un array de bytes              -> dades
            //            - tancar el fitxer de la imatge

            // ......
            FileInputStream fitxerEntrada = new FileInputStream(CARPETA_IMATGES+nomFitxer);
            long mida = fitxerEntrada.getChannel().size();
            byte[] dades = fitxerEntrada.readAllBytes();
            fitxerEntrada.close();
            
            // COMPLETAR 2
            // Comprovar:
            //  - Si el fitxer té el format BMP, sinó "Fitxer no vàlid. Aquest fitxer no és una imatge"
            //  - Comprovar que els bits de color són 24, sinó "Fitxer no vàlid. Només es processen fitxer de 24 bits/pixel"
            //Fila 1C [Fila 1 | Columna C] --> 2 bytes [es el 29 en el hex, se le resta 1 porque empezamos en 0 asi que 28)
            if (nomFitxer.split("\\.").length > 1 ? !nomFitxer.split("\\.")[1].equals("bmp") : true)
                System.out.println("Fitxer no vàlid. " + 
                                   "Aquest fitxer no és una imatge");
            else if(dades[28]!=24) {
                System.out.println("Fitxer no vàlid. " +
                                   "Només es processen fitxer de 24 bits/pixel"
                                   );
            }
            else {
                System.out.println("Fitxer vàlid.");
                
                
                // COMPLETAR 3
                // - Calcular els pixels d'amplada de la imatge -> pixelsWidth
                // - Calcular els pixels d'alçada de la imatge  -> pixelsHeight
                int pixelsWidth = convertir4BytesInt(dades,WIDTH);
                int pixelsHeight = convertir4BytesInt(dades,HEIGHT);
                // ......
                System.out.println("Dimensions de la imatge: " + 
                                   pixelsWidth + "x" + pixelsHeight + " pixels."                                                                
                                   );
                
                
                int iniciImatge = convertir4BytesInt(dades,OFFSET_BITMAP);                                                                              
                                
                if (operacio == 'W') {

                    Scanner sc = new Scanner(System.in);
                    int maximCaracters = (pixelsWidth*pixelsHeight - 7);
                    String missatge;
                   do {
                        System.out.println("Introdueix el missatge secret [màxim " +
                                  maximCaracters + " caràcters]: ");

                        missatge = sc.nextLine();
                    } while (missatge.length() > maximCaracters);

                    
                    // 
                    // COMPLETAR 4: Modifiquem la imatge original
                    // - Cridem a setMessage() per escriure la capçalera "SECRET"
                    // - Cridem a setMessage() per escriure el missatge
                    int continuacion = setMessage(MESSAGE_HEADER, dades, 54);
                    continuacion = setMessage(missatge, dades, continuacion);
                    // ........
                    
                    // NULL == FINAL DE MISSATGE
                    setMessage(null,dades,continuacion);

                    
                    // COMPLETAR 5:
                    // Creem un fitxer de sortida amb el mateix nom que 
                    // l'original però acabat en _stg.bmp
                    // Exemple: kitten.bmp -> kitten_stg.bmp
                    // i escrivim el contigut de l'array de dades sobre 
                    // el fitxer de sortida
                    FileOutputStream fo = new FileOutputStream(CARPETA_IMATGES+nomFitxer.split("\\.")[0]+"_stg.bmp");
                    fo.write(dades);
                    fo.close();
                    // .............
                    
                } else {
                    
                    // COMPLETAR 6: Lectura de fitxer:
                    // Cridem al mètode getMissatge() per obtenir la capçalera
                    // Si la capçalera és correcte, cridem a getMessage() per 
                    // obtenir la resta del missatge.
                    // ......
                    ValorRetorn valorRetorn = getMessage(true, dades, 54);
                    if (valorRetorn.missatge.equals("SECRET")) {
                        valorRetorn = getMessage(false, dades, valorRetorn.posicio);
                        System.out.println("Missatge secret: " + valorRetorn.missatge);
                    } else {
                        System.out.println("Ho sento, aquest fitxer no té " + 
                                           "cap missatge secret");
                    }
                    
                }
            }            
            System.out.println("");
            
        } catch(FileNotFoundException fnf) {     
            System.out.println("Fitxer no trobat :" + fnf);
        } catch(IOException ioe) {
            System.out.println("Error mentre es copiava el fitxer: " + ioe);           
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
    
    /**
     * 
     * @param dades: array de dades que representa el fitxer
     * @param posicio: posició del array/fitxer on trobarem l'enter
     * @return torna un enter representat per 4 bytes seguits al fitxer en 
     *         format little endian.
     */
    // 
    static int convertir4BytesInt(byte[] dades, int posicio) {

        ByteBuffer buffer = ByteBuffer.wrap(dades, posicio, 4);
        buffer.order(ByteOrder.LITTLE_ENDIAN);
        return buffer.getInt();
                
    }
    

    /**
     * 
     * @param missatge: Missatge a escriure dins del fitxer
     * @param dades   : Array de dades que representa el fitxer
     * @param posicio : Posició de l'array on s'escriurà el fitxer
     * @return        : Posició de l'array a continuació del missatge
     */
    static int setMessage(String missatge,byte[] dades, int posicio) {

        if (missatge != null) {
            int pixelsWidth  = convertir4BytesInt(dades,WIDTH);
            int iniciColumna = convertir4BytesInt(dades,OFFSET_BITMAP);
            
            int i = 0;            
            while (i < missatge.length()) {
                if ( (posicio-iniciColumna) < pixelsWidth*3) {
                    Pixel pxPixel = codificaBytesToPixel(dades, posicio);                    
                    Pixel pxChar  = codificaCharToPixel(missatge.charAt(i));

                    mergePixelLSB(pxPixel,pxChar);

                    posicio = insertaPixel(pxPixel,dades,posicio);
                    ++i;

                } else {

                    while ( (posicio - iniciColumna) % 4 != 0)
                            posicio++;
                    iniciColumna = posicio;
                }
            }
        } else {
            Pixel pxPixel = codificaBytesToPixel(dades, posicio);                    
            Pixel pxChar  = new Pixel();
            mergePixelLSB(pxPixel,pxChar);
            posicio = insertaPixel(pxPixel,dades,posicio);
        }
        return posicio;
    }
           
      
    /**
     * 
     * @param valor: caràcter a codificar com a pixel
     * @return     : Pixel que representa el caràcter codificat en RGB tenin en 
     *               compte que agafem els bits:
     *               - 0-2: blau (B)
     *               - 3-5: verd (G)
     *               - 6-7: vermell (R)
     */
    static Pixel codificaCharToPixel(char valor) {
        
        Pixel px = new Pixel();        
        
        px.setRed((byte)  ((valor   & 0b11000000) >> 6));
        // COMPLETAR 7: Fer el mateix pels colors verd i blau del pixel
        px.setGreen((byte) ((valor   & 0b00111000) >> 3) );
        
        px.setBlue((byte) ((valor   & 0b000000111)) );
                
        return px;
    }
    
    
    /**
     * Codifica 3 bytes seguits (BGR) com a pixel
     * 
     * @param dades   : Array de dades que representa el fitxer
     * @param posicio : Posició de l'array a partir de la qual codificarem a RGB
     * @return        : Pixel que representa els tres bytes com a colors RGB
     */
    static Pixel codificaBytesToPixel(byte[] dades, int posicio) {
        
        return new Pixel(dades[posicio+2],dades[posicio+1],dades[posicio]);
                
    }
    
        
    // Oculta el pixel px1 (caràcter) en px2 (pixel original)
    /**
     * Fusiona el pixel original de la imatge amb el pixel que representa el 
     * un caràcter del missatge a ocultar.
     * @param px1 : Pixel original
     * @param px2 : Pixel que representa el caràcter a ocultar codificat
     */
    static void mergePixelLSB(Pixel px1,Pixel px2) {
        
        px1.setRed  ( (byte)((px1.getRed()   & 0b11111100) | px2.getRed()) );

        //0b11111000
        //0b11111000
        // COMPLETAR 8: Fer el mateix pels colors verd i blau del pixel
        px1.setGreen((byte)((px1.getGreen()& 0b11111000) | px2.getGreen()) );
        px1.setBlue((byte)((px1.getBlue()& 0b11111000) | px2.getBlue()) );

        
    }
    
    /**
     * Inserta un pixel dins l'array de dades que representa el fitxer en una 
     * determinada posició
     * @param pixel
     * @param dades
     * @param posicio
     * @return Posició següent a la dels bytes que representen el pixel
     */
    static int insertaPixel(Pixel pixel,byte[] dades,int posicio) {
                
        dades[posicio]   = pixel.getBlue();
        dades[posicio+1] = pixel.getGreen();
        dades[posicio+2] = pixel.getRed();
    
        return posicio + 3;
    }


    /**
     * Obté el missatge codificat a la imatge
     * @param header: Booleà que indica si és la capçalera (true) o no (false).
     *                La capçalera s'escriu seguida mentre que el missatge 
     *                ocultat s'escriu amb un caràcter NULL al final.
     * @param dades : Array que representa el fitxer
     * @param inici : Posició a partir de la qual es llegeix el missatge
     * @return ValorRetorn que conté la següent posició i el missatge llegit
     */
    static ValorRetorn getMessage(boolean header,byte[] dades,int inici) {
                                                    
        int pixelsWidth  = convertir4BytesInt(dades,WIDTH);
        int iniciColumna = convertir4BytesInt(dades,OFFSET_BITMAP);

        int totalCaractersLlegits = 0,posicio = inici; 
        String missatge = "";
        char caracter = '0';
        do {            
            if ( (posicio-iniciColumna) < pixelsWidth*3) {
                Pixel pxPixel = new Pixel(dades[posicio+2],
                                          dades[posicio+1],
                                          dades[posicio]);
                caracter = decodificaPixelToChar(pxPixel);
                                
                missatge += caracter;                
                posicio += 3;                
                totalCaractersLlegits++;

            } else {
                while ( (posicio - iniciColumna) % 4 != 0)
                        posicio++;
                iniciColumna = posicio;                                
            }
        } while ( (!header && (int)(caracter) != 0) || 
                  (header && totalCaractersLlegits < MESSAGE_HEADER.length()));
        
        ValorRetorn pim = new ValorRetorn(posicio,missatge);
        return pim;
    }

    
    
    /**
     * Decodifica un pixel fent l'extracció del caràcter que hi ha ocult-
     * @param pixel: Pixel a decodificar
     * @return     : caràcter que estava ocult al pixel
     */
    static char decodificaPixelToChar(Pixel pixel) {
        
        return (char)( ((pixel.getRed()   & 0b00000011) << 6) | 
                       ((pixel.getGreen() & 0b00000111) << 3) |
                       ((pixel.getBlue()  & 0b00000111))
                     );
                                                
    }
    
    
}