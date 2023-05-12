/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myprj.a4.algorithm;

import com.myprj.a4.domain.Tshirt;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Μ
 */
public class QuickSort {

    public List<Tshirt> quicksort(List<Tshirt> array, int begin, int end, Comparator comparator) {

        if (begin < end) {
            int partitionIndex = partition(array, begin, end, comparator);

            quicksort(array, begin, partitionIndex - 1, comparator);
            quicksort(array, partitionIndex + 1, end, comparator);

        }

        return array;

    }

    private static int partition(List<Tshirt> arr, int begin, int end, Comparator comparator) {

        Tshirt pivot = arr.get(end);
        int i = begin - 1;

        for (int j = begin; j < end; j++) {
            if (comparator.compare(arr.get(j), pivot) < 0) {
                i++;

                Tshirt swapTemp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, swapTemp);

            }

        }

        Tshirt swapTemp = arr.get(i + 1);
        arr.set(i + 1, arr.get(end));
        arr.set(end, swapTemp);

        return i + 1;

    }

}
