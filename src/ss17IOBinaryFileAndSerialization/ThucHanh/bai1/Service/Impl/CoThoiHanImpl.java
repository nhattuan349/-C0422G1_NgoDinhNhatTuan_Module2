package ss17IOBinaryFileAndSerialization.ThucHanh.bai1.Service.Impl;


import ss17IOBinaryFileAndSerialization.ThucHanh.bai1.Exception.NotFoundSavingException;
import ss17IOBinaryFileAndSerialization.ThucHanh.bai1.Regex.Regex;
import ss17IOBinaryFileAndSerialization.ThucHanh.bai1.Service.Service;
import ss17IOBinaryFileAndSerialization.ThucHanh.bai1.model.CoThoiHan;
import ss17IOBinaryFileAndSerialization.ThucHanh.bai1.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoThoiHanImpl implements Service {
    public static Scanner scanner = new Scanner(System.in);
    public static List<ss17IOBinaryFileAndSerialization.ThucHanh.bai1.model.CoThoiHan> coThoiHanList;

    public static List<CoThoiHan> getCoThoiHanList() {
        List<CoThoiHan> coThoiHanList = new ArrayList<>();
        List<String[]> listStr = ReadAndWriteFile.read("src/ss17IOBinaryFileAndSerialization/ThucHanh/bai1/data/CoThoiHan.csv");
        for (String[] item : listStr) {
            coThoiHanList.add(new CoThoiHan(
                    item[0],
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    item[5],
                    item[6]));
        }
        return coThoiHanList;
    }

    @Override
    public void display() {
        coThoiHanList = getCoThoiHanList();
        for (CoThoiHan item : coThoiHanList) {
            System.out.println(item);
        }
    }

    @Override
    public void add() {
        coThoiHanList = getCoThoiHanList();
        System.out.println("nhập mã số sổ");
        String idSo = Regex.idRegexCoThoiHan(coThoiHanList);
        System.out.println("Nhập mã số khách hàng");
        String idKhachHang = Regex.idKhachHangRegexCoThoiHan(coThoiHanList);
        System.out.println("nhập ngày mở sổ");
        String ngayMoSo = Regex.dateException();
        System.out.println("nhập thời gian gửi");
        String thoiGianBatDauGui = Regex.dateException();
        System.out.println("nhập số tiền gửi");
        String soTienGUi = Regex.SoTienGuiRegexCoThoiHan(coThoiHanList);
        System.out.println("nhập lãi suất");
        String laiSuat = Regex.LaiSuatRegexCoThoiHan(coThoiHanList) + "%";
        System.out.println("nhập kỳ hạn");
        String kyHan = Regex.kiHanNganHan();

        coThoiHanList.add(new CoThoiHan(idSo, idKhachHang, ngayMoSo, thoiGianBatDauGui, soTienGUi, laiSuat, kyHan));
        updateFile(coThoiHanList);

        System.out.println("Thêm thành công");
    }

    @Override
    public void update() {
        coThoiHanList = getCoThoiHanList();
        System.out.println("Nhập id muốn sửa");
        String id = scanner.nextLine();
        boolean flag = false;
        int index = 0;
        for (int i = 0; i<coThoiHanList.size();i++) {
            if (coThoiHanList.get(i).getIdSo().equals(id)){
                index=i;
                flag =true;
                break;
            }
        }
        if (flag) {
            System.out.println("nhập mã số sổ");
            String idSo = Regex.idRegexCoThoiHan(coThoiHanList);
            System.out.println("Nhập mã số khách hàng");
            String idKhachHang = Regex.idKhachHangRegexCoThoiHan(coThoiHanList);
            System.out.println("nhập ngày mở sổ");
            String ngayMoSo = Regex.dateException();
            System.out.println("nhập thời gian gửi");
            String thoiGianBatDauGui = Regex.dateException();
            System.out.println("nhập số tiền gửi");
            String soTienGUi = Regex.SoTienGuiRegexCoThoiHan(coThoiHanList);
            System.out.println("nhập lãi suất");
            String laiSuat = Regex.LaiSuatRegexCoThoiHan(coThoiHanList) + "%";
            System.out.println("nhập kỳ hạn");
            String kyHan = Regex.kiHanNganHan();

            coThoiHanList.add(new CoThoiHan(idSo, idKhachHang, ngayMoSo, thoiGianBatDauGui, soTienGUi, laiSuat, kyHan));
            updateFile(coThoiHanList);
            System.out.println("Thêm thành công");
        }else {
            System.out.println("Không tim thấy id");
        }
    }

    @Override
    public void delete() {
        coThoiHanList = getCoThoiHanList();
        System.out.println("Nhập mã nhân viên muốn xóa:");
        String id = scanner.nextLine();
        boolean flag = false;
        if (coThoiHanList.isEmpty()) {
            System.out.println("Không có trong danh sách");
        } else {
            for (CoThoiHan item : coThoiHanList) {
                if (item.getIdSo().equals(id)) {
                    System.out.println("Bạn có muốn xóa (Y/N)");
                    String confirm = scanner.nextLine();
                    if ("Y".equals(confirm.toUpperCase())) {
                        coThoiHanList.remove(item);
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
            updateFile(coThoiHanList);
        } else {
            try {
                throw new NotFoundSavingException();
            } catch (NotFoundSavingException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void search() {

    }

    @Override
    public void sort() {

    }

    public static void updateFile(List<CoThoiHan> coThoiHanList) {
        List<String> stringList = new ArrayList<>();
        for (CoThoiHan item : coThoiHanList) {
            stringList.add(item.getLine());
        }
        ReadAndWriteFile.write("src/ss17IOBinaryFileAndSerialization/ThucHanh/bai1/data/CoThoiHan.csv", stringList);
    }
}
