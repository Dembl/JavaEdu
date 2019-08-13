package inheritance;

public abstract class Shape {

    private String name;

    public abstract double getSquare();

    public abstract double getPerimeter();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
