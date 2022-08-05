package exam.service.impl;

import exam.model.HocVien;
import exam.model.NhanVien;
import exam.regex.RegexNhanSu;
import exam.service.ServiceNhanSu;
import exam.utils.ComparatorNhanVien;
import exam.utils.ReadAndWriteFileNhanSu;
import ss17IOBinaryFileAndSerialization.ThucHanh.bai1.Exception.NotFoundSavingException;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NhanVienImpl implements ServiceNhanSu {

    public static Scanner scanner = new Scanner(System.in);
    public static List<NhanVien> nhanVienList;

    public static List<NhanVien> getNhanVienList() {
        List<NhanVien> nhanVienList = new ArrayList<>();
        List<String[]> listStr = ReadAndWriteFileNhanSu.read("src/exam/data/nhansu.csv");
        for (String[] item : listStr) {
            nhanVienList.add(new NhanVien(
                    item[0],
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    item[5],
                    item[6],
                    item[7]));
        }
        return nhanVienList;
    }


    @Override
    public void display() {
        nhanVienList = getNhanVienList();
        for (NhanVien item : nhanVienList) {
            System.out.println(item);
        }
    }

    @Override
    public void add() {
        nhanVienList = getNhanVienList();
        System.out.println("Nhap ma dinh danh");
        String idMaDinhDanh = RegexNhanSu.idMaDinhDanhRegexNhanVien(nhanVienList);

        System.out.println("Nhap ho va ten");
        String hovaTen = RegexNhanSu.HoTenRegexNhanVien(nhanVienList);
        System.out.println("Nhap ngay sinh");
        String ngaySinh = RegexNhanSu.ngaySinhException();
        System.out.println("Nhap dia chi");
        String diaChi = scanner.nextLine();
        System.out.println("Nhap so dien thoai");
        String soDienThoai = RegexNhanSu.soDienThoaiNhanVien(nhanVienList);
        System.out.println("Nhap luong");
        String luong = RegexNhanSu.luongRegexNhanVien(nhanVienList);
        System.out.println("Nhap phongBan");
        String phongBan = scanner.nextLine();
        System.out.println("Nhap vi tri");
        String viTri = scanner.nextLine();

        nhanVienList.add(new NhanVien(idMaDinhDanh, hovaTen, ngaySinh, diaChi, soDienThoai, luong, phongBan, viTri));
        updateFile(nhanVienList);
        System.out.println("Thêm thành công");
    }

    @Override
    public void delete() {
        nhanVienList = getNhanVienList();
        System.out.println("Nhập ID Mã định danh muốn xóa:");
        String id = scanner.nextLine();
        boolean flag = false;
        if (nhanVienList.isEmpty()) {
            System.out.println("Không có trong danh sách");
        } else {
            for (NhanVien item : nhanVienList) {
                if (item.getIdMaDinhDanh().equals(id)) {
                    System.out.println("Bạn có muốn xóa (Y/N)");
                    String confirm = scanner.nextLine();
                    if ("Y".equals(confirm.toUpperCase())) {
                        nhanVienList.remove(item);
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
            updateFile(nhanVienList);
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
        nhanVienList =getNhanVienList();
        ComparatorNhanVien comparatorNhanVien = new ComparatorNhanVien();
        Collections.sort(nhanVienList,comparatorNhanVien);
        for (NhanVien item: nhanVienList) {
            System.out.println(item);
        }
    }

    public static void updateFile (List < NhanVien > nhanVienList) {
            List<String> stringList = new ArrayList<>();
            for (NhanVien item : nhanVienList) {
                stringList.add(item.getLine());
            }
            ReadAndWriteFileNhanSu.write("src/exam/data/nhansu.csv", stringList);
        }


}