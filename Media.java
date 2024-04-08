//Fazer um programa que recebe três notas, calcula e mostra a média aritmética dessas notas.

import java.util.Scanner;

public class Media {
    public static void main (String[] args) {
        int num1, num2, num3;
        double media;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        num1 = scanner.nextInt();
        System.out.println("Digite mais um numero inteiro: ");
        num2 = scanner.nextInt();
        System.out.println("Digite o ultimo numero para obtermos a media: ");
        num3 = scanner.nextInt();

        media = (num1 + num2 + num3) / 3;
        System.out.println("A media de " + num1 + " + " + num2 + " + " + num3 + " = " + media);
    
        scanner.close();
        
    }
        
}
