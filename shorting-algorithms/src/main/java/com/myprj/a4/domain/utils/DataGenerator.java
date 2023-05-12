/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myprj.a4.domain.utils;

import com.myprj.a4.domain.Color;
import com.myprj.a4.domain.Fabric;
import com.myprj.a4.domain.Size;
import com.myprj.a4.domain.Tshirt;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Μ
 */
public class DataGenerator {

    public List<Tshirt> generateTshirts(int number) {

        List<Tshirt> tshirtList = new ArrayList<Tshirt>();

        for (int i = 0; i < number; i++) {
            tshirtList.add(
                    new Tshirt(
                            "Tshirt(" + i + ")",
                            Color.randomColor().name(),
                            Size.randomSize().name(),
                            Fabric.randomFabric().name()
                    ));

        }

        return tshirtList;
    }

}
