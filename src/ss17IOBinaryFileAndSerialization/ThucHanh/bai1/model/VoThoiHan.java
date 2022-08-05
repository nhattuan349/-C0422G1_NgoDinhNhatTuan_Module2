package ss17IOBinaryFileAndSerialization.ThucHanh.bai1.model;

public class VoThoiHan extends SoTietKiem{
    public VoThoiHan() {
    }

    public VoThoiHan(String idSo, String idKhachHang, String ngayMoSo,
                     String thoiGianBatDau, String soTienGui, String laiSuat) {
        super(idSo, idKhachHang, ngayMoSo, thoiGianBatDau, soTienGui, laiSuat);
    }



    @Override
    public String getLine() {
        return getIdSo() + "," +
                getIdKhachHang() + "," +
                getNgayMoSo() + "," +
                getThoiGianBatDau() + "," +
                getSoTienGui() + "," +
                getLaiSuat();
    }

    @Override
    public String toString() {
        return "VoThoiHan{}"+ super.toString();
    }
}
