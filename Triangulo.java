//Fazer um programa que calcula e mostra a área de um triângulo, sabendo que: Área = (base *altura)/2.

import java.util.Scanner;

public class Triangulo {
    public static void main (String[] args){
        int base, altura, area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor da base do seu triangulo: ");
        base = scanner.nextInt();
        System.out.println("Agora digite o valor da altura do seu triangulo: ");
        altura = scanner.nextInt();
        area = (base * altura) / 2;
        System.out.println("A area de seu triangulo e igual a " + area);

        scanner.close();

    }
    
}
