package Handson;

import java.util.Scanner;

public class Dojo03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int senhaCorreta = 4567;
        int tentativa;
        int contador = 0;

        while (contador < 3) {
            System.out.print ("Digite a senha: ");
            tentativa = input.nextInt();

            if ( tentativa == senhaCorreta) {
                System.out.println("Acesso Permitido");
                break;
            }
            else { 
                System.out.println("Senha incorreta");
                contador++;
            }
        }
            if (contador == 3) {
                System.out.println("Acesso bloqueado");
            }
            input.close();

    }


    
}
