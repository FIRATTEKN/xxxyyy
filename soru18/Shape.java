package qyiz2;

import java.awt.*;

public abstract class Shape {
    private Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    abstract double perimeter();
    abstract double area();

}
