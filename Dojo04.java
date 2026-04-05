package Handson;

import java.util.Scanner;
import java.util.Random;

public class Dojo04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        char jogarNovamente;

        do {
            int numeroSecreto = random.nextInt(100) + 1;
            int tentativa;
            boolean acertou = false;
        
        for(int i = 1; i <= 10; i++) {
           System.out.print("Tentativa " + i + " - Digite seu palpite: ");
           tentativa = input.nextInt();

        if (tentativa > numeroSecreto) {
            System.out.println("Muito alto");
        }
        else if (tentativa < numeroSecreto) {
            System.out.println("Muito baixo");
        }
        else {
            System.out.println("Acertou!");
            System.out.println("Você acertou na tentativa " + i);
            acertou = true;
            break;
        }
        }
        if (!acertou) {
            System.out.println("Você perdeu!");
            System.out.println("O número secreta era: " + numeroSecreto);
        }
        else {
            System.out.println("Você venceu!");
        }
        System.out.print("Deseja jogar novamente? (S/N): ");
        jogarNovamente = input.next().charAt(0);
    }
    while (jogarNovamente == 's' || jogarNovamente == 'S');
    input.close();    
}
}
