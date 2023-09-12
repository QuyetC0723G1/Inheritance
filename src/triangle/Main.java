package triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("red");
        shape.setColor("blue");
        System.out.println(shape.getColor());




        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side1 : ");
        double x = input.nextDouble();
        System.out.println("Enter the side2 : ");
        double y = input.nextDouble();
        System.out.println("Enter the side3 : ");
        double z = input.nextDouble();
        input.nextLine();
        System.out.println("Enter the color : ");
        String k = input.nextLine();

        Triangle triangle = new Triangle(x,y,z);
        triangle.setColor(k);
        System.out.println(triangle);

    }
}
