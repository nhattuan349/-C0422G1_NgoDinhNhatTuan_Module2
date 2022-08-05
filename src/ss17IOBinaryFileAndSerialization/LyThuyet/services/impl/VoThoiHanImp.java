package ss17IOBinaryFileAndSerialization.LyThuyet.services.impl;


import ss17IOBinaryFileAndSerialization.LyThuyet.model.VoThoiHan;
import ss17IOBinaryFileAndSerialization.LyThuyet.services.Service;
import ss17IOBinaryFileAndSerialization.LyThuyet.utils.NotFoundSavingException;
import ss17IOBinaryFileAndSerialization.LyThuyet.utils.ReadAndWriteFile;
import ss17IOBinaryFileAndSerialization.LyThuyet.utils.RegexDaiHan;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VoThoiHanImp implements Service {
    public static Scanner scanner = new Scanner(System.in);
    public static List<VoThoiHan> voThoiHanList;

    public static List<VoThoiHan> getVoThoiHanList() {
        List<VoThoiHan> voThoiHanList = new ArrayList<>();
        List<String[]> listStr = ReadAndWriteFile.read("src/ss17IOBinaryFileAndSerialization/LyThuyet/data/vothoihan.csv");
        for (String[] item : listStr) {
            voThoiHanList.add(new VoThoiHan(
                    item[0],
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    item[5]));
        }
        return voThoiHanList;
    }

    @Override
    public void display() {
        voThoiHanList = getVoThoiHanList();
        for (VoThoiHan item : voThoiHanList) {
            System.out.println(item);
        }
    }

    @Override
    public void add() {
        voThoiHanList = getVoThoiHanList();
        System.out.println("nhập mã số sổ");
        String idSo = RegexDaiHan.idRegexVoThoiHan(voThoiHanList);

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

        voThoiHanList.add(new VoThoiHan(idSo, idKhachHang, ngayMoSo, thoiGianBatDauGui, soTienGUi, laiSuat));
        updateFile(voThoiHanList);
        System.out.println("Thêm thành công");
    }

    @Override
    public void delete() {
        voThoiHanList = getVoThoiHanList();
        System.out.println("nhập mã nhân viên muốn xóa : ");
        String id = scanner.nextLine();
        boolean flag = false;
        if (voThoiHanList.isEmpty()) {
            System.out.println("Khong co trong danh sasch");
        } else {
            for (VoThoiHan item : voThoiHanList) {
                if (item.getIdSo().equals(id)) {
                    System.out.println("Bạn có muốn xóa (Y/N)");
                    String confirm = scanner.nextLine();
                    if ("Y".equals(confirm.toUpperCase())) {
                        voThoiHanList.remove(item);
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
            updateFile(voThoiHanList);
        } else {
            try {
                throw new NotFoundSavingException();
            } catch (NotFoundSavingException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void updateFile(List<VoThoiHan> voThoiHanList) {
        List<String> stringList = new ArrayList<>();
        for (VoThoiHan item : voThoiHanList) {
            stringList.add(item.getLine());
        }
        ReadAndWriteFile.write("src/ss17IOBinaryFileAndSerialization/LyThuyet/data/vothoihan.csv", stringList);
    }
}