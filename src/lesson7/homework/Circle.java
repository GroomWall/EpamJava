package lesson7.homework;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "class = " + this.getClass().getSimpleName()
                + ":"  + " color = " + super.getColor() + ", radius = " + radius;
    }

    @Override
    public Double calcArea(){
        return Math.PI * (radius * radius);
    }
}
