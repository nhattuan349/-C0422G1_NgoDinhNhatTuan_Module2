package ss17IOBinaryFileAndSerialization.LyThuyet.model;

public class VoThoiHan extends SotietKiem {
    public VoThoiHan() {
    }

    public VoThoiHan(String idSo, String idKhachHang, String ngayMoSo, String thoiGianBatDauGui, String soTienGUi, String laiSuat) {
        super(idSo, idKhachHang, ngayMoSo, thoiGianBatDauGui, soTienGUi, laiSuat);
    }

    @Override
    public String toString() {
        return "VoThoiHan{}" + super.toString();
    }

    @Override
    public String getLine() {
        return getIdSo() + "," +
                getIdKhachHang() + "," +
                getNgayMoSo() + "," +
                getThoiGianBatDauGui() + "," +
                getSoTienGUi() + "," +
                getLaiSuat();
    }
}