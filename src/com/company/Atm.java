package com.company;

import java.util.ArrayList;

public class Atm {
    public static void getAnswer(int cash, int[] banknote, int ind, String str, ArrayList<String> ans) {
        for (int i = ind; i > -1; i--) {
            if (cash - banknote[i] > 0) {
                str += Integer.toString(banknote[i]);
                ind = i;
                getAnswer(cash - banknote[i], banknote, ind, str, ans);
                str = str.substring(0, str.length() - 1);
            } else if (cash - banknote[i] == 0) {
                str += Integer.toString(banknote[i]);
                ans.add(str);
                str = str.substring(0, str.length() - 1);
            }
        }
    }
}
