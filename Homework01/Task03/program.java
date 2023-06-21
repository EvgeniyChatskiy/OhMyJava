package Homework01.Task03;

import java.util.Scanner;

public class program {
    static Scanner iScanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean flag = true;
        
        while(flag != false){
            System.out.printf("1) Умножение\n2) Деление\n3) Сложение\n4) Вычитание\n5) Завершить работу программы\n\nВведите номер операции: ");
            int choice = iScanner.nextInt();

            
            if (choice == 5){
                flag = false;
                System.out.printf("Завершение работы программы\n");
            }
            else{
                System.out.printf("Введите первое число: ");
                int first = iScanner.nextInt();
                System.out.printf("Введите второе число: ");
                int second = iScanner.nextInt();
                System.out.println("");

                if (choice == 1){
                System.out.printf("%d * %d = %d\n\n", first, second, first * second);
                }

                if (choice == 2){
                    float fFirst = (float) first;
                    float fSecond = (float) second;
                    System.out.printf("%d / %d = %.2f\n\n", first, second, fFirst / fSecond); 
                }

                if (choice == 3){
                    System.out.printf("%d + %d = %d\n\n", first, second, first + second);
                }

                if (choice == 4){
                    System.out.printf("%d - %d = %d\n\n", first, second, first - second);
                } 
            }

        }
    }
}

