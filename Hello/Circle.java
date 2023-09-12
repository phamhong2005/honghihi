package Hello;

import java.util.Arrays;
//public: khai báo ở mọi nơi
//private: chỉ khai báo trong class




public class Circle {
    public static int count;
    private static int id;
     double radius;

    private final double PI = 3.14 ;
    private Circle(double radius){
        id++;
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle sp1 = new Circle(3.55);
        Circle sp2 = new Circle(3.55);
        Circle sp3 = new Circle(3.55);
        System.out.println(id);
        System.out.println(sp1.radius);
    }
}
