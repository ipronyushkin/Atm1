package com.company;

import org.junit.*;
import java.util.*;

public class TestAtm {
    private Atm new_obj;
    private String str;
    private ArrayList<String> ans;

    @Before
    public void getObj(){
        new_obj = new Atm();
        str = "";
        ans = new ArrayList<String>();
    }

    @Test
    public void test_getAnswer01() {
        int cash = 5;
        int[] banknote = {2, 3};
        int ind = banknote.length - 1;
        new_obj.getAnswer(cash, banknote, ind, str, ans);
        Assert.assertEquals(ans, Arrays.asList("32"));
    }

    @Test
    public void test_getAnswer02() {
        int cash = 4;
        int[] banknote = {1, 2};
        int ind = banknote.length - 1;
        new_obj.getAnswer(cash, banknote, ind, str, ans);
        Assert.assertEquals(ans, Arrays.asList("22", "211", "1111"));
    }

    @Test
    public void test_getAnswer03() {
        int cash = 9;
        int[] banknote = {5, 7};
        int ind = banknote.length - 1;
        new_obj.getAnswer(cash, banknote, ind, str, ans);
        Assert.assertEquals(ans, Arrays.asList());
    }
}