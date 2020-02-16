package lesson8.practice;

import java.util.Arrays;

public class Main {
     static void printShapes(Shape[] shapes) {
         for (Shape shape : shapes) {
             shape.draw();
         }
     }

     static double calcAreaSum(Shape[] shapes) {
         double area = 0.0;
         for (Shape shape : shapes) {
             area += shape.calcArea();
         }
         return area;
     }

     static double calcAreaSum(Shape[] shapes, String klass) {
         double area = 0.0;
         for (Shape shape : shapes) {
             if (shape.getClass().getSimpleName().equals(klass)) {
                 area += shape.calcArea();
             }
         }
         return area;
     }

     public static Shape[] createShapes() {
         return new Shape[] {
                 new Rectangle("black", 5, 4),
                 new Circle("yellow", 1.0),
                 new Rectangle("brown", 10, 6),
                 new Rectangle("red", 3.5, 2.0),
                 new Triangle("red", 4.0, 2.5, 5.0),
                 new Rectangle("green", 4.6, 3.0),
                 new Circle("orange", 4.5),
                 new Triangle("blue", 1.0, 1.0, 1.0),
                 new Circle("gray", 9.0)
         };
     }

     public static void main(String[] args) {
         Shape[] shapes = createShapes();

         System.out.println("Shapes array:");
         printShapes(shapes);
         System.out.println();

//         System.out.print("Total shapes area: ");
////         System.out.println(calcAreaSum(shapes));
////         System.out.print("Total rectangles area: ");
////         System.out.println(calcAreaSum(shapes, "Rectangle"));
////
////         System.out.print("Total circles area: ");
////         System.out.println(calcAreaSum(shapes, "Circle"));
////
////         System.out.print("Total triangles area: ");
////         System.out.println(calcAreaSum(shapes, "Triangle"));

         Arrays.sort(shapes);
         printShapes(shapes);
         System.out.println();

         Arrays.sort(shapes, new MyComparatorColor());
         printShapes(shapes);
     }
}

