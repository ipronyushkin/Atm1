package com.company;

import java.util.*;

public class Main {
    /*а что если вводить буквы вместо чисел?
    или большие числа?
    или что-то = 0/отрицательное? или типа double
    в git intelij idea файлы не нужны, смотри gradle*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of money: ");
        int cash = input.nextInt();
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int[] banknote = new int[size];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            banknote[i] = input.nextInt();
        }
        Arrays.sort(banknote);
        Atm a = new Atm();
        ArrayList<String> ans = new ArrayList<String>();
        String str = "";
        a.getAnswer(cash, banknote, size - 1, str, ans);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }
        System.out.println(ans.size());
    }
}
