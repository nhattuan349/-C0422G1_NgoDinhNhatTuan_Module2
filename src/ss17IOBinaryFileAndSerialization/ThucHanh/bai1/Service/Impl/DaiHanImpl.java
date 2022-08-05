package ss17IOBinaryFileAndSerialization.ThucHanh.bai1.Service.Impl;



import ss17IOBinaryFileAndSerialization.ThucHanh.bai1.model.DaiHan;
import ss17IOBinaryFileAndSerialization.ThucHanh.bai1.Exception.NotFoundSavingException;
import ss17IOBinaryFileAndSerialization.ThucHanh.bai1.Regex.Regex;
import ss17IOBinaryFileAndSerialization.ThucHanh.bai1.Service.Service;
import ss17IOBinaryFileAndSerialization.ThucHanh.bai1.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DaiHanImpl implements Service {

    public static Scanner scanner = new Scanner(System.in);
    public static List<DaiHan> daiHanList;

    public static List<DaiHan> getDaiHanList() {
        List<DaiHan> daiHanList = new ArrayList<>();
        List<String[]> listStr = ReadAndWriteFile.read("src/ss17IOBinaryFileAndSerialization/ThucHanh/bai1/data/DaiHan.csv");
        for (String[] item : listStr) {
            daiHanList.add(new DaiHan(
                    item[0],
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    item[5],
                    item[6],
                    item[7]));
        }
        return daiHanList;
    }

    @Override
    public void display() {
        daiHanList = getDaiHanList();
        for (DaiHan item : daiHanList) {
            System.out.println(item);
        }
    }

    @Override
    public void add() {
        daiHanList = getDaiHanList();
        System.out.println("nhập mã số sổ");
        String idSo = Regex.idRegexDaiHan(daiHanList);
        System.out.println("Nhập mã số khách hàng");
        String idKhachHang = Regex.idKhachHangRegexDaiHan(daiHanList);
        System.out.println("nhập ngày mở sổ");
        String ngayMoSo = Regex.dateException();
        System.out.println("nhập thời gian gửi");
        String thoiGianBatDauGui = Regex.dateException();
        System.out.println("nhập số tiền gửi");
        String soTienGUi = Regex.SoTienGuiRegexDaiHan(daiHanList);
        System.out.println("nhập lãi suất");
        String laiSuat = Regex.LaiSuatRegexDaiHan(daiHanList) + "%";
        System.out.println("nhập kỳ hạn");
        String kyHan = Regex.kiHanDaiHan();
        System.out.println("nhập ưu đãi");
        String uuDai = Regex.uuDaiRegexDaiHan(daiHanList);

        daiHanList.add(new DaiHan(idSo, idKhachHang, ngayMoSo, thoiGianBatDauGui, soTienGUi, laiSuat, kyHan,uuDai ));
        updateFile(daiHanList);

        System.out.println("Thêm thành công");
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {
        daiHanList = getDaiHanList();
        System.out.println("Nhập mã nhân viên muốn xóa:");
        String id = scanner.nextLine();
        boolean flag = false;
        if (daiHanList.isEmpty()) {
            System.out.println("Không có trong danh sách");
        } else {
            for (DaiHan item : daiHanList) {
                if (item.getIdSo().equals(id)) {
                    System.out.println("Bạn có muốn xóa (Y/N)");
                    String confirm = scanner.nextLine();
                    if ("Y".equals(confirm.toUpperCase())) {
                        daiHanList.remove(item);
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
            updateFile(daiHanList);
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
    public static void updateFile(List<DaiHan> daiHanList) {
        List<String> stringList = new ArrayList<>();
        for (DaiHan item : daiHanList) {
            stringList.add(item.getLine());
        }
        ReadAndWriteFile.write("src/ss17IOBinaryFileAndSerialization/ThucHanh/bai1/data/DaiHan.csv", stringList);
    }
}
