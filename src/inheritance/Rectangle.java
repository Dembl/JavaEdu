package inheritance;

public class Rectangle extends Shape{

private double side1, side2;

public Rectangle (double a,double b ){
 this.side1 = a;
 this.side2 = b;

}

    public double getPerimeter() {
        return (side1+side2)*2;
    }

    public double getSquare() {
        return side1*side2 ;
    }
}
