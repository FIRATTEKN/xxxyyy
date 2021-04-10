package qyiz2;

import java.awt.*;

public class Square extends Shape{

    Point upperLeft;
    double sidelength;

    public Square(Point upperLeft, double sidelength){
        this.sidelength=sidelength;
        this.upperLeft=upperLeft;
    }

    @Override
    double perimeter() {
        return 4*this.sidelength;
    }

    @Override
    double area() {
        return this.sidelength*this.sidelength;
    }
}
