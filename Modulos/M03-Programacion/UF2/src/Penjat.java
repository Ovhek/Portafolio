
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cole
 */
public class Penjat {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean jugando = true;
        while (jugando) {
            String[] palabras
                    = {
                        "electroencefalografista", "esternocleidomastoideo", "Desoxirribonucleótido"
                    };
            String palabra = palabras[(int) (Math.random() * palabras.length)];
            String letrasIntroducidas = "";
            String palabraSecreta = "*".repeat(palabra.length());
            int MAX_OPORTUNIDADES = 8;
            int oportunidades = 0;
            boolean victoria = false;
            boolean derrota = false;
            char[][] estadoPartida
                    = {
                        {
                            ' ', ' ', ' ', '_', '_', '_', '_', ' ', ' ', ' ', ' ', ' '
                        },
                        {
                            ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '
                        },
                        {
                            ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '
                        },
                        {
                            ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '
                        },
                        {
                            ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '
                        },
                        {
                            ' ', ' ', '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '
                        },
                        {
                            ' ', '_', '|', '_', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '
                        },
                        {
                            '|', ' ', ' ', ' ', '|', '_', '_', '_', '_', '_', '_', ' '
                        },
                        {
                            '|', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '|'
                        },
                        {
                            '|', '_', '_', '_', '_', '_', '_', '_', '_', '_', '_', '|'
                        },};

            boolean partida = true;
            while (partida) {

                //Dibujo
                mostrarDibujo(estadoPartida);

                //Palabra *
                System.out.printf("Palabra: %s\n", palabraSecreta);

                //Letras
                System.out.printf("Letras: %s\n", letrasIntroducidas);

                //Victoria o Derrota
                if (victoria || derrota) {
                    System.out.printf("HAS %s!!! LA PALABRA ERA: %s ¿Quieres volver a jugar? (S/N)", (victoria) ? "GANADO" : "PERDIDO", palabra.toUpperCase());
                    partida = false;
                    String decision = entrada.nextLine().toLowerCase();
                    if (decision.equals("s")) {
                        jugando = true;
                    } else {
                        jugando = false;
                    }
                    break;
                }

                //Introduce una letra
                String letra = "";
                do {
                    System.out.print("Introduce una letra: ");
                    letra = entrada.nextLine().toLowerCase();
                    int numLetrasIntroducidas = letrasIntroducidas.length();
                    letrasIntroducidas = comprobarLetras(letra, letrasIntroducidas);
                    if (letrasIntroducidas.length() > numLetrasIntroducidas) {
                        break;
                    }
                } while (true);

                //acierto
                boolean acierto = comprobarAcierto(letra, palabra);

                //Si acierta o no
                if (acierto) {
                    palabraSecreta = actualizarSecreto(palabraSecreta, palabra, letra);
                    if (!palabraSecreta.contains("*")) {
                        victoria = true;
                    }
                } else {
                    oportunidades++;
                    estadoPartida = cambiarEstado(oportunidades, estadoPartida);
                    if (oportunidades == MAX_OPORTUNIDADES) {
                        derrota = true;
                    }
                }
            }
        }

    }

    private static void mostrarDibujo(char[][] estadoPartida) {
        for (char[] lineas : estadoPartida) {
            System.out.println(lineas);
        }
        System.out.println("");
    }

    private static String comprobarLetras(String letra, String letrasIntroducidas) {
        return (!letrasIntroducidas.contains(letra)) ? letrasIntroducidas += letra : letrasIntroducidas;
    }

    private static boolean comprobarAcierto(String letra, String palabra) {
        return palabra.contains(letra);
    }

    private static String actualizarSecreto(String palabraSecreta, String palabra, String letra) {
        String palabraSecretaMod = "";
        for (int i = 0; i < palabraSecreta.length(); i++) {
            palabraSecretaMod += (palabra.toCharArray()[i] == letra.toCharArray()[0]) ? letra : (palabraSecreta.toCharArray()[i] != '*') ? String.valueOf(palabraSecreta.toCharArray()[i]) : "*";
        }
        return palabraSecretaMod;
    }

    private static char[][] cambiarEstado(int oportunidades, char[][] estadoPartida) {
        char[][] estadoPartidaMod = estadoPartida;
        switch (oportunidades) {
            case 1:
                estadoPartida[1][7] = '|';
                break;
            case 2:
                estadoPartida[2][7] = 'O';
                break;
            case 3:
                estadoPartida[3][7] = '|';
                break;
            case 4:
                estadoPartida[3][6] = '/';
                break;
            case 5:
                estadoPartida[3][8] = '\\';
                break;
            case 6:
                estadoPartida[4][7] = '|';
                break;
            case 7:
                estadoPartida[5][6] = '/';
                break;
            case 8:
                estadoPartida[5][8] = '\\';
                break;
        }
        return estadoPartidaMod;
    }
}
