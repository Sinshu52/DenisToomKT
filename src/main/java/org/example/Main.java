package jptv23task34denistoom;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Введите имя пользователя: ");
        String yourname = scanner.nextLine();
        System.out.print("Введите фамилию: ");
        String yoursurname = scanner.nextLine();
        System.out.print("Введите ваш личный код: ");
        String id = scanner.nextLine();
        System.out.println(yourname + " " + yoursurname);
        String year = id.substring(1,3);
        String cent = id.substring(0);
        if (cent.contains("4") || cent.contains("3")) {
            System.out.println("Год рождения: 19" + year + " год");
        }
        if (cent.contains("5") || cent.contains("6")) {
            System.out.println("Год рождения: 20" + year + " год");
        }

        String month = id.substring(4,5);
        System.out.print("Месяц: "+month+", ");
        String day = id.substring(5,7);
        System.out.println("День: "+day);

    }
}

public class JPTV23Task4DenisToom {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            int randomNumber = (int) (Math.random() * 51) * 2 + 1;
            array[i] = randomNumber;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
        Arrays.sort(array);
        double sum = 0;
        for (int value : array) {
            sum += value;
        }
        double average = sum / array.length;
        System.out.println("\nОтсортированный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.println("\nСреднее арифметическое: " + average);
    }
}