package exam.utils;

import exam.model.NhanVien;

import java.util.Comparator;

public class ComparatorNhanVien implements Comparator<NhanVien> {

    @Override
    public int compare(NhanVien o1, NhanVien o2) {
        if(o1.getHovaTen().compareTo(o2.getHovaTen()) > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
