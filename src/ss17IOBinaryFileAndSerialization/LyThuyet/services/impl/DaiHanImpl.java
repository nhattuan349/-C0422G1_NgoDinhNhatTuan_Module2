package ss17IOBinaryFileAndSerialization.LyThuyet.services.impl;


import ss17IOBinaryFileAndSerialization.LyThuyet.model.DaiHan;
import ss17IOBinaryFileAndSerialization.LyThuyet.services.Service;
import ss17IOBinaryFileAndSerialization.LyThuyet.utils.NotFoundSavingException;
import ss17IOBinaryFileAndSerialization.LyThuyet.utils.ReadAndWriteFile;
import ss17IOBinaryFileAndSerialization.LyThuyet.utils.RegexDaiHan;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DaiHanImpl implements Service {
    public static Scanner scanner = new Scanner(System.in);
    public static List<DaiHan> daiHanList;

    public static List<DaiHan> getDaiHanList() {
        List<DaiHan> daiHanList = new ArrayList<>();
        List<String[]> listStr = ReadAndWriteFile.read("src/ss17IOBinaryFileAndSerialization/LyThuyet/data/daihan.csv");
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
        String idSo = RegexDaiHan.idRegex(daiHanList);

        System.out.println("nhập mã số khách hàng");
        String idKhachHang = scanner.nextLine();

        System.out.println("nhập ngày mở sổ");
        String ngayMoSo = RegexDaiHan.dateOfBirth();

        System.out.println("nhập thời gian gửi");
        String thoiGianBatDauGui = RegexDaiHan.dateOfBirth();

        System.out.println("nhập số tiên gủi");
        String soTienGUi = scanner.nextLine();

        System.out.println("nhập lãi suất");
        String laiSuat = scanner.nextLine() + "%";

        System.out.println("nhập kỳ hạn");
        String kyHan = RegexDaiHan.kiHan();

        System.out.println("nhập ưu đãi");
        String uuDai = scanner.nextLine();
        daiHanList.add(new DaiHan(idSo, idKhachHang, ngayMoSo, thoiGianBatDauGui, soTienGUi,
                laiSuat, kyHan, uuDai));
        updateFile(daiHanList);
        System.out.println("Thêm thành công");
    }

    @Override
    public void delete() {
        daiHanList = getDaiHanList();
        System.out.println("nhập mã nhân viên muốn xóa : ");
        String id = scanner.nextLine();
        boolean flag = false;
        if (daiHanList.isEmpty()) {
            System.out.println("Khong co trong danh sasch");
        } else {
            for (DaiHan item : daiHanList) {
                if (item.getIdSo().equals(id)) {
                    System.out.println("Bạn có muốn xóa (Y/N)");
                    String confirm = scanner.nextLine();
                    if ("Y".equals(confirm.toUpperCase())) {
                        daiHanList.remove(item);
                        System.out.println("da xoa thanh cong");
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

    public static void updateFile(List<DaiHan> daiHanList) {
        List<String> stringList = new ArrayList<>();
        for (DaiHan item : daiHanList) {
            stringList.add(item.getLine());
        }
        ReadAndWriteFile.write("src/ss17IOBinaryFileAndSerialization/LyThuyet/data/daihan.csv", stringList);
    }
}