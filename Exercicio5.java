import java.util.Scanner;

public class Exercicio5{
    public static void main(String[] args) {
        //Onde o usuario deve informar os valores:
        Scanner scan  = new Scanner(System.in);
        System.out.println("Olá, seja muito bem vindo.");
        System.out.println("Digite um número : ");
        int n1 = scan.nextInt();
        System.out.println("Digite outro número : ");
        int n2 = scan.nextInt();
        //Verdadeiro ou falso:
        if ((n1 > 0) & (n2 > 0)) {
            System.out.println("True");
        }

        if ((n1 < 0) & (n2 < 0)) {
            System.out.println("True");
        }

        else {
            System.out.println("False");
        }



    }
}
