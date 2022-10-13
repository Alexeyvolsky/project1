public class HM {
    public static void main(String[] args) {
        // Task №1
        System.out.println("Task 1");
        double result1 = 0;
        double day = 0;
        for (int i = 0; i < 7; i++){
            if (i == 0) {
                day = 10;
            } else {
                day *= 1.1;
            }
            result1 += day ;
        }
        System.out.println("Result1=" + result1);
        // Task №2
        System.out.println("Task2");
        int hours = 0;
        for ( int i = 0; i <= 24; i += 3) {
            if (i == 0) {
                hours = 1;
            } else {
                hours = hours *= 2;
            }
            System.out.println(hours);
        }
        // Task №3
        System.out.println("Task 3");
        int result3 = 0;
        for (int i = 1; i <= 256; i *= 2) {
            result3 += i;
        }
        System.out.println(result3);

        // Task№4
        System.out.println("Task 4");
        int a = 4;
        int b = 6;
        int result4 = 0;
        while (result4 < a * b) {
            result4 += a;
        }
        System.out.println(result4);

        // Task№5
        System.out.println("Task5");
        float k = 2.54f;
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " = " + i * k);
        }

        // Task№6
        System.out.println("Task6");
        for (int i = 0; i <= 100; i++) {
            if (i != 0 && i % 2 == 0) {
                System.out.println(i);
            }
        }
        // Task№7
        System.out.println("Task7");
        int result7 = 0;
        for (int i = 1; i <= 99; i ++){
            if (i % 2 != 0) {
                result7 += i;
            }
        }
        System.out.println(result7);

    }
}