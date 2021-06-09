import java.util.Scanner;

public class  Exercicio7{
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);

        //Números:
        int numero = 0;
        int soma = 0;
        int cont = 1;

        //Função:
        while (cont <= 10) {
            System.out.println("Digite um número: ");
            numero = scan.nextInt();

            if (numero <= 40) {
                soma = soma + numero;
            }

            cont = cont + 1;
        }
        
        //Resultado:
        System.out.println("O resultado da soma é : "+soma);
    }
}