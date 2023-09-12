package Mck;

public class Circle1 {//static để biết phương thức hoặc thuộc tính(k phải đối tượng)
    public static int count;
    private int id;
    private double radius;
    private static double maxRadius;
    public  Double Tong;

    public static final double PI = 3.14;

    Circle1(double radius) {
        this.id = ++count;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Id là : " + this.id

                + " và có diện tích là " + this.dienTich() + "và có chu vi là" + this.chuVi();
    }

    public double dienTich() {
        double S = Math.pow(this.radius, 2) * PI;
        return S;
    }




    public double chuVi() {
        double V = PI * 2 * this.radius;
        return V;
    }

}
