/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myprj.a4.domain.utils;

import com.myprj.a4.domain.Tshirt;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Μ
 */
public class TshirtChainedComparator implements Comparator<Tshirt> {

    List<Comparator<Tshirt>> listOfComparators;

    public TshirtChainedComparator(Comparator<Tshirt>... comparator) {
        this.listOfComparators = Arrays.asList(comparator);
    }

    @Override
    public int compare(Tshirt o1, Tshirt o2) {

        for (Comparator<Tshirt> comparator : listOfComparators) {
            int result = comparator.compare(o1, o2);
            if (result != 0) {
                return result;
            }
        }
        return 0;
    }
}
