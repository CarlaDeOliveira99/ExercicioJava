package Variaveis;

import java.util.Scanner;

/**
 *
 * @author carla
 */
public class Exercicio07 {

    /*7. Faça um Programa que converta metros para centímetros.*/
    
    public static void main(String[] args) {
        Scanner Digite = new Scanner(System.in);
        System.out.println("Digite a quantidade de metro a ser convertido em centímetros:   ");
        float metro = Digite.nextFloat();
        
        float centi = metro/0.010000f;
        
        System.out.println(centi + "cm");
    }
    
}
