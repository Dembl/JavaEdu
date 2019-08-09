package inheritance;

public class Circle extends Shape {
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return Math.PI*radius*2;
    }

    public double getSquare(){
        return Math.PI*radius*radius;
    }
}
