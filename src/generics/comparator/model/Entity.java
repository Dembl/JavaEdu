package generics.comparator.model;

public abstract class Entity implements IHasWeight {
    private int weight;

    public double getWeight() {
        return (double) weight;
    }

    protected void setWeight(int weight) {
        this.weight = weight;
    }
}
