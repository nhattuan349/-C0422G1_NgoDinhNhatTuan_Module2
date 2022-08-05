package ss17IOBinaryFileAndSerialization.ThucHanh.bai1.utils;

import ss17IOBinaryFileAndSerialization.ThucHanh.bai1.model.VoThoiHan;

import java.util.Comparator;

public class ComparatorIDVoThoiHan implements Comparator<VoThoiHan> {

    @Override
    public int compare(VoThoiHan o1, VoThoiHan o2) {
        if (o1.getIdSo().compareTo(o2.getIdSo()) > 0) {
            return -1;
        } else {
            return 1;
        }
    }
}