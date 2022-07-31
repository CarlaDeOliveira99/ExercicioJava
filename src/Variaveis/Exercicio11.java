package Variaveis;

import java.util.Scanner;

/**
 *
 * @author carla
 */
public class Exercicio11 {

    /*Faça um Programa que peça a temperatura em graus Celsius,
    transforme e mostre em graus Farenheit.
    (0 °C × 9/5) + 32
     */
    public static void main(String[] args) {
         Scanner Digite = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius");
        double C =  Digite.nextDouble();
        double convert = ( C * 9/5) + 32;
        
        System.out.println("Convertendo para Farenheit:  " + convert);
        
        
        
        
    }
    
}


