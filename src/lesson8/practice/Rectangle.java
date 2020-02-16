package lesson8.practice;

public class Rectangle extends Shape {
    private double width, height;

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + " width: " + width + " height: " + height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }
}