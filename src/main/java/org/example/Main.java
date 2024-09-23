package jptv23task2denistoom;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите трехзначное число: ");
        int number = scanner.nextInt();

        if (number >= 100 && number <= 999) {
            int digit1 = number / 100;  // Получить первую цифру
            int digit2 = (number / 10) % 10;  // Получить вторую цифру
            int digit3 = number % 10;  // Получить третью цифру

            int sum = digit1 + digit2 + digit3;

            System.out.println("Сумма цифр: " + sum);
        } else {
            System.out.println("Введенное число не является трехзначным.");
        }
    }
}