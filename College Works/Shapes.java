abstract class Shape{
    //an abstract method
    abstract void numberOfSides();
}

class Rectangle extends Shape{
    //implement abstract method
    void numberOfSides() {
        System.out.println("Number of sides : 4");
    }
}

class Triangle extends Shape{
    void numberOfSides() {
        System.out.println("Number of sides : 3");
    }
}

class Hexagon extends Shape{
    void numberOfSides() {
        System.out.println("Number of sides : 6");
    }
}
public class Shapes{
    public static void main(String[] args) {
        //creating objects for all classes
        Triangle triangle = new Triangle();
        Rectangle rectangle = new Rectangle();
        Hexagon hexagon = new Hexagon();
        //call methods to print the number of sides of each object
        triangle.numberOfSides();
        rectangle.numberOfSides();
        hexagon.numberOfSides();
    }
}

// Write a java program to create an abstract class named Shape that contains an empty
// method named numberOfSides( ). Provide three classes named Rectangle, Triangle and
// Hexagon such that each one of the classes extends the class Shape. Each one of the 
// classes contains only the method numberOfSides( ) that shows the number of sides in the 
// given geometrical structures. (Exercise to understand polymorphism). ** 