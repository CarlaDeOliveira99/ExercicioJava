package Variaveis;

import java.util.Scanner;

/**
 *
 * @author carla
 */
public class Exercicio04 {

    /* 
     4. Faça um Programa que recebe dois números como argumentos e
          imprima a soma.
     */
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int num1 = digite.nextInt();
        System.out.println("Digite outro numero inteiro: ");
        int num2 = digite.nextInt();

        int soma = num1 + num2;

        System.out.println("O resultado da soma é: " + soma);
    }

}
