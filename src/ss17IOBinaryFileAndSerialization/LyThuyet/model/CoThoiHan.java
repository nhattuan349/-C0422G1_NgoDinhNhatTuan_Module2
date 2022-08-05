package ss17IOBinaryFileAndSerialization.LyThuyet.model;

public class CoThoiHan extends SotietKiem {
    private String kyHan;

    public CoThoiHan() {
    }

    public CoThoiHan(String kyHan) {
        this.kyHan = kyHan;
    }

    public CoThoiHan(String idSo, String idKhachHang, String ngayMoSo, String thoiGianBatDauGui, String soTienGUi, String laiSuat, String kyHan) {
        super(idSo, idKhachHang, ngayMoSo, thoiGianBatDauGui, soTienGUi, laiSuat);
        this.kyHan = kyHan;
    }

    public String getKyHan() {
        return kyHan;
    }

    public void setKyHan(String kyHan) {
        this.kyHan = kyHan;
    }

    @Override
    public String toString() {
        return "CoThoiHan{" + super.toString() +
                "kyHan='" + kyHan + '\'' +
                '}';
    }

    @Override
    public String getLine() {
        return getIdSo() + "," +
                getIdKhachHang() + "," +
                getNgayMoSo() + "," +
                getThoiGianBatDauGui() + "," +
                getSoTienGUi() + "," +
                getLaiSuat() + "," +
                getKyHan();
    }
}
