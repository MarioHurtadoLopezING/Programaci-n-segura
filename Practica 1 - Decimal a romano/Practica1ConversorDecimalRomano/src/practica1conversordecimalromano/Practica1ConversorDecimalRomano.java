/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1conversordecimalromano;

import java.util.Scanner;
/**
 *
 * @author mariolpz
 */
public class Practica1ConversorDecimalRomano {
    
    private static String numeroRomano = "";
    private static String resultadoRomano = "";
      
    public static String convertirDecimalRomano(int numeroDecimal){
        if(numeroDecimal > 0 && numeroDecimal < 4000){
            String unidades = convertirNumeroDecimalARomano(numeroDecimal % 10, "I","V","X");
            numeroDecimal = numeroDecimal / 10;
            numeroRomano = "";
            String decenas = convertirNumeroDecimalARomano(numeroDecimal % 10, "X","L","C");
            numeroDecimal = numeroDecimal / 10;
            numeroRomano = "";
            String centenas = convertirNumeroDecimalARomano(numeroDecimal % 10, "C", "D", "M");
            numeroDecimal = numeroDecimal / 10;
            numeroRomano = "";
            String miles = "";
            while(numeroDecimal > 0){
                miles = miles + "M";
                numeroDecimal-=1;
            }
            resultadoRomano = miles+""+centenas+""+decenas+""+unidades;;
        }else if(numeroDecimal < 1){
            resultadoRomano = "Número inferior a los valores válidos";
        }else if(numeroDecimal > 3999){
            resultadoRomano = "Número mayor a los valores válidos";
        }
        return resultadoRomano;
    }
    private static String convertirNumeroDecimalARomano(int numeroDecimal, 
            String multiploUnitario, String multiploDeCinco, String multiploDeDiez){
        if(numeroDecimal > 0){
            numeroRomano = numeroRomano +multiploUnitario;
            if(numeroRomano.length() == 5){
                if(numeroRomano.contains(multiploDeCinco)){
                    numeroRomano = multiploUnitario+multiploDeDiez;
                }else{
                    numeroRomano = multiploDeCinco;
                }
            }
            return convertirNumeroDecimalARomano(numeroDecimal - 1,multiploUnitario, multiploDeCinco, multiploDeDiez);
        }
        if(numeroRomano.equals(multiploUnitario+multiploUnitario+multiploUnitario+multiploUnitario)){
            numeroRomano = multiploUnitario+multiploDeCinco;
        }
        return numeroRomano;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 0;
        Scanner sc = new Scanner(System.in);
        while(numero != -1){
            System.out.println("ingresa un numero (-1 salir)");
            numero = sc.nextInt();
            System.out.println(convertirDecimalRomano(numero));
        }
    }
    
}
