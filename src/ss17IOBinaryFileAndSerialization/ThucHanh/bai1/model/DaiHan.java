package ss17IOBinaryFileAndSerialization.ThucHanh.bai1.model;

public class DaiHan extends SoTietKiem{
    private String kyHan;
    private String uuDai;

    public DaiHan() {
    }

    public DaiHan(String kyHan, String uuDai) {
        this.kyHan = kyHan;
        this.uuDai = uuDai;
    }

    public DaiHan(String idSo, String idKhachHang, String ngayMoSo, String thoiGianBatDau, String soTienGui, String laiSuat, String kyHan, String uuDai) {
        super(idSo, idKhachHang, ngayMoSo, thoiGianBatDau, soTienGui, laiSuat);
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

    @Override
    public String getLine() {
        return getIdSo() + "," +
                getIdKhachHang() + "," +
                getNgayMoSo() + "," +
                getThoiGianBatDau() + "," +
                getSoTienGui() + "," +
                getLaiSuat() + "," +
                getKyHan()+ "," +
                getUuDai();
    }

    @Override
    public String toString() {
        return "DaiHan{" + super.toString()+
                "kyHan='" + kyHan + '\'' +
                ", uuDai='" + uuDai + '\'' +
                '}';
    }
}
