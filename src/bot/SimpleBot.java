package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // ссылка на ввод данных от пользователя.

    public static void main(String[] args) {
        greet("Assistant v1.0.1.", "2022"); // приветствие пользователя.
        remindName(); // знакомство ассистента с пользователем.
        guessAge(); // угадать возраст пользователя.
        count(); // сосчитать по порядку до N числа.
        test(); //  викторина из одного вопроса.
        end(); // попрощаться с пользователем.
    }

    static void greet(String assistantName, String birthYear) {  // имя и день рождения ассистента.
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine(); // пользователь ввел свое имя.
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt(); // пользователь сосчитал остаток от деления своего возраста на 3.
        int rem5 = scanner.nextInt(); // пользователь сосчитал остаток от деления своего возраста на 5.
        int rem7 = scanner.nextInt(); // пользователь сосчитал остаток от деления своего возраста на 7.
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105; // ассистент сосчитал возраст пользователя.
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i); // перечислить по порядку числа до N-ого!
        }
    }

    static void test() {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");

        int answer = scanner.nextInt();
        while (answer != 2) {  // пробуем заново пока ответ не будет равен 2.
            System.out.println("Please, try again.");
            answer = scanner.nextInt();
        }
    }
    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
