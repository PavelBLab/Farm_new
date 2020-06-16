package Farm_new;

public class Butterfly extends Insect {
    private int wingsNum;

    public Butterfly(String name, int lifeExpectancy, Boolean flying, int wingsNum) {
        super(name, lifeExpectancy, flying);
        this.wingsNum = wingsNum;
    }

    public int getWingsNum() {
        return wingsNum;
    }

    public void setWingsNum(int wingsNum) {
        this.wingsNum = wingsNum;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "wingsNum=" + wingsNum +
                '}';
    }
}
