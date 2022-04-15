import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();


        //Задание 1

        double allSum = 0; //int для задачи 1, для 3 -  double

        for (int i : arr) {
            allSum += i;
        }
        System.out.println("Сумма трат за месяц составила " + allSum +" рублей");

        //Задание 2
        System.out.println(Arrays.toString(arr)); //для наглядности
        int minSum = 1_000_000;
        int maxSum = 0;
        for (int i: arr) {
            if (i > maxSum) {
                maxSum = i;
            }
            if (minSum > i) {
                minSum = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " +  minSum + " рублей \n" +
                "Максимальная сумма трат за день составила " + maxSum + " рублей");

        //Задание 3
        //для нее взял уже готовый из 1 задачи цикл, поменяв тип переменной allSum на double вместо int

        double averageSum;
        averageSum = allSum / 30;
        System.out.println("Средняя сумма трат за месяц составила " + averageSum + " рублей");


        //Задание 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        //1 вариант
//        char rightFullName;
//        for (int i = 0; i < reverseFullName.length/2; i++) {
//            rightFullName = reverseFullName[reverseFullName.length - i - 1];
//            reverseFullName[reverseFullName.length - i - 1] = reverseFullName[i];
//            reverseFullName[i] = rightFullName;
//        }
//        System.out.println(reverseFullName);

        //2 вариант
        for (int i = reverseFullName.length-1; i >=0 ; i--) {
            if (i==0){
                System.out.println(reverseFullName[i]);
            } else {
                System.out.print(reverseFullName[i]);
            }

        }





    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}

