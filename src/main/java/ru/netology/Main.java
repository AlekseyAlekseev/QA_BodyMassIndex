package ru.netology;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiService service = new BmiService();

        System.out.print("Введите ваш вес в килограммах: ");
        double weight = scanner.nextDouble();

        System.out.print("Введите ваш рост в метрах. Например - 1,87: ");
        double height = scanner.nextDouble();


        double result = service.calculate(weight, height);

        System.out.println("Ваш индекс массы тела равен: " + result);
        scanner.close();
    }



}
