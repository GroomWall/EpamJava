package lesson8.practice;

public abstract class Shape implements Drawable, Comparable {
    private String color;

    public Shape(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "class: " + getClass().getSimpleName() + " color: " + color;
    }

    public abstract double calcArea();

    @Override
    public int compareTo(Object o) {
        return (int) (this.calcArea() - ((Shape)o).calcArea());
    }

    @Override
    public void draw() {
        System.out.println(this + ", area: " + this.calcArea());
    }
}
