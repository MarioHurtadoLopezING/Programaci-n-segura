/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3cifradordetexto;

/**
 *
 * @author mariolpz
 */
public class Practica3CifradorDeTexto {

    /**
     * @param args the command line arguments
     */
    private static final char[] caracteres = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ',
        'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};

    public static String convertirTextoACaracteresCifrados(String texto, int numeroCifrado) {
        char[] textoCaracteres = texto.toCharArray();
        String textoCifrado = "";
        for (int i = 0; i < textoCaracteres.length; i++) {
            if (textoCaracteres[i] == ' ') {
                textoCifrado = textoCifrado + " ";
            } else {
                for (int j = 0; j < caracteres.length; j++) {
                    if (textoCaracteres[i] == caracteres[j]) {
                        if (textoCaracteres[i] == caracteres[j]) {
                            textoCifrado = textoCifrado + caracteres[j + numeroCifrado];
                        }
                    }
                }
            }
        }
        return textoCifrado;
    }

    public static String convertirCaracteresCifradosATexto(String texto, int numeroCifrado) {
        char[] textoCaracteres = texto.toCharArray();
        String textoDescifrado = "";
        for (int i = 0; i < textoCaracteres.length; i++) {
            for (int j = 0; j < caracteres.length; j++) {
                if (textoCaracteres[i] == caracteres[j]) {
                    textoDescifrado = textoDescifrado + caracteres[j - numeroCifrado];
                }
            }
            if (textoCaracteres[i] == ' ') {
                textoDescifrado = textoDescifrado + " ";
            }
        }
        return textoDescifrado;
    }

    public static void main(String[] args) {
    }

}
