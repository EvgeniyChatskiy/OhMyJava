package Homework04.Task03;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class program {
    static File resultLog;
    static FileWriter fileWriter;
    static Scanner iScanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        Stack<Double> result = new Stack<>();
        resultLog = new File("Homework04\\Task03\\result.txt");
        String operation;
        fileWriter = new FileWriter(resultLog);
        boolean end = true;
        System.out.printf("введите число: ");
        double first = Double.parseDouble(iScanner.nextLine());
        
        while (end){
            System.out.printf("введите операцию '+' '-' '*' '/': ");
            operation  = iScanner.nextLine();
            while (operation.equals("z")){
                result.pop();
                first = result.peek();
                System.out.println(first + "\nвведите операцию '+' '-' '*' '/': ");
                operation  = iScanner.nextLine();
            }

            System.out.printf("введите число: ");
            double second = Double.parseDouble(iScanner.nextLine());
            System.out.println("");

            switch (operation) {
                case "*":
                    fileWriter.write(first + " * " + second + " = " + (first * second) + '\n');
                    first = lib.multiplication(first, second);
                    result.push(first);
                    System.out.println("результат: " + first + "\nвведите 'z' если желаете отменить последнюю операцию");
                    continue;
            
                case "/":
                    fileWriter.write(first + " / " + second + " = " + (first / second) + '\n');
                    first = lib.division(first, second);
                    result.push(first);
                    System.out.println("результат: " + first + "\nвведите 'z' если желаете отменить последнюю операцию"); 
                    continue;
            
                case "+":
                    fileWriter.write(first + " + " + second + " = " + (first + second) + '\n');
                    first = lib.plus(first, second);
                    result.push(first);
                    System.out.println("результат: " + first + "\nвведите 'z' если желаете отменить последнюю операцию"); 
                    continue;
            
                case "-":
                    fileWriter.write(first + " - " + second + " = " + (first - second) + '\n');
                    first = lib.minus(first, second);
                    result.push(first);
                    System.out.println("результат: " + first + "\nвведите 'z' если желаете отменить последнюю операцию"); 
                    continue;
            
                default:
                    end = false;
                    break;
            }
            fileWriter.close();            
        }
    }
}
