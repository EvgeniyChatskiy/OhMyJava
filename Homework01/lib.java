package Homework01;
import java.util.Scanner;

public class lib {
    public static int getNum(){
        Scanner iScanner = new Scanner(System.in);
        int num = iScanner.nextInt();
        iScanner.close();
        return num;
    }
}
