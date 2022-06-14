package ss5_Access_modifier_Static_method_Static_property.LyThuyet.Bien_static_trong_Java;

public class Loi_the_cua_bien_static {
    int rollno;
    String name;
    static String college = "Bưu Chính Viễn Thông";

    Loi_the_cua_bien_static(int r, String n) {
        rollno = r;
        name = n;
    }

    void display() {
        System.out.println(rollno + " - " + name + " - " + college);
    }

    public static void main(String args[]) {
        Loi_the_cua_bien_static s1 = new Loi_the_cua_bien_static(111, "Thông");
        Loi_the_cua_bien_static s2 = new Loi_the_cua_bien_static(222, "Minh");

        s1.display();
        s2.display();
    }
}
