import java.util.Arrays;

public class Main {
    // ANSI-коды для цветов
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";

    public static void main(String[] args) {
        // Задача 1: Объявление массивов
        int[] intArray = {1, 2, 3};
        double[] doubleArray = {1.57, 7.654, 9.986};
        String[] stringArray = {"apple", "banana", "cherry"};

        // Задача 2: Вывод элементов по порядку
        System.out.println(BLUE + "Задача 2: Вывод массивов по порядку" + RESET);
        System.out.println(GREEN + "Целочисленный массив: " + RESET + arrayToString(intArray));
        System.out.println(GREEN + "Массив с дробными числами: " + RESET + arrayToString(doubleArray));
        System.out.println(GREEN + "Произвольный массив: " + RESET + arrayToString(stringArray));
        System.out.println();

        // Задача 3: Вывод элементов в обратном порядке
        System.out.println(BLUE + "Задача 3: Вывод массивов в обратном порядке" + RESET);
        System.out.println(YELLOW + "Целочисленный массив: " + RESET + arrayToStringReverse(intArray));
        System.out.println(YELLOW + "Массив с дробными числами: " + RESET + arrayToStringReverse(doubleArray));
        System.out.println(YELLOW + "Произвольный массив: " + RESET + arrayToStringReverse(stringArray));
        System.out.println();

        // Задача 4: Преобразование нечетных чисел в четные
        System.out.println(BLUE + "Задача 4: Преобразование нечетных чисел в четные" + RESET);
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0) {
                intArray[i]++;
            }
        }
        System.out.println(RED + "Измененный целочисленный массив: " + RESET + Arrays.toString(intArray));
    }

    // Метод для преобразования массива в строку без скобок
    private static String arrayToString(int[] array) {
        return Arrays.toString(array).replaceAll("[\\[\\]]", "");
    }

    private static String arrayToString(double[] array) {
        return Arrays.toString(array).replaceAll("[\\[\\]]", "");
    }

    private static String arrayToString(String[] array) {
        return Arrays.toString(array).replaceAll("[\\[\\]]", "");
    }

    // Метод для вывода массива в обратном порядке
    private static String arrayToStringReverse(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            sb.append(array[i]);
            if (i != 0) sb.append(", ");
        }
        return sb.toString();
    }

    private static String arrayToStringReverse(double[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            sb.append(array[i]);
            if (i != 0) sb.append(", ");
        }
        return sb.toString();
    }

    private static String arrayToStringReverse(String[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            sb.append(array[i]);
            if (i != 0) sb.append(", ");
        }
        return sb.toString();
    }
}
