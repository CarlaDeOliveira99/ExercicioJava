/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
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
        System.out.println("Digite o metro a ser convertido em centímetros:   ");
        float centi = Digite.nextFloat();
        
        float metro = centi/0.010000f;
        
        System.out.println(metro);
    }
    
}
