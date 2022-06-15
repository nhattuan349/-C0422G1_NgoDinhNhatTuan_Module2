package ss7_Abstract_Class_Interface.BaiTap.Trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc.Ipml;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Nhập bán kính");
        double radius = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập chiều rộng");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập dài");
        double height = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập cạnh hình vuông");
        double side = Double.parseDouble(scanner.nextLine());

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("green",true,radius);
        shapes[1] = new Rectangle("red",false,width,height);
        shapes[2] = new Square("black",true,side);

        for (Shape shape: shapes) {
            System.out.println("Thông tin của khối "+shape+"\n");
            System.out.println("Diện tích: "+shape.getArea()+"\n");
            System.out.println("Chu vi: "+shape.getPerimeter()+"\n");
            shape.resize(10);
            System.out.println(shape);
        }
    }
}
