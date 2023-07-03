package Homework04.Task03;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class program {
    static File result;
    static FileWriter fileWriter;
    static Scanner iScanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        result = new File("Homework04\\Task03\\result.txt");
        char operation = '0';
        fileWriter = new FileWriter(result);
        
        System.out.printf("Введите операцию '+' '-' '*' '/': ");
        operation  = iScanner.nextLine().charAt(0);

        System.out.printf("Введите первое число: ");
        double first = Double.parseDouble(iScanner.nextLine());

        System.out.printf("Введите второе число: ");
        double second = Double.parseDouble(iScanner.nextLine());
        
        System.out.println("");
        if (operation == '*'){
            fileWriter.write(first + " * " + second + " = " + (first * second) + '\n');
            System.out.println(first + " * " + second + " = " + (first * second));
        }
        if (operation == '/'){
            fileWriter.write(first + " / " + second + " = " + (first / second) + '\n');
            System.out.println(first + " / " + second + " = " + (first / second)); 
        }
        if (operation == '+'){
            fileWriter.write(first + " + " + second + " = " + (first + second) + '\n');
            System.out.println(first + " + " + second + " = " + (first + second)); 
        }
        if (operation == '-'){
            fileWriter.write(first + " - " + second + " = " + (first - second) + '\n');
            System.out.println(first + " - " + second + " = " + (first - second)); 
        } 
        fileWriter.close();
    }
}
