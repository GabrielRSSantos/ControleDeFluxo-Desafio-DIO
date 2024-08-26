package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o PRIMEIRO parâmetro:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o SEGUNDO parâmetro:");
        int numero2 = scanner.nextInt();

        Contador contador = new Contador();

        contador.contar(numero1, numero2);
    }
}
