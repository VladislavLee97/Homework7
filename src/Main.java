public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15_000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            month = month + 1;
            total = total + salary;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int nums = 0;
        while (nums < 10) {
            nums = nums + 1;
            System.out.print(nums + " ");
        }
        System.out.println();
        for (nums = 10; nums > 0; nums--) {
            System.out.print(nums + " ");
        }
    }

    public static void task3() {
        System.out.println();
        System.out.println("Задача 3");
        int y = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        for (int i = 1; i <= 10; i++) {
            y = y + y / 1000 * fertility - y / 1000 * mortality;
            System.out.println("Год " + i + " Численность населения составляет " + y);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int total = 15000;
        int i = 1;
        for (; total < 12_000_000; i++) {
            total = total + ((total / 100) * 7);
            System.out.println("Месяц " + i + " Итого " + total);
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int total = 15_000;
        int i = 1;
        for (; total < 12_000_000; i++) {
            total = total + ((total / 100) * 7);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int total = 15_000;
        int month = 12 * 9;
        int i = 1;
        for (; i <= month; i++) {
            total = total + ((total / 100) * 7);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int firstFriday = 3;
        for (int i = firstFriday; i <= 31; i += 7) {
            System.out.println("Пятница " + i + " пора сдавать отчет");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int earlierYears = 1817;
        int currentYears = 1975;
        for (; earlierYears <= 2000; ) {
            earlierYears = earlierYears + 1;
            if (earlierYears % 79 == 0)
                System.out.println(earlierYears);
        }
        while (currentYears < 2075) {
            currentYears = currentYears + 1;
            if (currentYears % 79 == 0) {
                System.out.println(currentYears);
            }
        }
    }
}

