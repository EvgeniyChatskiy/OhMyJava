package Homework01.Task01;
public class program{
    public static void main(String[] args) {
        System.out.printf("Введите число: ");
        int num = lib.getNum();
        for (int i = 1, j = 1, h = 1; i < num; i++){
            j += i + 1;
            h *= i + 1;
            if (i == num - 1){
                System.out.printf("Треугольный результат: %d\nИнтегральный результат: %d", j, h);
            }
        }
    }
}
