package CaseStudy.Furama.Model;

public class Villa extends Resort{
    private String tieuChuanPhong;
    private String dienTichHoBoi;

    public Villa() {
    }

    public Villa(String tieuChuanPhong, String dienTichHoBoi) {
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public Villa(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, String kieuThue, String tieuChuanPhong, String dienTichHoBoi) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(String dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", dienTichHoBoi='" + dienTichHoBoi + '\'' +
                '}';
    }
}
