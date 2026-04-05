package Handson;
import java.util.Scanner;

public class Dojo02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Número da conta: ");
        int numeroConta = input.nextInt();
        System.out.print("Saldo no início do mês: ");
        double saldoinicial = input.nextDouble();
        System.out.print("Total de itens cobrados no mês: ");
        double despesas = input.nextDouble();
        System.out.println("Total de créditos aplicados no mês: ");
        double creditos = input.nextDouble();
        System.err.println("Limite de crédito: ");
        double limiteCredito = input.nextDouble();
        double novoSaldo = saldoinicial + despesas - creditos;
        System.out.println("\nNúmero da conta: " + numeroConta);
        System.out.println("Novo saldo: " + novoSaldo);

        if (novoSaldo > limiteCredito) {
            System.out.println("Limite de crédito excedido");

        }
    }

    
}
