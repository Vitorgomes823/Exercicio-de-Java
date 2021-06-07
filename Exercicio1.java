import java.util.Scanner;


public class Exercicio1{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Olá, bem vindo!");
        System.out.println("Por Favor, insira um número: ");
        int numero = scan.nextInt();
        if (numero > 0) {
            System.out.println("o número que você digitou é positivo.");
        }

        if (numero < 0) {
            System.out.println("o número que você digitou é negativo.");
        }

        if (numero == 0){
            System.out.println("Você digitou zero.");
        }

    }
}