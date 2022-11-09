package HomeWorkApp;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        check1(-1, -3);
        check2(5);
        check3(51);
        check4("Bob", 5);
        check5(2001);
    }

    static void printThreeWords() {
        System.out.println("Orange,\nBanana,\nApple.");
    }

    static void checkSumSign() {
        int a = 10;
        int b = -20;
        double sum = a + b;
        if (sum >= 0) {
            System.out.println("Sum is positive");
        } else {
            System.out.println("Sum is negative");
        }
    }

    static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else if (value > 100) {
            System.out.println("Green");
        }
    }

    static void compareNumbers() {
        int a = 21;
        int b = 20;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    static boolean check1(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            System.out.println("Correct");
            return true;
        } else {
            System.out.println("Incorrect");
            return false;
        }
    }

    static void check2(int a) {
        if (a >= 0) {
            System.out.println(a + " is positive");
        } else {
            System.out.println(a + " is negative");
        }
    }

    static boolean check3(int a) {
        if (a < 0) {
            System.out.println("Negative");
            return true;
        } else {
            System.out.println("Positive");
            return false;
        }
    }

    static void check4(String name, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(name);
        }
    }

    static boolean check5(int year) {
        if (year % 100 == 0 && year % 400 == 0) {
            System.out.println("Leap-year");
            return true;

        } else if (year % 4 == 0 && year % 100 > 0) {
            System.out.println("Leap-year");
            return true;

        } else if (year % 100 == 0) {
            System.out.println("Not leap-year");
        }
        return false;
    }
}
