package ss13_Thuat_toan_Tim_kiem.LyThuyet.BaiTap1.Service.Ipml;

import ss13_Thuat_toan_Tim_kiem.LyThuyet.BaiTap1.Model.ManagerStaff;
import ss13_Thuat_toan_Tim_kiem.LyThuyet.BaiTap1.Model.Person;
import ss13_Thuat_toan_Tim_kiem.LyThuyet.BaiTap1.Model.ProductionStaff;
import ss13_Thuat_toan_Tim_kiem.LyThuyet.BaiTap1.Service.Service;
import ss13_Thuat_toan_Tim_kiem.LyThuyet.BaiTap1.Untils.ReadAnhWrite;
import ss13_Thuat_toan_Tim_kiem.LyThuyet.BaiTap1.exception.*;
import ss13_Thuat_toan_Tim_kiem.LyThuyet.BaiTap1.regex.Regexss13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonIpml implements Service {
    Scanner scanner = new Scanner(System.in);
    final String PATH_ALL_FILE = "J:\\CG\\CodegymX\\module2a\\-C0422G1_NgoDinhNhatTuan_Module2\\src\\ss13_Thuat_toan_Tim_kiem\\LyThuyet\\BaiTap1\\Data\\Person.csv";

    List<Person> personList = new ArrayList<>();


    @Override
    public void display() {

        List<String[]> listLine = ReadAnhWrite.readFile(PATH_ALL_FILE);
        personList.clear();

        for (String[] item : listLine) {
            if (item[1].contains("NVSX")) {
                int id = Integer.parseInt(item[0]);
                String codePerson = item[1];
                String fullName = item[2];
                String dayOfBirth = item[3];
                String address = item[4];
                String numSp = item[5];
                String moneySp = item[6];

                personList.add(new ProductionStaff(id, codePerson, fullName, dayOfBirth, address, numSp, moneySp));
            } else {
                int id = Integer.parseInt(item[0]);
                String codePerson = item[1];
                String fullName = item[2];
                String dayOfBirth = item[3];
                String address = item[4];
                String salaryCb = item[5];
                String numSalary = item[6];

                personList.add(new ManagerStaff(id, codePerson, fullName, dayOfBirth, address, salaryCb, numSalary));
            }
        }
        for (Person item : personList) {
            System.out.println(item);
        }
    }

    @Override
    public void add() {
        do {
            System.out.println("------Chon nhân viên muốn thêm------" +
                    "1. Thêm NVSX \n" +
                    "2. Thêm NVQL \n" +
                    "0. Back Menu \n");
            String input = scanner.nextLine();
            switch (input) {
                case "1":

                    break;
                case "2":
                    break;
                case "0":
                    break;
            }
        } while (true);
    }

    public void addProduct() {
        readPerson();

        System.out.println("-------Thêm mới NVSX------");
        String codePerson;
        do {
            try {
                System.out.println("Nhập mã nhân viên : NVSX-XXXX với x là số ");
                codePerson = scanner.nextLine();
                if (Regexss13.formatMaNhanVien(codePerson)) {
                    break;
                }else throw new MaNhanVienException("Phai nhập đúng mẫu");
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }while (true);

        String fullName;
        do {
            try {
                System.out.println("Nhập Họ Và Tên : Ví dụ : Nhật Tuấn ");
                fullName = scanner.nextLine();
                if (Regexss13.formatHovaTen(fullName)) {
                    break;
                }else throw new HovaTenException("Phai nhập đúng mẫu");
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }while (true);

        String dayOfBirth;
        do {
            try {
                System.out.println("Nhập Ngày tháng năm : Ví dụ 22/12/2022");
                dayOfBirth = scanner.nextLine();
                if (Regexss13.formatDate(dayOfBirth)) {
                    break;
                }else throw new NgayThangNamException("Phai nhập đúng mẫu");
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }while (true);

        String address;
        do {
            try {
                System.out.println("Nhập Địa chỉ : Ví dụ 123SonLa Không ghi ký tự đặc biệt");
                address = scanner.nextLine();
                if (Regexss13.formatDiachi(address)) {
                    break;
                }else throw new DiachiException("Phai nhập đúng mẫu");
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }while (true);

        String numSp;
        do {
            try {
                System.out.println("Nhập Số lượng sản phẩm : nhập số");
                numSp = scanner.nextLine();
                if (Regexss13.formatNumSP(numSp)) {
                    break;
                }else throw new SoSanPhamException("Phai nhập đúng mẫu");
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }while (true);

        String moneySp;
        do {
            try {
                System.out.println("Nhập Số tiền Sản phẩm : nhập số");
                moneySp = scanner.nextLine();
                if (Regexss13.formatMoneySP(moneySp)) {
                    break;
                }else throw new MoneySPException("Phai nhập đúng mẫu");
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }while (true);

        int max = 0;
        int id;
        if (personList.isEmpty()) {
            id=1;
        }else {
            for (Person item1: personList) {
                if (item1.getId()>max){
                    max=item1.getId();
                }
            }
            id=max+1;
        }

        personList.add(new ProductionStaff(id,codePerson,fullName,dayOfBirth,address,numSp,moneySp));
    }

    public void addManager() {
    }

    public void readPerson() {
        List<String[]> listLine = ReadAnhWrite.readFile(PATH_ALL_FILE);
        personList.clear();

        for (String[] item : listLine) {
            if (item[1].contains("NVSX")) {
                int id = Integer.parseInt(item[0]);
                String codePerson = item[1];
                String fullName = item[2];
                String dayOfBirth = item[3];
                String address = item[4];
                String numSp = item[5];
                String moneySp = item[6];

                personList.add(new ProductionStaff(id, codePerson, fullName, dayOfBirth, address, numSp, moneySp));
            } else {
                int id = Integer.parseInt(item[0]);
                String codePerson = item[1];
                String fullName = item[2];
                String dayOfBirth = item[3];
                String address = item[4];
                String salaryCb = item[5];
                String numSalary = item[6];

                personList.add(new ManagerStaff(id, codePerson, fullName, dayOfBirth, address, salaryCb, numSalary));
            }
        }
    }


    @Override
    public void remove() {

    }

    @Override
    public void search() {

    }
}
