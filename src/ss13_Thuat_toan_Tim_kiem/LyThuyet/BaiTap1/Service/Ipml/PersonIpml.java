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
            System.out.println("------Chon nh??n vi??n mu???n th??m------ \n" +
                    "1. Th??m NVSX \n" +
                    "2. Th??m NVQL \n" +
                    "0. Back Menu \n");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    addProduct();
                    break;
                case "2":
                    addManager();
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Nh???p sai, m???i b???n nh???p l???i , ch???n s??? 1-->3");
            }
        } while (true);
    }

    public void addProduct() {
        readPerson();

        System.out.println("-------Th??m m???i NVSX------");
        String codePerson;
        do {
            try {
                System.out.println("Nh???p m?? nh??n vi??n : NVSX-XXXX v???i x l?? s??? ");
                codePerson = scanner.nextLine();
                if (Regexss13.formatMaNhanVien(codePerson)) {
                    break;
                } else throw new MaNhanVienException("Phai nh???p ????ng m???u");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        String fullName;
        do {
            try {
                System.out.println("Nh???p H??? V?? T??n : V?? d??? : Nh???t Tu???n ");
                fullName = scanner.nextLine();
                if (Regexss13.formatHovaTen(fullName)) {
                    break;
                } else throw new HovaTenException("Phai nh???p ????ng m???u");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        String dayOfBirth;
        do {
            try {
                System.out.println("Nh???p Ng??y th??ng n??m : V?? d??? 22/12/2022");
                dayOfBirth = scanner.nextLine();
                if (Regexss13.formatDate(dayOfBirth)) {
                    break;
                } else throw new NgayThangNamException("Phai nh???p ????ng m???u");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        String address;
        do {
            try {
                System.out.println("Nh???p ?????a ch??? : V?? d??? 123SonLa Kh??ng ghi k?? t??? ?????c bi???t");
                address = scanner.nextLine();
                if (Regexss13.formatDiachi(address)) {
                    break;
                } else throw new DiachiException("Phai nh???p ????ng m???u");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        String numSp;
        do {
            try {
                System.out.println("Nh???p S??? l?????ng s???n ph???m : nh???p s???");
                numSp = scanner.nextLine();
                if (Regexss13.formatNumSP(numSp)) {
                    break;
                } else throw new SoSanPhamException("Phai nh???p ????ng m???u");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        String moneySp;
        do {
            try {
                System.out.println("Nh???p S??? ti???n S???n ph???m : nh???p s???");
                moneySp = scanner.nextLine();
                if (Regexss13.formatMoneySP(moneySp)) {
                    break;
                } else throw new MoneySPException("Phai nh???p ????ng m???u");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        int max = 0;
        int id;
        if (personList.isEmpty()) {
            id = 1;
        } else {
            for (Person item1 : personList) {
                if (item1.getId() > max) {
                    max = item1.getId();
                }
            }
            id = max + 1;
        }

        personList.add(new ProductionStaff(id, codePerson, fullName, dayOfBirth, address, numSp, moneySp));

        String str = "";
        for (Person list : personList) {
            String line = list.inFor();
            str += line + "\n";

            ReadAnhWrite.writeFile(PATH_ALL_FILE, str);
            System.out.println("Them thanh cong");
        }
    }

    public void addManager() {
        readPerson();

        System.out.println("Th??m m???i NVQL");
        String codePerson1;
        do {
            try {
                System.out.println("Nh???p m?? nh??n vi??n : NVSX-XXXX v???i x l?? s??? ");
                codePerson1 = scanner.nextLine();
                if (Regexss13.formatMaNhanVien(codePerson1)) {
                    break;
                } else throw new MaNhanVienException("Phai nh???p ????ng m???u");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        String fullName1;
        do {
            try {
                System.out.println("Nh???p H??? V?? T??n : V?? d??? : Nh???t Tu???n ");
                fullName1 = scanner.nextLine();
                if (Regexss13.formatHovaTen(fullName1)) {
                    break;
                } else throw new HovaTenException("Phai nh???p ????ng m???u");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        String dayOfBirth1;
        do {
            try {
                System.out.println("Nh???p Ng??y th??ng n??m : V?? d??? 22/12/2022");
                dayOfBirth1 = scanner.nextLine();
                if (Regexss13.formatDate(dayOfBirth1)) {
                    break;
                } else throw new NgayThangNamException("Phai nh???p ????ng m???u");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        String address1;
        do {
            try {
                System.out.println("Nh???p ?????a ch??? : V?? d??? 123SonLa Kh??ng ghi k?? t??? ?????c bi???t");
                address1 = scanner.nextLine();
                if (Regexss13.formatDiachi(address1)) {
                    break;
                } else throw new DiachiException("Phai nh???p ????ng m???u");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        String salaryCb;
        do {
            try {
                System.out.println("Nh???p L????ng C?? b???n : V?? d??? 12000000");
                salaryCb = scanner.nextLine();
                if (Regexss13.formatLuongCoBan(salaryCb)) {
                    break;
                } else throw new LuongCoBanException("Phai nh???p ????ng m???u");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        String numSalary;
        do {
            try {
                System.out.println("Nh???p L????ng C?? b???n : V?? d??? 12000000");
                numSalary = scanner.nextLine();
                if (Regexss13.formatHesoLuong(numSalary)) {
                    break;
                } else throw new HeSoLuongException("Phai nh???p ????ng m???u");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (true);

        int max1 = 0;
        int id1;
        if (personList.isEmpty()) {
            id1 = 1;
        } else {
            for (Person item1 : personList) {
                if (item1.getId() > max1) {
                    max1 = item1.getId();
                }
            }
            id1 = max1 + 1;
        }
        personList.add(new ManagerStaff(id1, codePerson1, fullName1, dayOfBirth1, address1, salaryCb, numSalary));

        String str1 = "";
        for (Person list : personList) {
            String line = list.inFor();
            str1 += line + "\n";
        }
        ReadAnhWrite.writeFile(PATH_ALL_FILE, str1);
        System.out.println("Them thanh cong");
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
        readPerson();

        System.out.println("Nh???p m?? nh??n vi??n mu???n x??a");
        String codeProduct = scanner.nextLine();

        boolean check = false;
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getCodePerson().equals(codeProduct)) {
                System.out.println("-----Ch???n---- \n" +
                        "1.Ch???n X??a \n" +
                        "0.Ch???n Quay l???i \n" +
                        "Xin ch???n ch???c n??ng");

                String choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        personList.remove(i);
                        break;
                    case "2":
                        return;
                    default:
                        System.out.println("Nh???p sai, M???i b???n nh???p l???i, Ch???n 1-->2");
                }
            } else {
                check = true;
            }
        }
        try {
            if (check == true) {
                throw new KhongtimthayEmployeeException("kh??ng t??m th???y ");
            }
        } catch (KhongtimthayEmployeeException e) {
            System.out.println(e.getMessage());
        }

        String line = "";
        for (Person item : personList) {
            line += item.inFor();
        }
    }

    @Override
    public void search() {
        System.out.println("Nh???p ????? t??m ki???m");
        readPerson();
        String input = scanner.nextLine();
        boolean check = false;
        for (Person list : personList) {
            if (list.getCodePerson().contains(input)||
                list.getFullName().contains(input) ||
                list.getAddress().contains(input) ||
                list.getDayOfBirth().contains(input)) {
                System.out.println(list);
                check=true;
            }
        }
        if (check) {
            System.out.println("Kh??ng t??m th???y");
        }
    }
}
