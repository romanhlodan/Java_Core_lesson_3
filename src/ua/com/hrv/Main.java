package ua.com.hrv;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(12.4, 8.6);

        System.out.println("Площа прямокутника(хард код) = " + rectangle.rectan());
        System.out.println("Площа прямокутника = " + rectangle1.rectan());
        System.out.println("Периметр прямокутника(хард код) = " + rectangle.per());
        System.out.println("Периметр прямокутника = " + rectangle1.per());

        Circle circle = new Circle(3.5, 8.5);
        System.out.println("Площа кола = " + circle.S());
        System.out.println("Довжина кола = " + circle.С());


    }
}
