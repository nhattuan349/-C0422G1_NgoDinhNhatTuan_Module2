package exam.service.impl;

import exam.model.HocVien;

import exam.regex.RegexNhanSu;
import exam.service.ServiceNhanSu;
import exam.utils.ComparatorHocVien;

import exam.utils.ReadAndWriteFileNhanSu;
import ss17IOBinaryFileAndSerialization.ThucHanh.bai1.Exception.NotFoundSavingException;
import ss17IOBinaryFileAndSerialization.ThucHanh.bai1.model.VoThoiHan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HocVienImpl implements ServiceNhanSu {
    public static Scanner scanner = new Scanner(System.in);
    public static List<HocVien> hocVienList;

    public static List<HocVien> getHocVienList() {
        List<HocVien> hocVienList = new ArrayList<>();
        List<String[]> listStr = ReadAndWriteFileNhanSu.read("src/exam/data/nhansu.csv");
        for (String[] item : listStr) {
            hocVienList.add(new HocVien(
                    item[0],
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    item[5],
                    item[6],
                    item[7]));
        }
        return hocVienList;
    }

    @Override
    public void display() {
        hocVienList = getHocVienList();
        for (HocVien item : hocVienList) {
            System.out.println(item);
        }
    }

    @Override
    public void add() {
        hocVienList = getHocVienList();
        System.out.println("Nhap ma dinh danh");
        String idMaDinhDanh = RegexNhanSu.idMaDinhDanhRegexHocVien(hocVienList);
        System.out.println("Nhap ho va ten");
        String hovaTen = RegexNhanSu.HoTenRegexHocVien(hocVienList);
        System.out.println("Nhap ngay sinh");
        String ngaySinh = RegexNhanSu.ngaySinhException();
        System.out.println("Nhap dia chi");
        String diaChi = scanner.nextLine();
        System.out.println("Nhap so dien thoai");
        String soDienThoai = RegexNhanSu.soDienThoaiHocVien(hocVienList);
        System.out.println("Nhap diem thi");
        String diemThi = RegexNhanSu.diemThiRegexHocVien(hocVienList);
        System.out.println("Nhap ten lop");
        String tenLop = scanner.nextLine();
        System.out.println("Nhap ngay nhap hoc");
        String ngayNhapHoc = scanner.nextLine();

        hocVienList.add(new HocVien(idMaDinhDanh, hovaTen, ngaySinh, diaChi, soDienThoai, diemThi, tenLop, ngayNhapHoc));
        updateFile(hocVienList);
        System.out.println("Thêm thành công");
    }


    @Override
    public void delete() {
        hocVienList = getHocVienList();
        System.out.println("Nhập ID Mã định danh muốn xóa:");
        String id = scanner.nextLine();
        boolean flag = false;
        if (hocVienList.isEmpty()) {
            System.out.println("Không có trong danh sách");
        } else {
            for (HocVien item : hocVienList) {
                if (item.getIdMaDinhDanh().equals(id)) {
                    System.out.println("Bạn có muốn xóa (Y/N)");
                    String confirm = scanner.nextLine();
                    if ("Y".equals(confirm.toUpperCase())) {
                        hocVienList.remove(item);
                        System.out.println("đã xóa thành công");
                    } else if ("N".equals(confirm.toUpperCase())) {
                        break;
                    }
                    flag = true;
                    break;
                }
            }
        }
        if (flag) {
            updateFile(hocVienList);
        } else {
            try {
                throw new NotFoundSavingException();
            } catch (NotFoundSavingException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void sort() {
        hocVienList = getHocVienList();
        ComparatorHocVien comparatorHocVien = new ComparatorHocVien();
        Collections.sort(hocVienList, comparatorHocVien);
        for (HocVien item : hocVienList) {
            System.out.println(item);
        }
    }

    public static void updateFile(List<HocVien> hocVienList) {
        List<String> stringList = new ArrayList<>();
        for (HocVien item : hocVienList) {
            stringList.add(item.getLine());
        }
        ReadAndWriteFileNhanSu.write("src/exam/data/nhansu.csv", stringList);
    }
}
