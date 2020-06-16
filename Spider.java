package Farm_new;

public class Spider extends Insect {
    private int legsNum;

    public Spider(String name, int lifeExpectancy, Boolean flying, int legsNum) {
        super(name, lifeExpectancy, flying);
        this.legsNum = legsNum;
    }

    public int getLegsNum() {
        return legsNum;
    }

    public void setLegsNum(int legsNum) {
        this.legsNum = legsNum;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "legsNum=" + legsNum +
                '}';
    }
}
