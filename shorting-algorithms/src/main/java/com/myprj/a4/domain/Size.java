/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myprj.a4.domain;

import java.util.Random;

/**
 *
 * @author Μ
 */
public enum Size {
    XS, S, M, L, XL, XXL, XXXL;

    public static Size randomSize() {
        int size = new Random().nextInt(
                Size.values().length);

        return Size.values()[size];
    }

    @Override
    public String toString() {
        return Size.values().toString();
    }
}
