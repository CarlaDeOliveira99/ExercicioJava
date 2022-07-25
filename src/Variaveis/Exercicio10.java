package Variaveis;

import java.util.Scanner;

/**
 *
 * @author carla
 */
public class Exercicio10 {

    /*10. Faça um Programa que peça a temperatura em graus Farenheit,
     transforme e mostre a temperatura em graus Celsius. 
     C = (5 * (F-32) / 9). 
     */
    public static void main(String[] args) {
        Scanner Digite = new Scanner(System.in);
        System.out.println("Digite a temperatura em Farenheit");
        double F =  Digite.nextDouble();
        double convert = (5 * (F-32) / 9);
        
        System.out.println("Convertendo para Celsius:  " + convert);
    }
    
}
