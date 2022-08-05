package exam.utils;

import exam.model.HocVien;

import java.util.Comparator;

public class ComparatorHocVien implements Comparator<HocVien> {
    @Override
    public int compare(HocVien o1, HocVien o2) {
        if(o1.getHovaTen().compareTo(o2.getHovaTen()) > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
