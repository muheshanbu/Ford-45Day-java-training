
import java.util.Scanner;

abstract class Shape {
    protected String name;
    protected String color;

    public Shape(String name,String color){
        this.name = name;
        this.color = color;
    }
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    protected float radius;
    Circle(String name,String color,float radius){
        super(name, color);
        this.radius=radius;
    }

    @Override
    double calculateArea() {
        double area = 3.14*radius*radius;
        System.out.println("The area of :"+this.name + ":is :"+ area );
        return 0;
    }

    @Override
    double calculatePerimeter() {
        double peri = 3.14*2*radius;
        System.out.println("The perimeter of: "+ this.name + " is: " + peri);
        return 0;
    }

    // Implement constructor and override calculateArea(), calculatePerimeter() methods
}

class Square extends Shape {
    protected int side;
    public Square(String name,String color,int side){
        super(name, color);
        this.side=side;
    }

    @Override
    double calculatePerimeter() {
        int peri = 4*side;
        System.out.println("The perimeter of: "+ this.name + " is: " + peri);
        return 0;
    }

    @Override
    double calculateArea() {
        int area = side*side;
        System.out.println("The area of: "+ this.name + " is: " + area);
        return 0;
    }

    // Implement constructor and override calculateArea(), calculatePerimeter() methods
}

public class shapeArea{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        Circle c = new Circle("circle","blue",10);
        c.calculateArea();
        c.calculatePerimeter();


        Square s = new Square("square","yellow",4);
        s.calculateArea();
        s.calculatePerimeter();

        // Instantiate Circle and Square objects, display attributes, area, and perimeter
    }
}

