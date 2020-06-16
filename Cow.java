package Farm_new;

public class Cow extends Mammal {
    private Boolean male;

    public Cow(String name, int lifeExpectancy, String color, double weight, Boolean male) {
        super(name, lifeExpectancy, color, weight);
        this.male = male;
    }


    public Boolean getMale() {
        return male;
    }

    public void setMale(Boolean male) {
        this.male = male;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "male=" + male +
                '}';
    }
}
