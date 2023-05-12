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
public enum Color {
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET;

    public static Color randomColor() {
        int color = new Random().nextInt(
                Color.values().length);

        return Color.values()[color];
    }

    @Override
    public String toString() {
        return Color.values().toString();
    }

}
