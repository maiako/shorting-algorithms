/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myprj.a4.domain.utils;

import com.myprj.a4.domain.Tshirt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Μ
 */
public class SortUtils {

    public List<Tshirt> createTshirtArrayList(
            int number) {

        List<Tshirt> tshirts = new ArrayList<Tshirt>();
        DataGenerator dg = new DataGenerator();
        tshirts = dg.generateTshirts(number);
        return tshirts;
    }

    public void printTshirtArrayList(
            List<Tshirt> tshirts) {

        for (Tshirt st : tshirts) {
            System.out.println(st.toString());
        }

    }

    public void printStringArray(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public String[] swapStringArray(String[] arr, int x, int y) {
        String buffer;
        buffer = arr[y];
        arr[y] = arr[x];
        arr[x] = buffer;

        return arr;
    }

    public List<Tshirt> swapTshirtArrayList(List<Tshirt> tshirt,
            int x, int y) {

        Tshirt buffer;

        buffer = tshirt.get(y);
        tshirt.set(y, tshirt.get(x));
        tshirt.set(x, buffer);

        return tshirt;
    }

    public int greater(String x, String y) {
        return x.compareTo(y);
    }

    public int greaterTshirt(Tshirt x, Tshirt y) {
        return x.compareTo(y);
    }
}
