//Fazer um programa que calcula e mostra a área de um círculo, sabendo que: Área = pi * R2.

import java.util.Scanner;


public class Area {
    public static void main(String[] args){
        double area, raio;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite aqui o valor do raio: ");
        raio = scanner.nextDouble();
        area = 3 * (raio * raio); //pi está sendo considerado como 3
        System.out.println("A area do circulo de raio igual a " + raio + " e: " + area);

        scanner.close();

    }
    
}
