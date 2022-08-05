package exam.model;

public class NhanVien extends NhanSu{
    private String luong;
    private String phongBan;
    private String viTri;


    public NhanVien() {
    }

    public NhanVien(String luong, String phongBan, String viTri) {
        this.luong = luong;
        this.phongBan = phongBan;
        this.viTri = viTri;
    }

    public NhanVien(String idMaDinhDanh, String hovaTen, String ngaySinh,
                    String diaChi, String soDienThoai, String luong, String phongBan, String viTri) {
        super(idMaDinhDanh, hovaTen, ngaySinh, diaChi, soDienThoai);
        this.luong = luong;
        this.phongBan = phongBan;
        this.viTri = viTri;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    @Override
    public String getLine() {
        return getIdMaDinhDanh()+ "," +
                getHovaTen()+ "," +
                getNgaySinh()+ "," +
                getDiaChi()+ "," +
                getSoDienThoai()+ "," +
                getLuong()+ "," +
                getPhongBan()+ "," +
                getViTri();
    }

    @Override
    public String toString() {
        return "NhanVien:" +super.toString()+
                "luong='" + luong + '\'' +
                ", phongBan='" + phongBan + '\'' +
                ", viTri='" + viTri ;
    }
}
