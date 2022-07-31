/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Condicionais;

import java.util.Scanner;

/**
 *
 * @author carla
 */
public class Exercicio01 {

    /*1. Escreva um programa que leia pelo teclado um número e imprima caso
      ele seja maior do que 5.
     */
    public static void main(String[] args) {
        Scanner digite  = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numeroDigitado = digite.nextInt();
        
        if(numeroDigitado > 5){
            System.out.println("O numero digitado é maior do que o 5");
            
        }
        
    }
    
}
