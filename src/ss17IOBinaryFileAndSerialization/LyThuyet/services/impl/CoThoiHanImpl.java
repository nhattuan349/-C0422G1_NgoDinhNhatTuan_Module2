package ss17IOBinaryFileAndSerialization.LyThuyet.services.impl;


import ss17IOBinaryFileAndSerialization.LyThuyet.model.CoThoiHan;
import ss17IOBinaryFileAndSerialization.LyThuyet.services.Service;
import ss17IOBinaryFileAndSerialization.LyThuyet.utils.NotFoundSavingException;
import ss17IOBinaryFileAndSerialization.LyThuyet.utils.ReadAndWriteFile;
import ss17IOBinaryFileAndSerialization.LyThuyet.utils.RegexDaiHan;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoThoiHanImpl implements Service {
    public static Scanner scanner = new Scanner(System.in);
    public static List<CoThoiHan> coThoiHanList;

    public static List<CoThoiHan> getCoThoiHanList() {
        List<CoThoiHan> coThoiHanList = new ArrayList<>();
        List<String[]> listStr = ReadAndWriteFile.read("src/ss17IOBinaryFileAndSerialization/LyThuyet/data/cothoihan.csv");
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
        String idSo = RegexDaiHan.idRegexCoThoiHan(coThoiHanList);

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
        String kyHan = RegexDaiHan.kiHanNganHan();

        coThoiHanList.add(new CoThoiHan(idSo, idKhachHang, ngayMoSo, thoiGianBatDauGui, soTienGUi, laiSuat, kyHan));
        updateFile(coThoiHanList);

        System.out.println("Thêm thành công");
    }

    @Override
    public void delete() {
        coThoiHanList = getCoThoiHanList();
        System.out.println("nhập mã nhân viên muốn xóa : ");
        String id = scanner.nextLine();
        boolean flag = false;
        if (coThoiHanList.isEmpty()) {
            System.out.println("Khong co trong danh sasch");
        } else {
            for (CoThoiHan item : coThoiHanList) {
                if (item.getIdSo().equals(id)) {
                    System.out.println("Bạn có muốn xóa (Y/N)");
                    String confirm = scanner.nextLine();
                    if ("Y".equals(confirm.toUpperCase())) {
                        coThoiHanList.remove(item);
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
            updateFile(coThoiHanList);
        } else {
            try {
                throw new NotFoundSavingException();
            } catch (NotFoundSavingException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void updateFile(List<CoThoiHan> coThoiHanList) {
        List<String> stringList = new ArrayList<>();
        for (CoThoiHan item : coThoiHanList) {
            stringList.add(item.getLine());
        }
        ReadAndWriteFile.write("src/ss17IOBinaryFileAndSerialization/LyThuyet/data/cothoihan.csv", stringList);
    }
}
