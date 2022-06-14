package ss5_Access_modifier_Static_method_Static_property.LyThuyet.Khoi_static;

public class Khoistatic {
static String a= "Khối static: hello !";
static String b= "Main: hello !";

    public static void main(String args[]) {
        System.out.println(b);
    }
    static {
        System.out.println(a);
    }
}

