package Farm_new;

public class Insect extends Animal {
    private Boolean flying;

    public Insect(String name, int lifeExpectancy, Boolean flying) {
        super(name, false, lifeExpectancy);
        this.flying = flying;
    }

    public Boolean getFlying() {
        return flying;
    }

    public void setFlying(Boolean flying) {
        this.flying = flying;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "flying=" + flying +
                '}';
    }
}


