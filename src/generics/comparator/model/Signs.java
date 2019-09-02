package generics.comparator.model;

public abstract class Signs implements IHasWeight{
    private double importance;

    public double getImportance() {
        return importance;
    }

    public void setImportance(double importance) {
        this.importance = importance;
    }

    @Override
    public double getWeight() {
        return getImportance();
    }
}
