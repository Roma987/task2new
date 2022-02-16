package main.java.com.prokopchik;

import java.util.Scanner;

public class Input {

    double b;
    double c;
    double d;

    public int consoleInputOneParameter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите четырехзначное число ");
        while (!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.print("Неверный ввод. Введите четырехзначное число ");
        }
        return scanner.nextInt();
    }

    public void consoleInputTwoParameters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите катет а ");
        while (!scanner.hasNextDouble()) {
            scanner.nextLine();
            System.out.print("Неверный ввод. Введите число ");
        }
        d = scanner.nextDouble();
        System.out.println("введите катет b ");
        while (!scanner.hasNextDouble()) {
            scanner.nextLine();
            System.out.print("Неверный ввод. Введите число ");
        }
        c = scanner.nextDouble();
    }

    public void consoleInputThreeParameters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите первое число ");
        while (!scanner.hasNextDouble()) {
            scanner.nextLine();
            System.out.print("Неверный ввод. Введите число ");
        }
        b = scanner.nextDouble();
        System.out.println("введите второе число ");
        while (!scanner.hasNextDouble()) {
            scanner.nextLine();
            System.out.print("Неверный ввод. Введите число ");
        }
        c = scanner.nextDouble();
        System.out.println("введите третье число ");
        while (!scanner.hasNextDouble()) {
            scanner.nextLine();
            System.out.print("Неверный ввод. Введите число ");
        }
        d = scanner.nextDouble();
    }
}
