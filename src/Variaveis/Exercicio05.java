package Variaveis;

import java.util.Scanner;

/**
 *
 * @author carla
 */
public class Exercicio05 {

    /* 
    5. Escreva um programa que recebe como argumento um ano e imprime
          true se ele for ano bissexto e false se não for.
     */
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);
        System.out.println("Digite um ano: ");
        int num = digite.nextInt();
        int resultado = num % 4;

        if (resultado > 0) {
            System.out.println("O ano " + num + " não é bissexto");
        } else {
            System.out.println("O ano " + num + " é bissexto");
        }

    }

}
