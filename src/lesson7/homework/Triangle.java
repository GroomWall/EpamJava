package lesson7.homework;

public class Triangle extends Shape{
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }

    private void verification(){
        if(a > (b + c)){
            a = (b + c);
        }else if(b > (a + c)){
            b = (a + c);
        }else if(c > (a + b)){
            c = (a + b);
        }
    }

    @Override
    public String toString(){
        return "class = " + this.getClass().getSimpleName()
                + ":"  + " color = " + super.getColor() + ", A = " + a
                + ", B = " + b + ", C = " + c;
    }

    @Override
    public Double calcArea(){
        verification();
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
