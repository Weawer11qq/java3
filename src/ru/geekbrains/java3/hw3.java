package ru.geekbrains.java3;

import java.util.Random;
import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        int min = 0;
        int max = 9;
        int ans = 0; // ответ пользователя. сыграет хоть один раз.
        do {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int a = random.nextInt(9); //генерируем число до 9
            print("Угадай число от 0 до 9");
            print("Твое число? ");
            for (int i = 0; i < 3; i++) {
                int b;
                do {
                    b = scanner.nextInt(); //получили число пользователя
                    //  print("Целься лучше от 0 до 9");
                } while (b < min || b > max);
                if ((a == b)) {
                    print("Ты угадал!");
                    break; // выход из игры
                } else if ((a < b)) {
                    print("Нужно меньшее число! ");
                } else {
                    print("Нужно большее число! ");
                }
            }
            print("Число было: " + a);
            print("Еще раз сыграем? 1 – да / 0 – нет");
            ans = scanner.nextInt(); //получили ответ пользователя
        } while (ans == 1);
        print("Хорошо поиграли! Пока!");
    }


    private static void print(String... s) {
        for (String item : s) {
            System.out.println(item);
        }
    }

    private static void print(int... s) {
        for (int item : s) {
            System.out.println(item);
        }
    }
}
