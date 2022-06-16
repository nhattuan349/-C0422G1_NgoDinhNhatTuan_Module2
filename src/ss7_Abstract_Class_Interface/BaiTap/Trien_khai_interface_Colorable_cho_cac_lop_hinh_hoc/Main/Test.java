package ss7_Abstract_Class_Interface.BaiTap.Trien_khai_interface_Colorable_cho_cac_lop_hinh_hoc.Main;

import ss7_Abstract_Class_Interface.BaiTap.Trien_khai_interface_Colorable_cho_cac_lop_hinh_hoc.Iplm.ShapeIpml;
import ss7_Abstract_Class_Interface.BaiTap.Trien_khai_interface_Colorable_cho_cac_lop_hinh_hoc.Model.Circle;
import ss7_Abstract_Class_Interface.BaiTap.Trien_khai_interface_Colorable_cho_cac_lop_hinh_hoc.Model.Rectangle;
import ss7_Abstract_Class_Interface.BaiTap.Trien_khai_interface_Colorable_cho_cac_lop_hinh_hoc.Model.Square;

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

        ShapeIpml[] shapes = new ShapeIpml[3];
        shapes[0] = new Circle("green",true,radius);
        shapes[1] = new Rectangle("gray",false,width,height);
        shapes[2] = new Square("black",true,side);

        for (ShapeIpml shape: shapes) {
            System.out.println("Thông tin của khối "+shape+"\n");
            if (shape instanceof Square){
            ((Square)shape).howToColor("red");
            }
            System.out.println(" Cập nhật thông tin của khối "+shape+"\n");
            System.out.println("Diện tích: "+shape.getArea()+"\n");
            System.out.println("Chu vi: "+shape.getPerimeter()+"\n");
        }
    }
}
