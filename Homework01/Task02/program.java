package Homework01.Task02;

public class program{
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++){
            for (int j = 1, count = 0; j <= i; j++){
                if (i % j == 0){
                    count++;
                }
                if (count == 2 && j == i){
                    System.out.printf("%d ", i);
                }
            }
        }
    }
}
