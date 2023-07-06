package Homework05;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class contacts {
    public static Map<String, List<Integer>> contactInfo = new HashMap<>();
    static Scanner iScan = new Scanner(System.in);

    final static String outputFilePath = "Homework05\\\\directory.txt";
    public static void main(String[] args) {

        boolean isContinue = true;
        String[] contacts = {
            "123456 Иванов",
            "245392 Петрова",
            "942348 Петрова",
            "829252 Антонов",
            "252572 Иванов",
            "114818 Васильев",
            "582427 Невский",
            "857258 Курицын",
            "252588 Иванова",
            "427258 Бастрыкина",
            "225665 Пригожина",
            "512525 Князев"
        };

        for (String data : contacts){
            String[] parts = data.split(" ");
            contactInfoAdd(contactInfo, parts);
        }
        while (isContinue) {
            System.out.printf("1: Добваить контакт;\n2: Найти контакт;\n3: Завершить работу.\n\nВведите номер операции: ");
            String choise = iScan.nextLine();
            switch (choise) {
                case "1":
                System.out.printf("Введите номер телефона и фамилию контакта через пробел: ");
                    String s = iScan.nextLine();
                    String[] parts = s.split(" ");
                    contactInfoAdd(contactInfo, parts);                    
                    break;

                case "2":
                    System.out.printf("Введите фамилию контакта: ");
                    contactInfoFind(contactInfo);
                    break;

                case "3":
                    isContinue = false;
                    continue;
            }
            System.out.println(contactInfo);
        }
        iScan.close();
    }
    public static Map<String, List<Integer>> contactInfoAdd(Map<String, List<Integer>> contactInfo, String[] parts){
        if (contactInfo.containsKey(parts[1])){
            contactInfo.get(parts[1]).add(Integer.parseInt(parts[0]));
        }
        else{
            List<Integer> list = new ArrayList<>();
            list.add(Integer.parseInt(parts[0]));
            contactInfo.put(parts[1], list);
        }
        return contactInfo;
    }
    public static void contactInfoFind(Map<String, List<Integer>> contactInfo){
        String secondName = iScan.nextLine();
        System.out.println(secondName);
        System.out.println("----------");
        for (Integer number : contactInfo.get(secondName)){
            System.out.println(number);
        }
    }
}