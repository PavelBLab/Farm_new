package Farm_new;

public class Mammal extends Animal {
    private String color;
    private double weight;

    public Mammal(String name, int lifeExpectancy, String color, double weight) {
        super(name, true, lifeExpectancy);
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "color='" + color +
                ", weight=" + weight +
                '}';
    }
}
