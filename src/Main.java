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
    public static void main(String[] args) {
        task1();
    }
}