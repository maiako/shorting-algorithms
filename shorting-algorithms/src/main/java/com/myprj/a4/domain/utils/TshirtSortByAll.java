/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myprj.a4.domain.utils;

import com.myprj.a4.domain.Tshirt;
import java.util.Comparator;

/**
 *
 * @author Μ
 */
public class TshirtSortByAll implements Comparator<Tshirt> {

    @Override
    public int compare(Tshirt o1, Tshirt o2) {
        int compSize = o1.getSize().compareTo(o2.getSize());
        if (compSize == 0) {
            int compColor = o1.getColor().compareTo(o2.getColor());
            if (compColor == 0) {
                int compFabric = o1.getFabric().compareTo(o2.getFabric());
                if (compFabric == 0) {
                    return 1;
                } else {
                    return compFabric;
                }
            } else {
                return compColor;
            }
        } else {
            return compSize;
        }
    }

    @Override
    public Comparator<Tshirt> reversed() {
        return Comparator.super.reversed();
    }

}
