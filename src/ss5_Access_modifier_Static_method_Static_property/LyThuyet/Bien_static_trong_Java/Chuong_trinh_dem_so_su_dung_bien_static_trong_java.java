package ss5_Access_modifier_Static_method_Static_property.LyThuyet.Bien_static_trong_Java;

public class Chuong_trinh_dem_so_su_dung_bien_static_trong_java {
    static int count = 0; // sẽ lấy bộ nhớ chỉ một lần

    Chuong_trinh_dem_so_su_dung_bien_static_trong_java() {
        count++;
        System.out.println(count);
    }

    public static void main(String args[]) {

        Chuong_trinh_dem_so_su_dung_bien_static_trong_java c1 = new Chuong_trinh_dem_so_su_dung_bien_static_trong_java();
        Chuong_trinh_dem_so_su_dung_bien_static_trong_java c2 = new Chuong_trinh_dem_so_su_dung_bien_static_trong_java();
        Chuong_trinh_dem_so_su_dung_bien_static_trong_java c3 = new Chuong_trinh_dem_so_su_dung_bien_static_trong_java();

        Chuong_trinh_dem_so_su_dung_bien_static_trong_java c9 = new Chuong_trinh_dem_so_su_dung_bien_static_trong_java();
        Chuong_trinh_dem_so_su_dung_bien_static_trong_java c4 = new Chuong_trinh_dem_so_su_dung_bien_static_trong_java();
        Chuong_trinh_dem_so_su_dung_bien_static_trong_java c5 = new Chuong_trinh_dem_so_su_dung_bien_static_trong_java();
        Chuong_trinh_dem_so_su_dung_bien_static_trong_java c6 = new Chuong_trinh_dem_so_su_dung_bien_static_trong_java();
        Chuong_trinh_dem_so_su_dung_bien_static_trong_java c7 = new Chuong_trinh_dem_so_su_dung_bien_static_trong_java();
        Chuong_trinh_dem_so_su_dung_bien_static_trong_java c8 = new Chuong_trinh_dem_so_su_dung_bien_static_trong_java();

    }
}
