package main.java.com.prokopchik;

import java.util.Scanner;

public class Input {

    public int consoleInputOneParameter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите четырехзначное число ");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print("Неверный ввод. Введите четырехзначное число ");
        }
        return scanner.nextInt();
    }

    public double consoleInputTwoParameters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите катет  ");
        while (!scanner.hasNextDouble()) {
            scanner.nextLine();
            System.out.print("Неверный ввод. Введите число ");
        }
        return scanner.nextDouble();
    }

    public double consoleInputThreeParameters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите число ");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print("Неверный ввод. Введите число ");
        }
        return scanner.nextDouble();
    }
}
