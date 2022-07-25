package Variaveis;

import java.util.Scanner;

/**
 *
 * @author carla
 */
public class Exercicio08 {

    /*Faça um Programa que recebe como argumento o raio de um círculo,
calcule e mostre sua área.
     */
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);
        System.out.println("Digite o raio do círculo: ");
        
        float raio = digite.nextFloat();
        
        float calc = 3.14f * (raio*raio);
        
        System.out.println(calc);
    }
    
}
