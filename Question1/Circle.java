import java.lang.Math;

public class Circle extends GeometricObject {
    private double radius;

    private static final double PI = 3.141592653589793;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(Double radius, String color, Boolean filled){

    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return PI*Math.pow(radius,2);
    }

    public double getPerimeter(){
        return (2* PI) * radius;
    }

    public double getDiameter(){
        return radius*2;
    }

    public void printCircle(){

    }

}

