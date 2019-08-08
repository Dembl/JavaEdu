package inheritance;

public class Triangle extends Shape{
    private double[] sides = new double[3];

    public Triangle(double... sides){
        for (int i = 0; i < this.sides.length; i++) {
            this.sides[i] = sides[i];
        }
    }

    public double getPerimeter(){
        return sides[0]+sides[1]+ sides[2];
    }
}
