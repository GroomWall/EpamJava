package lesson7.homework;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle("Red", 10.1, 20.1),
                new Rectangle("Blue", 12.3, 22.5),
                new Rectangle("Green", 15.9, 29.5),
                new Rectangle("Orange", 11.3, 32.5),
                new Circle("Pink", 20),
                new Circle("Yellow", 15),
                new Circle("Black", 32),
                new Triangle("Magenta", 5, 8, 12),
                new Triangle("Cyan", 3, 4, 6)
        };
        printShapes(shapes);
        System.out.println();
        double[] shapesAreaArray = calcChosenArea(shapes);
        System.out.println("Summed area of all figures = " + calcGeneralArea(shapes) + "\n");
        System.out.println("Summed area of triangles = " + shapesAreaArray[2] + "\nSummed are of rectangles = "
                + shapesAreaArray[1] + "\nSummed area of circles = " + shapesAreaArray[0] );
    }

        static void printShapes(Shape[] shapes){
            for (Shape obj : shapes) {
                System.out.println(obj.toString() + ", Area = " + obj.calcArea());
            }
        }

        static double calcGeneralArea(Shape[] shapes){
        double summedArea = 0.0;
            for (Shape obj:shapes) {
                summedArea += obj.calcArea();
            }
        return summedArea;
        }

        static double[] calcChosenArea(Shape[] shapes){
        double[] chosenArea = new double[shapes.length];
        double circleArea = 0.0, rectangleArea = 0.0, triangleArea = 0.0;

            for (Shape obj:shapes) {
                if(obj instanceof Circle){
                    circleArea += obj.calcArea();
                }else if(obj instanceof Rectangle){
                    rectangleArea += obj.calcArea();
                }else if(obj instanceof  Triangle){
                    triangleArea += obj.calcArea();
                }
            }
            chosenArea[0] = circleArea;
            chosenArea[1] = rectangleArea;
            chosenArea[2] = triangleArea;
        return Arrays.copyOf(chosenArea, 3);
        }
}
