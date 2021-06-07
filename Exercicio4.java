import java.util.*;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Olá, seja muito bem vindo.");
        System.out.println("Insira o Primeiro número: ");
        float n1 = scan.nextInt();
        System.out.println("Insira o segundo número: ");
        float n2 = scan.nextInt();
        System.out.println("O que deseja fazer ? : \n(1)Somar \n(2)Subtrair \n(3)Multiplicar \n(4)Dividir ");
        int escolha = scan.nextInt();
        float total = 0;
	
        switch (escolha) {
        case 1:
          total = n1 + n2;
          System.out.println("A soma dos números é : "+total);
          break;
        case 2:
          total = n1 - n2;
          System.out.println("A Subtração dos números é : "+total);
          break;
        case 3:
          total = n1 * n2;
          System.out.println("A multiplicação dos números é : "+total);
          break;
        case 4:
          total =  n1 / n2;
          System.out.println("A divisão dos números é : "+total);
          break;
    }
}
}