import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework4 {

    public static void countAmoebas () {
        int amoebas = 1;
        int value = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter number of hours (multiple to 3): ");
            value = input.nextInt();
        } while (value % 3 != 0);
        for (int i = 0; i < value; i += 3) {
            amoebas *= 2;
        }

        System.out.println("Through " + value + " hours there are " + amoebas + " amoebas");
    }

    public static void summ(int a, int b) {
        int result = 0;
        if (b > 0) {
            for (int i = 0; i < b; i++) {
                result += a;
            }
        } else if (a > 0) {
            for (int i = 0; i < a; i++) {
                result += b;
            }
        } else if(a < 0 && b < 0) {
            for (int i = 0; i > b; i--) {
                result += a;
            }
        }
        System.out.println("The result is: " + result);
    }

    public static void matrix() {
        char arr[][] = new char[4][4];

        char symb = '*';
        int elementsToDraw;

        // for a & b
        for (int i = 0; i < 4; i++) {
            elementsToDraw = i+1;
            for (int j = 3; j > -1; j--) {
                if (elementsToDraw != 0) {
                    arr[i][j] = symb;
                    elementsToDraw--;
                } else {
                    arr[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j]);
                if (j == 3) {
                    System.out.print("    ");
                    for (int k = 0; k < i+1; k++ ) {
                        System.out.print(symb);
                    }
                }
            }
            System.out.println();
        }

        System.out.println();

        // for c & d
        for (int i = 0; i < 4; i++) {
            elementsToDraw = 4-i;
            for (int j = 3; j > -1; j--) {
                if (elementsToDraw != 0) {
                    arr[i][j] = symb;
                    elementsToDraw--;
                } else {
                    arr[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j]);
                if (j == 3) {
                    System.out.print("    ");
                    for (int k = 4; k > i; k-- ) {
                        System.out.print(symb);
                    }
                }
            }
            System.out.println();
        }

    }

    public static void checkNumber(int number) {
        String str = String.valueOf(number);
        char strChar[] = str.toCharArray();
        int counter = 0;
        boolean isPositive = true;
        for (int i = 0; i < str.length(); i++) {
            if (strChar[i] == '-') {
                isPositive = false;
                continue;
            }
            counter++;
        }
        if (isPositive) {
            System.out.println("The number is positive and there are " + counter + " digits");
        } else {
            System.out.println("The number is negative and there are " + counter + " digits");
        }
    }

    public static void main(String[] args) {
//        Задачи:
//         1) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//   сколько амеб будет через 3, 6, 9, 12,..., 24 часа
//        countAmoebas();
//        2) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.
//        summ(10, -20);
//        3) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида
//        matrix();
//        a)                  b)
//              *        *
//            * *        * *
//          * * *        * * *
//        * * * *        * * * *
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *

//        4)В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"
        checkNumber(-1304215);
//        5) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).

//        6) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10

//        7) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.

//        8) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом

//        9) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов

//        10) Создаём квадратную матрицу, размер вводим с клавиатуры.
//        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
//        Пример:
//          1 2 3 4      1 6 3 1
//          6 7 8 9      2 7 3 5
//          3 3 4 5      3 8 4 6
//          1 5 6 7      4 9 5 7

    }
}