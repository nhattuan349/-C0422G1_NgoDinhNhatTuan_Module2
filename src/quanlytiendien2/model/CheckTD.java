package quanlytiendien2.model;

import quanlytiendien2.comma.Comma;

public  class CheckTD {
    private  String idCheck;
    private String idkhachHang;
    private String ngayRaHoaDon;
    private Double soLuongKWTieuThu;
    private Double donGia;
    private Double thanhTien;

    public CheckTD() {
    }

    public CheckTD(String idCheck, String idkhachHang,
                   String ngayRaHoaDon, Double soLuongKWTieuThu,
                   Double donGia, Double thanhTien) {
        this.idCheck = idCheck;
        this.idkhachHang = idkhachHang;
        this.ngayRaHoaDon = ngayRaHoaDon;
        this.soLuongKWTieuThu = soLuongKWTieuThu;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }

    public String getIdCheck() {
        return idCheck;
    }

    public void setIdCheck(String idCheck) {
        this.idCheck = idCheck;
    }

    public String getIdkhachHang() {
        return idkhachHang;
    }

    public void setIdkhachHang(String idkhachHang) {
        this.idkhachHang = idkhachHang;
    }

    public String getNgayRaHoaDon() {
        return ngayRaHoaDon;
    }

    public void setNgayRaHoaDon(String ngayRaHoaDon) {
        this.ngayRaHoaDon = ngayRaHoaDon;
    }

    public Double getSoLuongKWTieuThu() {
        return soLuongKWTieuThu;
    }

    public void setSoLuongKWTieuThu(Double soLuongKWTieuThu) {
        this.soLuongKWTieuThu = soLuongKWTieuThu;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    public Double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(Double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getInfo() {
        return idCheck+ Comma.COMMA+
                idkhachHang+ Comma.COMMA+
                ngayRaHoaDon+ Comma.COMMA+
                donGia+ Comma.COMMA+
                thanhTien+ Comma.COMMA+thanhTien;
    }

    @Override
    public String toString() {
        return "CheckTD{" +
                "idCheck='" + idCheck + '\'' +
                ", idkhachHang='" + idkhachHang + '\'' +
                ", ngayRaHoaDon='" + ngayRaHoaDon + '\'' +
                ", soLuongKWTieuThu=" + soLuongKWTieuThu +
                ", donGia=" + donGia +
                ", thanhTien=" + thanhTien +
                '}';
    }
}
