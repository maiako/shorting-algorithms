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
public class CustomChainFabricComp implements Comparator<Tshirt> {

    @Override
    public int compare(Tshirt o1, Tshirt o2) {
        if (o1.getFabric()
                .compareTo(o2.getFabric()) > 0) {
            return 1;
        } else if (o1.getFabric()
                .compareTo(o2.getFabric()) == 0) {

            if (o1.getColor()
                    .compareTo(o2.getColor()) > 0) {
                return 1;
            } else if (o1.getColor()
                    .compareTo(o2.getColor()) == 0) {
                return 0;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }

}
