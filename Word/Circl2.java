package Word;

public class Circl2 {
    public static int a = 10;
    private int id;
    private double radius;
    public static final double PI = 3.14;
    private static int count = 0;
    public static double maxRadius = 0;


    Circl2(double radius) {
        this.id = count;
        this.radius = radius;
        count++;

        if (this.radius > maxRadius) {
            maxRadius = this.radius;
        }
    }

    public int getId() {
        return id;
    }

    public double getRadius() {
        return radius;
    }
}


class Main {
    public static void main(String[] args) {
        Circl2 a = new Circl2(5.333);
        System.out.println(a.getId());
        Circl2 b = new Circl2(3.5);
        System.out.println(b.getId());
        System.out.println(Circl2.maxRadius);
        System.out.println(Circl2.a);
    }
}