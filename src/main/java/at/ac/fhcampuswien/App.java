package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number 1: ");

        float number = scanner.nextFloat();
        float largestNumber = Float.NEGATIVE_INFINITY;
        int count = 2;

        if (number <= 0) {
            System.out.println("No number entered.");
        } else {
            while (number > 0) {
                System.out.printf("Number " + count + ": ");

                if (number > largestNumber) {
                    largestNumber = number;
                }

                number = scanner.nextFloat();
                count++;

                if (number <= 0) {
                    break;
                }
            }
            System.out.printf("The largest number is %.2f", largestNumber);
            System.out.println();
        }
    }

    //todo Task 2
    public void stairs() {
        Scanner scanner = new Scanner(System.in);
        int lines = scanner.nextInt();
        System.out.print("n: ");

        if (lines <= 0) {
            System.out.println("Invalid number!");
        } else {
            int number = 1;
            for (int i = 1; i <= lines; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(number + " ");
                    number++;
                }
                System.out.println();
            }
        }
    }

    //todo Task 3
    public void printPyramid() {
        int lines = 6;

        for (int i = 0; i < lines; i++) {
            for (int j = lines - i; j > 1; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("h: ");
        int h = scanner.nextInt();
        System.out.print("c: ");
        char c = scanner.next().charAt(0);

        if (h % 2 == 0) {
            System.out.println("Invalid number!");
        } else {
            int middleRow = h / 2;

            for (int i = 0; i <= middleRow; i++) {
                for (int j = 0; j < middleRow - i; j++) {
                    System.out.print(" ");
                }

                char currChar = (char) (c - i);
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print(currChar);
                    if (j < i) {
                        currChar++;
                    } else {
                        currChar--;
                    }
                }
                System.out.println();
            }

            for (int i = middleRow - 1; i >= 0; i--) {
                for (int j = 0; j < middleRow - i; j++) {
                    System.out.print(" ");
                }

                char currChar = (char) (c - i);
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print(currChar);
                    if (j < i) {
                        currChar++;
                    } else {
                        currChar--;
                    }
                }
                System.out.println();
            }
        }
    }

    //todo Task 5
    public void marks() {
        Scanner scanner = new Scanner(System.in);
        int mark;
        int count = 1;
        int negativeMark = 0;
        int sum = 0;

        while (true) {
            System.out.print("Mark " + count + ": ");
            mark = scanner.nextInt();

            if (mark == 0) {
                break;
            } else {
                if (mark < 1 || mark > 5) {
                    System.out.println("Invalid mark!");
                    continue;
                }

                sum += mark;
                count++;

                if (mark < 3) {
                    negativeMark++;
                }
            }
        }

        if (count == 0) {
            System.out.println("Average: 0.00");
        } else {
            float average = (float) sum / (count);
            System.out.printf("Average: %.2f", average);
            System.out.println();
        }
        System.out.println("Negative marks: " + negativeMark);
    }

    //todo Task 6
    public void happyNumbers() {
        System.out.println("n: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        while (number != 1 && number != 4) {
            while (number > 0) {
                int digit = number % 10;
                sum += digit * digit;
                number /= 10;
            }
            number = sum;
        }
    }

    public static void main(String[] args) {
        App exercise2 = new App();

//        System.out.println("Task 1: Largest Number");
//        exercise2.largestNumber();

//        System.out.println("\nTask 2: Stairs");
//        exercise2.stairs();

//       System.out.println("\nTask 3: Pyramide")
//       exercise2.printPyramid();
//
//        System.out.println("\nTask 4: Raute");
//        exercise2.printRhombus();
//
//        System.out.println("\nTask 5: Notendurchschnitt");
//        exercise2.marks();
//
        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}