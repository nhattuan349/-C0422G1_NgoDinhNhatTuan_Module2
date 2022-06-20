package ss10_DSA_Danh_sach.LyThuyet.Bai2;

import java.util.Objects;

public class SinhVien implements Comparable<SinhVien>{
    private String maSinhVien;
    private String hoVaten;
    private int namSinh;
    private float diemTrungBinh;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String hoVaten, int namSinh, float diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoVaten = hoVaten;
        this.namSinh = namSinh;
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaten() {
        return hoVaten;
    }

    public void setHoVaten(String hoVaten) {
        this.hoVaten = hoVaten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSinhVien='" + maSinhVien + '\'' +
                ", hoVaten='" + hoVaten + '\'' +
                ", namSinh=" + namSinh +
                ", diemTrungBinh=" + diemTrungBinh +
                '}';
    }


    @Override
    public int compareTo(SinhVien o) {
        return this.maSinhVien.compareTo(o.maSinhVien);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SinhVien other = (SinhVien) obj;
        return Objects.equals(maSinhVien, other.maSinhVien) && namSinh == other.namSinh;
    }
}
