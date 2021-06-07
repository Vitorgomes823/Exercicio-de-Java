import java.util.*;

public class Exercicio3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Olá, seja muito bem vindo.");
        System.out.println("Insira o Primeiro número: ");
        int n1 = scan.nextInt();
        System.out.println("Insira o segundo número: ");
        int n2 = scan.nextInt();
        System.out.println("Insira o terceiro número: ");
        int n3 = scan.nextInt();
        
        int maior = n1;
        int menor = n1;
        int segundo_maior = n1;
    
        if (n2 > n1) {
            maior = n2;
        }
    
        if (n3 > n1) {
            maior = n3;
        }
    
        if (n2 < menor) {
            menor = n2;
        }

        if (n3 < menor) {
            menor = n3;
        }

        if ((n2 < maior) & (n2 > menor)) {
            segundo_maior = n2;
        }

        if ((n3 < maior) & (n3 > menor)) {
            segundo_maior = n3;
        }

        int total = maior + segundo_maior;

        System.out.println("A soma do maior com o segundo maior é : "+total);
    }

}
    


    