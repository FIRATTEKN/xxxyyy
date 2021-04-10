package qyiz2;

import java.awt.*;

    public class Circle extends Shape{

        Point center;
        double radious;

        public Circle(Point center,double radious){
            this.center=center;
            this.radious=radious;
        }

        @Override
        double perimeter() {
            return 2*Math.PI*this.radious;
        }

        @Override
        double area() {
            return Math.PI*this.radious*this.radious;
        }
    }
