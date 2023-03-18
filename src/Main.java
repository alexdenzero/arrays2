import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int[] sallaryArr = generateRandomArray();
        System.out.println(Arrays.toString(sallaryArr));
        int sallarySum = 0;
        for (int sallary = 0; sallary < sallaryArr.length; sallary++) {
            sallarySum = sallaryArr[sallary] + sallarySum;
        }
        System.out.println("Сумма затрат за месяц составила " + sallarySum + " рублей.");
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int[] sallaryArr = generateRandomArray();
        System.out.println(Arrays.toString(sallaryArr));
        int maxSallary = 0;
        int minSallary = 0;
        for (int sallary: sallaryArr) {
            if (sallary > maxSallary) {
                maxSallary = sallary;
                }
            for (int sallary2: sallaryArr) {
            if (sallary2 < minSallary) {
                minSallary = sallary2;
            }
        }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSallary + " рублей." +
                " Максимальная сумма трат за день составила " + maxSallary + " рублей.");
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int[] sallaryArr = generateRandomArray();
        System.out.println(Arrays.toString(sallaryArr));
        int sallarySum = 0;
        for (int sallary = 0; sallary < sallaryArr.length; sallary++) {
            sallarySum = sallaryArr[sallary] + sallarySum;
        }
        double sallaryAverage =(double) sallarySum / sallaryArr.length;
        System.out.println("Средняя сумма трат за месяц составила " +sallaryAverage + " рублей.");
    }


    public static void task4 () {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}

