package br.com.extratos.xlsx.report;

import java.awt.Color;

public enum StyleColor {

    WHITE(255, 255, 255),
    RED(236, 0, 0),
    BLACK(0, 0, 0),
    GREY(166, 166, 166),
    GREY_LIGHT(242, 242,242);


    private Color color;
    private int red;
    private int green;
    private int blue;

    private StyleColor(int red, int green,  int blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.color = new Color(red, green, blue);
    }

    

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }
    
}
