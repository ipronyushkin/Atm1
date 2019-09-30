package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class GetAns {
    /*cash -- наша сумма, banknote -- массив разменных купюр,
    ind -- индекс в массиве купюр, показывает на самыую высокую по номиналу купюру,
    которыую можем использовать, массив banknote отсортировали выше. Это сделано для того,
    чтобы перебирать варианты с точностью до перестановок купюр.
    str -- строка для хранения вараинта размена, когда нашли вариант складываем его в массив ans
    */
    public static void getAnswer(int cash, int[] banknote, int ind, String str, ArrayList<String> ans) {
        for (int i = ind; i > -1; i--) {  // цикл по массиву купюр, начиная с инедкса ind
            //System.out.println("Index: " + i);
            if (cash - banknote[i] > 0) { // отняли из суммы купюру, если осталась что-то > 0,
                str += Integer.toString(banknote[i]); // то добавляем в str банкноту, начинаем смотреть
                ind = i;                              // этот вариант;
                // далее можем исползовать купюры такие же по достоинтсву, либо ниже
                getAnswer(cash - banknote[i], banknote, ind, str, ans);
                // для дальнейшего поиска убрали последнюю купюру из str
                str = str.substring(0, str.length() - 1); //
            } else if (cash - banknote[i] == 0) { // нашли варинт размена
                str += Integer.toString(banknote[i]); // добавили последнюю купюру вараинта в str
                ans.add(str);                         // положили вараинт в массив
                //System.out.println(str);
                str = str.substring(0, str.length() - 1);
                // для дальнейшего поиска убрали последнюю купюру из str
            }
        }
    }
}
