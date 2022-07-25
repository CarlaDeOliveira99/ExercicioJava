package Variaveis;

import java.util.Scanner;

/**
 *
 * @author carla
 */
public class Exercicio09 {

    /*9. Faça um Programa que pergunte quanto você ganha por hora e o
      número de horas trabalhadas no mês. Calcule e mostre o total do seu
      salário no referido mês. 
     */
    public static void main(String[] args) {
        Scanner Digite = new Scanner(System.in);
        System.out.println("Quanto que você ganha por hora: ");
        double hora = Digite.nextDouble();

        System.out.println("O número de horas trabalhadas no mês: ");
        double mes = Digite.nextDouble();

        double calc = hora * mes;
        System.out.println("Seu salario no referido mês é: " + "R$ " + calc);
    }

}
