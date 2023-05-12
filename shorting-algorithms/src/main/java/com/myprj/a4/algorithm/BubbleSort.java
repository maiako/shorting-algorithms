/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myprj.a4.algorithm;

import com.myprj.a4.domain.Tshirt;
import com.myprj.a4.domain.utils.SortUtils;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Μ
 */
public class BubbleSort {

    public String[] sortStringArray(String[] arr, int asc) {

        SortUtils su = new SortUtils();
        boolean isSorted;

        for (int pass = 0; pass < arr.length; pass++) {
            isSorted = true;

            for (int j = 1; j < (arr.length - pass); j++) {
                if (asc == 1) {
                    if (su.greater(arr[j - 1], arr[j]) > 0) {
                        su.swapStringArray(arr, j, j - 1);
                        isSorted = false;
                    }
                } else {
                    if (su.greater(arr[j - 1], arr[j]) < 0) {
                        su.swapStringArray(arr, j, j - 1);
                        isSorted = false;
                    }
                }
            }
            if (isSorted) {
                break;
            }
        }
        return arr;
    }

    public List<Tshirt> sortTshirtArrayList(List<Tshirt> tshirt, Comparator<Tshirt> comparator, int asc) {

        SortUtils su = new SortUtils();
        boolean isSorted;

        for (int pass = 0; pass < tshirt.size(); pass++) {
            isSorted = true;

            for (int j = 1; j < (tshirt.size() - pass); j++) {
                if (asc == 1) {
                    if (comparator.compare(
                            tshirt.get(j - 1),
                            tshirt.get(j)
                    ) > 0) {
                        su.swapTshirtArrayList(tshirt, j, j - 1);
                        isSorted = false;
                    }
                } else {
                    if (comparator.compare(
                            tshirt.get(j - 1),
                            tshirt.get(j)
                    ) < 0) {
                        su.swapTshirtArrayList(tshirt, j, j - 1);

                        isSorted = false;
                    }
                }
            }
            if (isSorted) {
                break;
            }
        }
        return tshirt;
    }

    public List<Tshirt> sortTshirtArrayListComparable(List<Tshirt> tshirt, int asc) {

        SortUtils su = new SortUtils();
        boolean isSorted;

        for (int pass = 0; pass < tshirt.size(); pass++) {
            isSorted = true;

            for (int j = 1; j < (tshirt.size() - pass); j++) {
                if (asc == 1) {
                    if (tshirt.get(j - 1)
                            .compareTo(tshirt.get(j)
                            ) > 0) {
                        su.swapTshirtArrayList(tshirt, j, j - 1);
                        isSorted = false;
                    }
                } else {
                    if (tshirt.get(j - 1)
                            .compareTo(tshirt.get(j)
                            ) < 0) {
                        su.swapTshirtArrayList(tshirt, j, j - 1);

                        isSorted = false;
                    }
                }
            }
            if (isSorted) {
                break;
            }
        }
        return tshirt;
    }
}
