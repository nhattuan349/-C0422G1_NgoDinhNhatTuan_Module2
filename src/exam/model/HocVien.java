package exam.model;

public class HocVien extends NhanSu{
    private String diemThi;
    private String tenLop;
    private String ngayNhapHoc;

    public HocVien() {
    }

    public HocVien(String diemThi, String tenLop, String ngayNhapHoc) {
        this.diemThi = diemThi;
        this.tenLop = tenLop;
        this.ngayNhapHoc = ngayNhapHoc;
    }

    public HocVien(String idMaDinhDanh, String hovaTen, String ngaySinh, String diaChi, String soDienThoai, String diemThi, String tenLop, String ngayNhapHoc) {
        super(idMaDinhDanh, hovaTen, ngaySinh, diaChi, soDienThoai);
        this.diemThi = diemThi;
        this.tenLop = tenLop;
        this.ngayNhapHoc = ngayNhapHoc;
    }

    public String getDiemThi() {
        return diemThi;
    }

    public void setDiemThi(String diemThi) {
        this.diemThi = diemThi;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getNgayNhapHoc() {
        return ngayNhapHoc;
    }

    public void setNgayNhapHoc(String ngayNhapHoc) {
        this.ngayNhapHoc = ngayNhapHoc;
    }

    @Override
    public String getLine() {
        return getIdMaDinhDanh()+ "," +
                getHovaTen()+ "," +
                getNgaySinh()+ "," +
                getDiaChi()+ "," +
                getSoDienThoai()+ "," +
                getDiemThi()+ "," +
                getTenLop()+ "," +
                getNgayNhapHoc();
    }

    @Override
    public String toString() {
        return "HocVien:" + super.toString()+
                "diemThi='" + diemThi + '\'' +
                ", tenLop='" + tenLop + '\'' +
                ", ngayNhapHoc='" + ngayNhapHoc;
    }
}
