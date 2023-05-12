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
public enum Fabric {
    WOOL, COTTON, POLYESTER, RAYON, LINEN, CASHMERE, SILK;

    public static Fabric randomFabric() {
        int fabric = new Random().nextInt(
                Fabric.values().length);

        return Fabric.values()[fabric];
    }

    @Override
    public String toString() {
        return Fabric.values().toString();
    }
}
