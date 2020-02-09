package lesson7.homework;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString(){
        return "class = " + this.getClass().getSimpleName()
                + ":"  + " color = " + super.getColor() + ", width = " + width
                + ", height = " + height;
    }

    @Override
    public Double calcArea(){
        return width * height;
    }
}
