package quanlytiendien2.model;

import Quanlytiendien.comma.Comma;

public class KhachHangVietNam extends KhachHang{
    private String loaiKhachHang;
    private Double dinhMucTieuThu;

    public KhachHangVietNam() {
    }

    public KhachHangVietNam(String loaiKhachHang, Double dinhMucTieuThu) {
        this.loaiKhachHang = loaiKhachHang;
        this.dinhMucTieuThu = dinhMucTieuThu;
    }

    public KhachHangVietNam(String idKhachHang, String name, String loaiKhachHang, Double dinhMucTieuThu) {
        super(idKhachHang, name);
        this.loaiKhachHang = loaiKhachHang;
        this.dinhMucTieuThu = dinhMucTieuThu;
    }

    public String getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    public Double getDinhMucTieuThu() {
        return dinhMucTieuThu;
    }

    public void setDinhMucTieuThu(Double dinhMucTieuThu) {
        this.dinhMucTieuThu = dinhMucTieuThu;
    }

    @Override
    public String getInfo() {
        return super.getIdKhachHang()+ Comma.COMMA +
                super.getName()+ Comma.COMMA +
                this.getLoaiKhachHang()+ Comma.COMMA +
                this.getDinhMucTieuThu()+ Comma.COMMA +"\n";
    }

    @Override
    public String toString() {
        return "KhachHangVietNam{" +super.toString()+
                "loaiKhachHang='" + loaiKhachHang + '\'' +
                ", dinhMucTieuThu=" + dinhMucTieuThu +
                '}';
    }
}
