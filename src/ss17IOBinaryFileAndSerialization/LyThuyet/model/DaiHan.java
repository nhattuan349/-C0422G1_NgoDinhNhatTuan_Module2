package ss17IOBinaryFileAndSerialization.LyThuyet.model;

public class DaiHan extends SotietKiem {
    private String kyHan, uuDai;

    public DaiHan() {
    }

    public DaiHan(String kyHan, String uuDai) {
        this.kyHan = kyHan;
        this.uuDai = uuDai;
    }

    public String getKyHan() {
        return kyHan;
    }

    public void setKyHan(String kyHan) {
        this.kyHan = kyHan;
    }

    public String getUuDai() {
        return uuDai;
    }

    public void setUuDai(String uuDai) {
        this.uuDai = uuDai;
    }

    public DaiHan(String idSo, String idKhachHang, String ngayMoSo, String thoiGianBatDauGui, String soTienGUi, String laiSuat, String kyHan, String uuDai) {
        super(idSo, idKhachHang, ngayMoSo, thoiGianBatDauGui, soTienGUi, laiSuat);
        this.kyHan = kyHan;
        this.uuDai = uuDai;
    }

    @Override
    public String toString() {
        return "DaiHan{" + super.toString() +
                "kyHan='" + kyHan + '\'' +
                ", uuDai='" + uuDai + '\'' +
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
                getKyHan() + "," +
                getUuDai();
    }
}
