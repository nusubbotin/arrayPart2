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
        for (int i : arr) {
            summ+= i;
        }
        System.out.println("Сумма трат за месяц составила " + summ + " рублей");
    }

    public static void task2(){
        System.out.println("Задание 2:");
        int[] arr = generateRandomArray();
        int minSumm, maxSumm = 0;

        for (int i : arr) {
            if (maxSumm < i) {
                maxSumm = i;
            }
        }

        minSumm = maxSumm;
        for (int i : arr) {
            if (minSumm > i) {
                minSumm = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSumm
                + " рублей. Максимальная сумма трат за день составила " + maxSumm + " рублей");
    }
    public static void main(String[] args) {
        task1();
        task2();
    }
}