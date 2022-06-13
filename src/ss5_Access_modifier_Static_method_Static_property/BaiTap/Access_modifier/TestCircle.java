package ss5_Access_modifier_Static_method_Static_property.BaiTap.Access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.0,"yellow");
        Circle circle2 = new Circle(4.0,"green");
        Circle circle3= new Circle(5.0,"blue");
        Circle circle4 = new Circle(6.0,"red");
        System.out.println("Hinh tron co ban kinh:"+circle1.getRadius() +" va dien tich: "+circle1.getArea());
        System.out.println("Hinh tron co ban kinh:"+circle2.getRadius() +" va dien tich: "+circle2.getArea());
        System.out.println("Hinh tron co ban kinh:"+circle3.getRadius() +" va dien tich: "+circle3.getArea());
        System.out.println("Hinh tron co ban kinh:"+circle4.getRadius() +" va dien tich: "+circle4.getArea());
    }
}
