/*Задание
Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.
Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество.

Создайте метод
public boolean equals(Object o)

Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
Создайте метод

public int hashCode()

который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использовать Objects.hash(...))
Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.*/

package Homework06;

import java.util.Arrays;
import java.util.HashSet;

public class cats {
    String species;
    String name;
    String eyesColor;
    Integer age;
    Integer id;

    @Override
    public String toString(){ 
       return String.format("Порода: %s / Имя: %s / Цвет глаз: %s / возраст: %d", species, name, eyesColor, age);        
    }

    @Override
    public boolean equals(Object o){ // Переопределяем логику сравнивания объектов
        cats c = (cats) o;
        return id == c.id && name == c.name && species == c.species && eyesColor == c.eyesColor && age == c.age;             
    }

    @Override
    public int hashCode(){
       return id;        
    }
    public static void main(String[] args) {

        cats cat1 = new cats();
        cat1.id = 0001;
        cat1.species = "Мейн-кун";
        cat1.name = "Пипидастрик";
        cat1.eyesColor = "Синий";
        cat1.age = 3;

        cats cat2 = new cats();
        cat2.id = 0002;
        cat2.species = "Манчкин";
        cat2.name = "Апофеозий";
        cat2.eyesColor = "Красный";
        cat2.age = 4;

        cats cat3 = new cats();
        cat3.id = 0002;
        cat3.species = "Манчкин";
        cat3.name = "Апофеозий";
        cat3.eyesColor = "Красный";
        cat3.age = 4;

        var cats = new HashSet<cats>(Arrays.asList(cat1, cat2, cat3));
        for (cats cat : cats){
            System.out.println(cat); 
        }
        System.out.println(cats.contains(cat3)); // Убеждаемся, что третий котик сохранился во множестве
        System.out.println(cat2.equals(cat3)); // Переопределение метода equals вернет в данном случае true. Дефолтные настройки возвращают false
    }
   
}
