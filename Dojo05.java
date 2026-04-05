package Handson;

import java.util.Scanner;

public class Dojo05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor para saque: ");
        int valor = input.nextInt();

        if ( valor <= 0) {
            System.out.println("Valor inválido!");
        } else {
            int restante = valor;

            int notas100 = restante / 100;
            restante %= 100;

            int notas50 = restante / 50;
            restante %= 50;

            int notas20 = restante / 20;
            restante %= 20;

            int notas10 = restante / 10;
            restante %= 10;

            int notas5 = restante / 5;
            restante %= 5;

            int notas2 = restante / 2;
            restante %= 2;

            int notas1 = restante;
            
            System.out.println("\nNotas entregues:");

            if (notas100 > 0) System.out.println("100: " + notas100);
            if (notas50 > 0) System.out.println("50: " + notas50);
            if (notas20 > 0) System.out.println("20: " + notas20);
            if (notas10 > 0) System.out.println("10: " + notas10);
            if (notas5 > 0) System.out.println("5: " + notas5);
            if (notas2 > 0) System.out.println("2: " + notas2);
            if (notas1 > 0) System.out.println("1: " + notas1);
        }
        input.close();
    }

    
}
