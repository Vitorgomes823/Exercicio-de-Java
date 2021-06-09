import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Olá, seja muito bem vindo.");
        //Números:
        int cont = 1;
        int numero = 0;
        int soma = 0;

        //Função:
        while (cont <= 10){
            System.out.println("Digite um número");
            numero = scan.nextInt();
            soma = soma + numero;
            cont = cont + 1;

        }

        //Resultado:
        System.out.println("A soma dos 10 números é : "+soma);
    }
}