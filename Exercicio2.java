import java.util.*;


public class Exercicio2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Olá, seja muito bem vindo.");
        System.out.println("Insira o Primeiro número: ");
        int n1 = scan.nextInt();
        System.out.println("Insira o segundo número: ");
        int n2 = scan.nextInt();
        System.out.println("Insira o terceiro número: ");
        int n3 = scan.nextInt();
        if ((n1 > n2) & (n1 > n3)) {
            System.out.println("o primeiro número é maior.");
        }
        
        if ((n2 > n1) & (n2 > n3)) {
            System.out.println("o segundo número é maior.");
        }

        if ((n3 > n1) & (n3 > n2)) {
            System.out.println("o terceiro número é maior.");
        }
    }
}