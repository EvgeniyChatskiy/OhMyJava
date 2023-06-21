package Homework01.Task01;
import java.util.Scanner;

public class lib {
    static int getNum(){
        Scanner iScanner = new Scanner(System.in);
        int num = iScanner.nextInt();
        iScanner.close();
        return num;
    }
}
