package ru.lookBag;

public class Main {

    public static void main(String[] args) {
    //Первая задача

        int value = 0;

        while (value < 10) {
            value++;
            System.out.print(value + " ");
        }

        System.out.println();

        for(int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

    // Вторая задача

        int fridaysNumber = 7;
        int daysInMonth = 31;
        for (int i = fridaysNumber; i < daysInMonth; i += 7) {
            System.out.println("Сегодня пятница, " + i + "-е число. Неообходимо подготовить отчет");
        }

        System.out.println();

    // Третья задача

        int cometYears = 79;
        int yearsAgo = 200;
        int yearsNow = 2022;
        int yearsAfter = 100;

        for (int i = 0; i < yearsNow + yearsAfter; i += cometYears){

            if (yearsNow - yearsAgo < i && i < yearsNow + yearsAfter) {
                System.out.println(i);
            }
        }
        System.out.println();

    // Четвертая задача

        int ping = 3;
        int pong = 5;
        int quantity = 30;

        for (int i = 1; i <= quantity; i++) {
            System.out.print(i + ": ");

            if (i % ping == 0) {
                System.out.print("ping ");
            }

            if (i % pong == 0) {
                System.out.print("pong ");
            }

            System.out.println();

        }

        System.out.println();

    // Пятая задача

        int firstNumber = 0;                                                //Немного расширил задачу, чтобы программа
        int secondNumber = 1;                                               //смогла выводить больше 8 чисел,
        int elementsOfNumericalSequence = 8;                                //причем если их больше 20, выводила в столбик
        int sum;

        if (elementsOfNumericalSequence <= 20) {
            System.out.print(firstNumber + " ");
            System.out.print(secondNumber + " ");

            for (int i = 0; i < elementsOfNumericalSequence; i++) {
                sum = firstNumber + secondNumber;
                System.out.print(sum + " ");
                firstNumber = secondNumber;
                secondNumber = sum;
            }
        } else {
            System.out.println(firstNumber);
            System.out.println(secondNumber);

            for (int i = 0; i < elementsOfNumericalSequence; i++) {
                sum = firstNumber + secondNumber;
                if (sum < 0)                                                //Также добавил еще одно условие, т.к. как при перегрузке
                    break;                                                  //типа int джава начинает выводить отрицательные числа :(
                System.out.println(sum);
                firstNumber = secondNumber;
                secondNumber = sum;
            }
        }
    }
}
