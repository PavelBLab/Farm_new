package Farm_new;

public abstract class Animal {
    private String name;
    private Boolean mammal;
    private int lifeExpectancy;

    public Animal(String name, Boolean mammal, int lifeExpectancy) {
        this.name = name;
        this.mammal = mammal;
        this.lifeExpectancy = lifeExpectancy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getMammal() {
        return mammal;
    }

    public void setMammal(Boolean mammal) {
        this.mammal = mammal;
    }

    public int getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(int lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    @Override
    public String toString() {
        return  getClass().getName() + "{" +
                "name='" + name +
                ", mammal=" + mammal +
                ", lifeExpectancy=" + lifeExpectancy +
                '}';
    }
}
