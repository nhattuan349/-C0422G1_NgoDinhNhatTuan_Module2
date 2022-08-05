package ss17IOBinaryFileAndSerialization.LyThuyet.model;

public abstract class SotietKiem {
    private String idSo, idKhachHang, ngayMoSo, thoiGianBatDauGui, soTienGUi, laiSuat;

    public SotietKiem() {
    }

    public SotietKiem(String idSo, String idKhachHang, String ngayMoSo, String thoiGianBatDauGui, String soTienGUi, String laiSuat) {
        this.idSo = idSo;
        this.idKhachHang = idKhachHang;
        this.ngayMoSo = ngayMoSo;
        this.thoiGianBatDauGui = thoiGianBatDauGui;
        this.soTienGUi = soTienGUi;
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

    public String getThoiGianBatDauGui() {
        return thoiGianBatDauGui;
    }

    public void setThoiGianBatDauGui(String thoiGianBatDauGui) {
        this.thoiGianBatDauGui = thoiGianBatDauGui;
    }

    public String getSoTienGUi() {
        return soTienGUi;
    }

    public void setSoTienGUi(String soTienGUi) {
        this.soTienGUi = soTienGUi;
    }

    public String getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(String laiSuat) {
        this.laiSuat = laiSuat;
    }

    @Override
    public String toString() {
        return "SotietKiem{" +
                "idSo='" + idSo + '\'' +
                ", idKhachHang='" + idKhachHang + '\'' +
                ", ngayMoSo='" + ngayMoSo + '\'' +
                ", thoiGianBatDauGui='" + thoiGianBatDauGui + '\'' +
                ", soTienGUi='" + soTienGUi + '\'' +
                ", laiSuat='" + laiSuat + '\'' +
                '}';
    }

    public abstract String getLine();
}