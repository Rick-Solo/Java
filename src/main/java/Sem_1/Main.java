package Sem_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    task1();
    task2();
    task3();
    }
/**
    1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
*/
    public static void task1(){
        System.out.printf("\nExercise 1\n");
        System.out.printf("Enter the number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = n*(n+1)/2;
        System.out.println("треугольное число = " + a);

        System.out.println("n!= " + factorial(n));
    }
    static double factorial(int number){
       if (number == 0) return 1;
       else if (number == 1) return 1;
        return number * (number-1);
    }

    /**
    2. Вывести все простые числа от 1 до 1000
    */

    public static void task2(){
        System.out.printf("\nExercise 2\n");
        boolean b = true;
        for (int P = 2; P <= 1000; P++) {
            for (int i = 2; i < P; i++) {
                if (P % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.printf("%d, ", P);
            else b = true;
        }
    }

    /**
    3. Реализовать простой калькулятор.
     */

    public static void task3(){
        System.out.printf("\nExercise 3\n");
        Calculator.Calculator();
    }
}
