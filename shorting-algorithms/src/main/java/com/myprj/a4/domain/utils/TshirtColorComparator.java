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
public class TshirtColorComparator implements Comparator<Tshirt> {

    @Override
    public int compare(Tshirt o1, Tshirt o2) {
        return o1.getColor().compareTo(o2.getColor());
    }

    @Override
    public Comparator<Tshirt> reversed() {
        return Comparator.super.reversed();
    }

}
