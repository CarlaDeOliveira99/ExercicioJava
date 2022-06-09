package Variaveis;

import java.util.Scanner;

/**
 *
 * @author carla
 */
public class Exercicio01 {

    
    //01 - Escreva um programa que imprima seu nome na tela.
    
    
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);
        System.out.print("Escreva seu nome: ");
        String nome = digite.next();

        System.out.println(nome);
    }

}
