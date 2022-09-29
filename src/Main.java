public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1(){
        System.out.println("Задание 1:");
        int[] arr = generateRandomArray();
        int summ = 0;
        for (int elem : arr) {
            summ+= elem;
        }
        System.out.println("Сумма трат за месяц составила " + summ + " рублей");
    }

    public static void task2(){
        System.out.println("Задание 2:");
        int[] arr = generateRandomArray();
        int minSumm, maxSumm = 0;

        for (int elem : arr) {
            if (maxSumm < elem) {
                maxSumm = elem;
            }
        }

        minSumm = maxSumm;
        for (int elem : arr) {
            if (minSumm > elem) {
                minSumm = elem;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSumm
                + " рублей. Максимальная сумма трат за день составила " + maxSumm + " рублей");
    }

    public static void task3(){
        System.out.println("Задание 3:");
        int[] arr = generateRandomArray();
        int summ = 0;
        float averageSumm = 0;

        for (int elem : arr) {
            summ+= elem;
        }

        averageSumm = (float) summ / arr.length;

        System.out.println("Средняя сумма трат за месяц составила " + averageSumm + " рублей");
    }

    public static void task4(){
        System.out.println("Задание 4:");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
}