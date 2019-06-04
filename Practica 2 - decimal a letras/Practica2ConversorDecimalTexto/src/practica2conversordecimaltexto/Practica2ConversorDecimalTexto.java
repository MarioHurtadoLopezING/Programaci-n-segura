/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2conversordecimaltexto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author mariolpz
 */
public class Practica2ConversorDecimalTexto {
    
    public static String convertirUnidadesATexto(int numeroEntero){
        String nombreNumero = "";
        if(numeroEntero == 1){
            nombreNumero = "uno";
        }if(numeroEntero == 2){
            nombreNumero = "dos";
        }if(numeroEntero == 3){
            nombreNumero = "tres";
        }if(numeroEntero == 4){
            nombreNumero = "cuatro";
        }if(numeroEntero == 5){
            nombreNumero = "cinco";
        }if(numeroEntero == 6){
            nombreNumero = "seis";
        }if(numeroEntero == 7){
            nombreNumero = "siete";
        }if(numeroEntero == 8){
            nombreNumero = "ocho";
        }if(numeroEntero == 9){
            nombreNumero = "nueve";
        }
        return nombreNumero;
    }    
    public static String convertirDecenasATexto(int numeroEntero){
        String nombreNumero = "";
        if(numeroEntero == 1){
            nombreNumero = "diez";
        }else if(numeroEntero == 2){
            nombreNumero = "veinte";
        }else if(numeroEntero == 3){
            nombreNumero = "treinta";
        }else if(numeroEntero == 4){
            nombreNumero = "cuarenta";
        }else if(numeroEntero == 5){
            nombreNumero = "ciencuenta";
        }else if(numeroEntero == 6){
            nombreNumero = "sesenta";
        }else if(numeroEntero == 7){
            nombreNumero = "setenta";
        }else if(numeroEntero == 8){
            nombreNumero = "ochenta";
        }else if(numeroEntero == 9){
            nombreNumero = "noventa";
        }
        return nombreNumero;
    }
    public static String convertirCentenasATexto(int numeroEntero){
        String nombreNumero = "";
        if(numeroEntero == 1){
            nombreNumero = "cien";
        }else if(numeroEntero > 1 && numeroEntero != 5){
            nombreNumero = convertirUnidadesATexto(numeroEntero) + "cientos";
        }else if(numeroEntero == 5){
            nombreNumero = "quinientos";
        }
        return nombreNumero;
    }
    public static String convertirNumerosEspeciales(int numeroEntero){
        String nombreNumero = "";
        if(numeroEntero == 11){
            nombreNumero = "once";
        }if(numeroEntero == 12){
            nombreNumero = "doce";
        }if(numeroEntero == 13){
            nombreNumero = "trece";
        }if(numeroEntero == 14){
            nombreNumero = "catorce";
        }if(numeroEntero == 15){
            nombreNumero = "quince";
        }
        return nombreNumero;
    }
    public static String convertirNumerosATexto(int numeroEntero){
        String numero = "";
        List<String> listaNombreNumero = new ArrayList<>();
        while(numeroEntero > 0){
            if(numeroEntero > 10 && numeroEntero < 16){
                listaNombreNumero.add(convertirNumerosEspeciales(numeroEntero));
                break;
            } else {
                listaNombreNumero.add(convertirUnidadesATexto(numeroEntero%10));
                numeroEntero = numeroEntero/10;
                listaNombreNumero.add(convertirDecenasATexto(numeroEntero%10));
                numeroEntero = numeroEntero /10;
                listaNombreNumero.add(convertirCentenasATexto(numeroEntero%10));
                numeroEntero = numeroEntero /10;
            }
        }
        for(int i = listaNombreNumero.size(); i > 0; i--){
            numero = numero + listaNombreNumero.get(i - 1)+" ";
            if(i==4){
                numero = numero +" mil ";
            }else if(i == 7){
                numero = numero+" millones ";
            }
        }
        return numero;
    }
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        // TODO code application logic here
       int numero = 0; 
       Scanner sc = new Scanner(System.in);
       while(numero != -1){
           System.out.println("ingresa un numero ");
           numero = sc.nextInt();
           System.out.println(convertirNumerosATexto(numero));
       }
    }   
}