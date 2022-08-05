package ss17IOBinaryFileAndSerialization.ThucHanh.bai1.model;

public class CoThoiHan extends SoTietKiem {
    private String kyHan;

    public CoThoiHan() {
    }

    public CoThoiHan(String kyHan) {
        this.kyHan = kyHan;
    }

    public CoThoiHan(String idSo, String idKhachHang, String ngayMoSo, String thoiGianBatDau, String soTienGui, String laiSuat, String kyHan) {
        super(idSo, idKhachHang, ngayMoSo, thoiGianBatDau, soTienGui, laiSuat);
        this.kyHan = kyHan;
    }

    public String getKyHan() {
        return kyHan;
    }

    public void setKyHan(String kyHan) {
        this.kyHan = kyHan;
    }

    @Override
    public String getLine() {
        return getIdSo() + "," +
                getIdKhachHang() + "," +
                getNgayMoSo() + "," +
                getThoiGianBatDau() + "," +
                getSoTienGui() + "," +
                getLaiSuat() + "," +
                getKyHan();
    }

    @Override
    public String toString() {
        return "CoThoiHan{" + super.toString()+
                "kyHan='" + kyHan + '\'' +
                '}';
    }
}
