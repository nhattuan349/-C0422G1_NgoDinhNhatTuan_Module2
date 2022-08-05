package quanlytiendien2.model;

public  abstract class KhachHang {
    private  String idKhachHang;
    private String name;

    public KhachHang() {
    }

    public KhachHang(String idKhachHang, String name) {
        this.idKhachHang = idKhachHang;
        this.name = name;
    }

    public String getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(String idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getInfo();

    @Override
    public String toString() {
        return "KhachHang{" +
                "idKhachHang='" + idKhachHang + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
