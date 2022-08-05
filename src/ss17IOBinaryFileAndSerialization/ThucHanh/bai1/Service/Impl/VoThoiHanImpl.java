package ss17IOBinaryFileAndSerialization.ThucHanh.bai1.Service.Impl;

import ss17IOBinaryFileAndSerialization.ThucHanh.bai1.Exception.NotFoundSavingException;
import ss17IOBinaryFileAndSerialization.ThucHanh.bai1.Regex.Regex;
import ss17IOBinaryFileAndSerialization.ThucHanh.bai1.Service.Service;
import ss17IOBinaryFileAndSerialization.ThucHanh.bai1.model.CoThoiHan;
import ss17IOBinaryFileAndSerialization.ThucHanh.bai1.model.VoThoiHan;
import ss17IOBinaryFileAndSerialization.ThucHanh.bai1.utils.ComparatorIDVoThoiHan;
import ss17IOBinaryFileAndSerialization.ThucHanh.bai1.utils.ReadAndWriteFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class VoThoiHanImpl implements Service {
    public static Scanner scanner = new Scanner(System.in);
    public static List<VoThoiHan> voThoiHanList;

    public static List<VoThoiHan> getVoThoiHanList() {
        List<VoThoiHan> voThoiHanList = new ArrayList<>();
        List<String[]> listStr = ReadAndWriteFile.read("src/ss17IOBinaryFileAndSerialization/ThucHanh/bai1/data/VoThoiHan.csv");
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
        String idSo = Regex.idRegexVoThoiHan(voThoiHanList);

        System.out.println("Nhập mã số khách hàng");
        String idKhachHang = Regex.idKhachHangRegexVoThoiHan(voThoiHanList);

        System.out.println("nhập ngày mở sổ");
        String ngayMoSo = Regex.dateException();

        System.out.println("nhập thời gian gửi");
        String thoiGianBatDauGui = Regex.dateException();

        System.out.println("nhập số tiền gửi");
        String soTienGUi = Regex.SoTienGuiRegexVoThoiHan(voThoiHanList);

        System.out.println("nhập lãi suất");
        String laiSuat = Regex.LaiSuatRegexVoThoiHan(voThoiHanList)+"%";


        voThoiHanList.add(new VoThoiHan(idSo, idKhachHang, ngayMoSo, thoiGianBatDauGui, soTienGUi, laiSuat ));
        updateFile(voThoiHanList);

        System.out.println("Thêm thành công");
    }

    @Override
    public void update() {
        voThoiHanList = getVoThoiHanList();
        System.out.println("Nhập id muốn sửa");
        String id = scanner.nextLine();
        boolean flag = false;
        int index = 0;
        for (int i = 0; i<voThoiHanList.size();i++) {
            if (voThoiHanList.get(i).getIdSo().equals(id)){
                index=i;
                flag =true;
                break;
            }
        }
        if (flag) {
            System.out.println("nhập mã số sổ");
            String idSo = Regex.idRegexVoThoiHan(voThoiHanList);

            System.out.println("Nhập mã số khách hàng");
            String idKhachHang = Regex.idKhachHangRegexVoThoiHan(voThoiHanList);

            System.out.println("nhập ngày mở sổ");
            String ngayMoSo = Regex.dateException();

            System.out.println("nhập thời gian gửi");
            String thoiGianBatDauGui = Regex.dateException();

            System.out.println("nhập số tiền gửi");
            String soTienGUi = Regex.SoTienGuiRegexVoThoiHan(voThoiHanList);

            System.out.println("nhập lãi suất");
            String laiSuat = Regex.LaiSuatRegexVoThoiHan(voThoiHanList)+"%";


            voThoiHanList.add(new VoThoiHan(idSo, idKhachHang, ngayMoSo, thoiGianBatDauGui, soTienGUi, laiSuat ));
            updateFile(voThoiHanList);
            System.out.println("Thêm thành công");
        }else {
            System.out.println("Không tim thấy id");
        }
    }

    @Override
    public void delete() {
        voThoiHanList = getVoThoiHanList();
        System.out.println("Nhập mã nhân viên muốn xóa:");
        String id = scanner.nextLine();
        boolean flag = false;
        if (voThoiHanList.isEmpty()) {
            System.out.println("Không có trong danh sách");
        } else {
            for (VoThoiHan item : voThoiHanList) {
                if (item.getIdSo().equals(id)) {
                    System.out.println("Bạn có muốn xóa (Y/N)");
                    String confirm = scanner.nextLine();
                    if ("Y".equals(confirm.toUpperCase())) {
                        voThoiHanList.remove(item);
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
            updateFile(voThoiHanList);
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
        voThoiHanList = getVoThoiHanList();
        System.out.println("Nhập ID");
        String id = scanner.nextLine();
        boolean flag = true;
        for (VoThoiHan item: voThoiHanList) {
            if (item.getIdSo().contains(id)) {
                System.out.println(item);
                flag=false;
            }
        }if (flag) {
            System.out.println("id không tồn tại");
            search();
        }
    }

    @Override
    public void sort() {
        voThoiHanList = getVoThoiHanList();
        ComparatorIDVoThoiHan comparatorIDVoThoiHan = new ComparatorIDVoThoiHan();
        Collections.sort(voThoiHanList,comparatorIDVoThoiHan);
        for (VoThoiHan item: voThoiHanList) {
            System.out.println(item);
        }
    }
    public static void updateFile(List<VoThoiHan> voThoiHanList) {
        List<String> stringList = new ArrayList<>();
        for (VoThoiHan item : voThoiHanList) {
            stringList.add(item.getLine());
        }
        ReadAndWriteFile.write("src/ss17IOBinaryFileAndSerialization/ThucHanh/bai1/data/VoThoiHan.csv", stringList);
    }
}
