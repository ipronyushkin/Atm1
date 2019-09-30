package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* вводим данные с клавиатуры*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of money: ");
        int cash = input.nextInt();
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int[] banknote = new int[size];
        System.out.println("Enter array elements: ");
        /* заполняем массив разменных купюр*/
        for (int i = 0; i < size; i++) {
            banknote[i] = input.nextInt();
        }
        Arrays.sort(banknote); // отсортируем массив разменных купюр
        // Выводим данные в консоль
        System.out.println(cash);
        for (int i = 0; i < size; i++) {
            System.out.print(" " + banknote[i]);
        }
        System.out.println();
        /* Выводим ответ в консоль  */
        GetAns a = new GetAns();
        ArrayList<String> ans = new ArrayList<String>(); // сюда помещаем варианты размена нашей суммы
        String str = "";                        // для печати одного варианта размена нашей суммы
        a.getAnswer(cash, banknote, size - 1, str, ans);  // метод, вычисляющий ответ
        for (int i = 0; i < ans.size(); i++) {   // печатаем варианты в консоль
            System.out.println(ans.get(i));
        }
        System.out.println(ans.size());         // количество вариантов - длина динамичекого массива
    }
}
