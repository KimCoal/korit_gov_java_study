package _20_Casting.Shape;

public class Main {
    public static void main(String[] args) {

        Circle c = new Circle(4);
        System.out.println(c.area());
        c.drawInternal();
        c.render();

        Rectangle r = new Rectangle(3.2, 4.8);
        System.out.println(r.area());
        r.drawInternal();
        r.render();

        Triangle t = new Triangle(2.7, 4.6);
        System.out.println(t.area());
        t.drawInternal();
        t.render();

        Shape[] shapes = {
                c,
                r,
                t
        };

        double a = 0;

        for (Shape s1 : shapes) {
            a += s1.area();
        }

        System.out.println(a);

    }
}

