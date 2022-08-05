package ss17IOBinaryFileAndSerialization.ThucHanh.bai1.model;

public abstract class SoTietKiem {
    private String idSo;
    private String idKhachHang;
    private String ngayMoSo;
    private String thoiGianBatDau;
    private String soTienGui;
    private String laiSuat;

    public SoTietKiem() {
    }

    public SoTietKiem(String idSo, String idKhachHang, String ngayMoSo,
                      String thoiGianBatDau, String soTienGui, String laiSuat) {
        this.idSo = idSo;
        this.idKhachHang = idKhachHang;
        this.ngayMoSo = ngayMoSo;
        this.thoiGianBatDau = thoiGianBatDau;
        this.soTienGui = soTienGui;
        this.laiSuat = laiSuat;
    }

    public String getIdSo() {
        return idSo;
    }

    public void setIdSo(String idSo) {
        this.idSo = idSo;
    }

    public String getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(String idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getNgayMoSo() {
        return ngayMoSo;
    }

    public void setNgayMoSo(String ngayMoSo) {
        this.ngayMoSo = ngayMoSo;
    }

    public String getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    public void setThoiGianBatDau(String thoiGianBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }

    public String getSoTienGui() {
        return soTienGui;
    }

    public void setSoTienGui(String soTienGui) {
        this.soTienGui = soTienGui;
    }

    public String getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(String laiSuat) {
        this.laiSuat = laiSuat;
    }

    public abstract String getLine();

    @Override
    public String toString() {
        return "SoTietKiem{" +
                "idSo='" + idSo + '\'' +
                ", idKhachHang='" + idKhachHang + '\'' +
                ", ngayMoSo='" + ngayMoSo + '\'' +
                ", thoiGianBatDau='" + thoiGianBatDau + '\'' +
                ", soTienGui='" + soTienGui + '\'' +
                ", laiSuat='" + laiSuat + '\'' +
                '}';
    }
}
