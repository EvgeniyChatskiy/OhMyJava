package Homework03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Collections;

public class program {
    static Random random = new Random();
    static void deleteEven(ArrayList<Integer> numbers){
        Iterator<Integer> i = numbers.iterator();
        while(i.hasNext()){
            int item = (Integer) i.next();
            if (item % 2 == 0){
                i.remove();
            }
        }
        System.out.println("Отфильтрованы чётные числа: " + numbers);
    }
    static void minMaxMid(ArrayList<Integer> numbers){
        System.out.println("Максимальное число: " + (Collections.max(numbers)));
        System.out.println("Минимальное число: " + (Collections.min(numbers)));
        Integer sum = 0;
        if(!numbers.isEmpty()) {
            for (Integer i : numbers) {
                sum += i;
            }
        }
        System.out.printf("Среднее арифметическое число: %.2f\n", (sum.doubleValue() / numbers.size()));
    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int size = random.nextInt(7, 15);
        for (int i = 0; i < size; i++){
            numbers.add(random.nextInt(1, 100));
        }
        System.out.println("Сгенерирован массив чисел: " + numbers);
        minMaxMid(numbers);
        deleteEven(numbers);
    }


}
