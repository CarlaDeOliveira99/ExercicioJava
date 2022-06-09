package Variaveis;

import java.util.Scanner;

/**
 *
 * @author carla
 */
public class Exercicio02 {

    
    /*2. Faça um Programa que recebe como argumento um número e então
         mostre a mensagem O número informado foi [número]. */
    
    
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        float numInformado = digite.nextFloat();

        System.out.println("O número informado foi: " + numInformado);

    }

}
