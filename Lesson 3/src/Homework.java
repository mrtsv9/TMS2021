import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        printArray();
        System.out.println(operation(1));
        System.out.println(operation(-20));
        System.out.println(operation(0));
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6, 7, 99, 100, 101, 110}));
        calculateSumOfDiagonalElements();
        countDevs(103);
        foobar(6);
        foobar(10);
        foobar(15);
        printMatrix();
        printPrimeNumbers();
    }

    /**
     * Необходимо прочитать с консоли значение числа типа int,
     * далее создать одноменрый массив типа int размера прочитаного с консоли
     * далее заполнить массив случайными значениями
     * далее вывести массив на консоль
     */

    private static void printArray() {
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int arr[] = new int[len];
        Random rand = new Random();

        for (int i = 0; i < len; i++){
            int j = rand.nextInt(100);
            arr[i] = j;
        }

        System.out.println(Arrays.toString(arr));
    }

    /**
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0 , то замените значение number на 10
     * вернуть number после выполнения операций
     */
    public static int operation(int number) {

        if(number > 0) {
            number++;
        }
        else if (number < 0) {
            number -= 2;
        }
        else {
            number = 10;
        }

        return number;
    }

    /**
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */
    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        int counter = 0;

        for (int i = 0; i < ints.length; i++) {

            if (ints[i] % 2 != 0) {
                counter++;
            }

        }

        return counter;
    }

    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     * @param count - количество программистов
     */
    public static void countDevs(int count) {
        if (count == 1 | count % 10 == 1 && count != 11) {
            System.out.println(count + " программист");
        }
        else if ((count > 1 && count < 5) | (count % 10 > 1 && count % 10 < 5) && (count < 12 | count > 15)) {
            System.out.println(count + " программиста");
        }
        else {
            System.out.println(count + " программистов");
        }

    }

    /**
     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
     */
    public static void foobar(int number) {
        if (number % 3 == 0) {
            System.out.println("foo");
        }
        if (number % 5 == 0) {
            System.out.println("bar");
        }
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("foobar");
        }
    }

    /**
     * заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали
     */
    public static void calculateSumOfDiagonalElements() {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("Int rows: ");
        int rows = input.nextInt();
        System.out.println("Int cols: ");
        int cols = input.nextInt();

        int counter = 0;
        int arr[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {

            for(int j = 0; j < cols; j++) {
                arr[i][j] = rand.nextInt(10);
                if (i == j) {
                    counter += arr[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(counter);
    }


    /**
     * Шаги по реализации:
     * - Прочитать два int из консоли
     * - Создайте двумерный массив int (используйте целые числа, которые вы читаете по высоте и ширине консоли)
     * - Заполнить массив случайными значениями (до 100)
     * - Вывести в консоль матрицу заданного размера, но:
     * - Если остаток от деления элемента массива на 3 равен нулю - выведите знак "+" вместо значения элемента массива.
     * - Если остаток от деления элемента массива на 7 равен нулю - выведите знак "-" вместо значения элемента массива.
     * - В противном случае выведите "*"
     * <p>
     * Example:
     * - Значения с консоли - 2 и 3
     * - Массив будет выглядеть так (значения будут разными, потому что он случайный)
     * 6 11 123
     * 1 14 21
     * - Для этого значения вывод в консоли должен быть:
     * <p>
     * + * *
     * * - +
     * <p>
     * Обратите внимание, что 21% 3 == 0 и 21% 7 = 0, но выводить надо не +-, а +
     */
    public static void printMatrix() {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("Int rows: ");
        int rows = input.nextInt();
        System.out.println("Int cols: ");
        int cols = input.nextInt();

        int counter = 0;
        int arr[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
               arr[i][j] = rand.nextInt(100);
            }
        }
        System.out.println(Arrays.deepToString(arr));
        char arrChar[][] = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if (arr[i][j] % 3 == 0) {
                    arrChar[i][j] = '+';
                }
                else if (arr[i][j] % 7 == 0) {
                    arrChar[i][j] = '-';
                }
                else {
                    arrChar[i][j] = '*';
                }
            }
        }
        System.out.println(Arrays.deepToString(arrChar));
    }

    /**
     * Задача со звездочкой!
     * Метод должен печатать все простые числа <1000
     * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
     */

    // только если так
    public static void printPrimeNumbers() {
        boolean isPrime = true;
        for (int i = 0; i < 1000; i++) {
            for (int j = 2; j*j <= 1000; j++) {
                if (i == 1) {
                    isPrime = false;
                    break;
                }
                if(i == 2 || i == 3 || i == 5 || i == 7) {
                    break;
                }
                else  if (i > 10 && i < 37) {
                    for (int k = 2; k < 10; k++) {
                        if (i % k == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }
                else if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
            isPrime = true;
        }
    }
}