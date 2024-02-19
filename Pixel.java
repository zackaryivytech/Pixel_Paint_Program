package com.example.pixelpaintprogram;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Pixel {

    /** The width and height of a pixel rectangle */
    public static float pixelLength = 50;

    /** The rectangle to represent a pixel*/
    public Rectangle rectangle;

    /** The color of this pixel*/
    private Color color;

    /**
     * Constructor of a pixel
     * @param color set init color of pixel
     * @param x position of pixel
     * @param y position of pixel
     * */
    public Pixel(Color color, int x, int y){

        this.color = color;

        rectangle = new Rectangle(pixelLength * x, pixelLength * y, pixelLength,pixelLength);
        rectangle.setFill(color);


    }

    public Pixel(){

    }

    /** @return color of pixel*/
    public Color getColor(){
        return color;
    }

    @Override
    public String toString(){
        return "Pixel - Color: " + color.toString() + " Width: " + pixelLength + " Height: " + pixelLength;
    }

    /**
     * Change the current color of pixel
     * @param color new color
     * */
    public void changeColor(Color color){
        this.color = color;
        rectangle.setFill(color);
    }

}
