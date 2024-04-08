//Fazer um programa que recebe três notas e seus respectivos pesos, calcula e mostra a média ponderada dessas notas

import java.util.Scanner;

public class MediaPonderada {
    public static void main (String[] args){
        int nota1, nota2, nota3;
        double peso1, peso2, peso3, media;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        nota1 = scanner.nextInt();
        System.out.println("Digite o peso da primeira nota: ");
        peso1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = scanner.nextInt();
        System.out.println("Digite o peso da segunda nota: ");
        peso2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = scanner.nextInt();
        System.out.println("Digite o peso da terceira nota: ");
        peso3 = scanner.nextDouble();

        media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3) / (peso1 + peso2 + peso3));
        
        System.out.println("A media podenrada e: " + media);

        scanner.close();

    }
    
}
