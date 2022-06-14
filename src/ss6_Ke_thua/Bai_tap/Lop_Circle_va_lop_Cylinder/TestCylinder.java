package ss6_Ke_thua.Bai_tap.Lop_Circle_va_lop_Cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        System.out.println("Dien tich hinh tron: "+cylinder.getArea());
        System.out.println("Dien tich hinh tru: "+cylinder.getVolume());

        cylinder=new Cylinder(3d,"red",5d);
        System.out.println("\n"+cylinder);
        System.out.println("Dien tich hinh tron: "+cylinder.getArea());
        System.out.println("Dien tich hinh tru: "+cylinder.getVolume());

    }
}
