package exam.model;

public abstract class NhanSu {
    private String idMaDinhDanh;
    private String hovaTen;
    private String ngaySinh;
    private String diaChi;
    private String soDienThoai;

    public NhanSu() {
    }

    public NhanSu(String idMaDinhDanh, String hovaTen,
                  String ngaySinh, String diaChi, String soDienThoai) {
        this.idMaDinhDanh = idMaDinhDanh;
        this.hovaTen = hovaTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
    }

    public String getIdMaDinhDanh() {
        return idMaDinhDanh;
    }

    public void setIdMaDinhDanh(String idMaDinhDanh) {
        this.idMaDinhDanh = idMaDinhDanh;
    }

    public String getHovaTen() {
        return hovaTen;
    }

    public void setHovaTen(String hovaTen) {
        this.hovaTen = hovaTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public abstract String getLine();

    @Override
    public String toString() {
        return "NhanSu:" +
                "idMaDinhDanh='" + idMaDinhDanh + '\'' +
                ", hovaTen='" + hovaTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", soDienThoai='" + soDienThoai;
    }
}
