package Farm_new;

public class AnimalTester {
    public static void main(String[] args) {

        Animal cow = new Cow("Lucky",  20, "white", 120, true);
        Animal butterfly = new Butterfly("Lycaenidae",  1, true, 2);
        Animal spider = new Spider("Funnel-web Spiders", 3, false, 8);

        System.out.println(cow.toString());
        System.out.println(butterfly.toString());
        System.out.println(spider.toString());
        System.out.println("========================");
        System.out.println("" + cow);
        System.out.println("" + butterfly);
        System.out.println("" + spider);


    }
}
