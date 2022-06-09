package Variaveis;

import java.util.Scanner;

/**
 *
 * @author carla
 */
public class Exercicio03 {

    /*3. Escreva um programa que recebe como argumento dois valores inteiros
         e imprime os operandos, operadores, e resultados das operações de
         soma, subtração, multiplicação, divisão e resto.*/
    
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int num1 = digite.nextInt();
        System.out.println("Digite outro numero inteiro: ");
        int num2 = digite.nextInt();

        int soma = num1 + num2;
        int sub = num1 - num2;
        int multi = num1 * num2;
        int divi = num1 / num2;
        int resto = num1 % num2;

        System.out.println("Resultado da soma é: " + soma + " Resultado da subtração é: " + sub + " Resultado da multipicação é: " + multi + " Resultado da multipicação é: " + divi + " e o resto é: " + resto);
    }

}
