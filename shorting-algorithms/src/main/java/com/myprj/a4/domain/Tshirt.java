/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myprj.a4.domain;

/**
 *
 * @author Μ
 */
public class Tshirt implements Comparable<Tshirt> {

    private String index;
    private String Color;
    private String Size;
    private String Fabric;

    public Tshirt() {
    }

    public Tshirt(String index, String Color, String Size, String Fabric) {
        this.index = index;
        this.Color = Color;
        this.Size = Size;
        this.Fabric = Fabric;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public String getFabric() {
        return Fabric;
    }

    public void setFabric(String Fabric) {
        this.Fabric = Fabric;
    }

    @Override
    public String toString() {
        return String.format(
                "%s\t%s\t%s\t%s",
                index, Color, Size,
                Fabric
        );
    }

    @Override
    public int compareTo(Tshirt o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
