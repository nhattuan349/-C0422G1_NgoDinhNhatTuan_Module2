package ss6_Ke_thua.Bai_tap.Lop_Circle_va_lop_Cylinder;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3d, "red");
        System.out.println(circle);

        circle = new Circle(1d, "black");
        System.out.println(circle);

        circle = new Circle(-1d, "gray");
        System.out.println(circle);

        circle = new Circle(-2d, "blue");
        System.out.println(circle);
    }
}
