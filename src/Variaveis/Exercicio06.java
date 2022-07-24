package Variaveis;

import java.util.Scanner;

/**
 *
 * @author carla
 */
public class Exercicio06 {

    /**
     * @param args the command line arguments
     */
   
    /*6.Faça um Programa que recebe como argumento as 4 notas bimestrais e
         mostre a média.  */
    
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        float nota1 = digite.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float nota2 = digite.nextFloat();
        System.out.println("Digite a terceira nota: ");
        float nota3 = digite.nextFloat();
        System.out.println("Digite a quarta nota: ");
        float nota4 = digite.nextFloat();
        
        
        float media  = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.println("Média: " + media);
        
        
                
        
    }

}
