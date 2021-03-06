package ss16_IO_Text_File.LyThuyet.castudymodul2.services;

import castudymodul2.models.Customer;
import castudymodul2.services.CustomerService;
import castudymodul2.until.CustomerGuestType;
import castudymodul2.until.ReadAndWriteFileCsv;
import ss17IOBinaryFileAndSerialization.BaiTap.QuanLySanPhamLuuRaFileNhiPhan.ReadAndWriteFile;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceIpl implements CustomerService {

    private Scanner scanner = new Scanner(System.in);
    final String PATH_CUSTOMER = "src\\castudymodul2\\data\\customer_file.csv";

    @Override
    public void display() {
        List<String[]> listLine = ReadAndWriteFileCsv.readFile(PATH_CUSTOMER);
        List<Customer> customers = new LinkedList<>();

        for (String[] list : listLine) {
            int code = Integer.parseInt(list[0]);
            String fullName = list[1];
            String genDer = list[2];
            int id = Integer.parseInt(list[3]);
            int numberPhone = Integer.parseInt(list[4]);
            String email = list[5];
            String guestType = list[6];
            String address = list[7];

            Customer customer = new Customer(code, fullName, genDer, id, numberPhone, email, guestType, address);
            customers.add(customer);
        }
        for (Customer item : customers) {
            System.out.println(item);
        }
    }

    @Override
    public void add() {
        List<String[]> listLine = ReadAndWriteFileCsv.readFile(PATH_CUSTOMER);
        List<Customer> customers = new LinkedList<>();

        for (String[] list : listLine) {
            int code = Integer.parseInt(list[0]);
            String fullName = list[1];
            String genDer = list[2];
            int id = Integer.parseInt(list[3]);
            int numberPhone = Integer.parseInt(list[4]);
            String email = list[5];
            String guestType = list[6];
            String address = list[7];

            Customer customer = new Customer(code, fullName, genDer, id, numberPhone, email, guestType, address);
            customers.add(customer);
        }
        try {
            System.out.print("Nh???p m?? s??? kh??ch h??ng: ");
            int code1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Nh???p h??? t??n kh??ch h??ng: ");
            String name1 = scanner.nextLine();

            System.out.print("Nh???p gi???i t??nh kh??ch h??ng: ");
            String gender = scanner.nextLine();

            int id1 = customers.size() + 1;

            System.out.print("Nh???p s??? ??i???n tho???i: ");
            int phone = Integer.parseInt(scanner.nextLine());

            System.out.print("Nh???p Email: ");
            String email1 = scanner.nextLine();

            System.out.print("Nh???p ?????a ch??? kh??ch h??ng: ");
            String address1 = scanner.nextLine();

            String type = CustomerGuestType.guestType();

            customers.add(new Customer(code1, name1, gender, id1, phone, email1, type, address1));

            String str = "";
            for (Customer item : customers) {
                String line = item.getInfo();
                str += line + "\n";
            }
            ReadAndWriteFileCsv.writeFile(PATH_CUSTOMER, str);
            System.err.println("Th??m m???i th??nh c??ng");
        } catch (Exception E) {
            System.err.println("--L???i ?????nh d???ng--");
        }
    }


    @Override
    public void update() {
        List<String[]> listLine = ReadAndWriteFileCsv.readFile(PATH_CUSTOMER);
        List<Customer> customers = new LinkedList<>();
        try {
            System.out.println("Nh???p m?? s??? kh??ch h??ng c???n s???a: ");
            customers.add((Customer) listLine);

            int input = Integer.parseInt(scanner.nextLine());
            boolean check = true;

            for (int i = 0; i < customers.size(); i++) {

                if (input == customers.get(i).getId()) {

                    System.out.print("Nh???p m?? s??? kh??ch h??ng: ");
                    int code = Integer.parseInt(scanner.nextLine());

                    System.out.print("Nh???p h??? t??n kh??ch h??ng: ");
                    String name = scanner.nextLine();

                    System.out.print("Nh???p gi???i t??nh kh??ch h??ng: ");
                    String gender = scanner.nextLine();

                    int id = input;

                    System.out.print("Nh???p s??? ??i???n tho???i: ");
                    int phone = Integer.parseInt(scanner.nextLine());

                    System.out.print("Nh???p Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Nh???p ?????a ch??? kh??ch h??ng: ");
                    String address = scanner.nextLine();

                    String type = CustomerGuestType.guestType();

                    customers.get(i).setCode(code);
                    customers.get(i).setAddress(address);
                    customers.get(i).setFullName(name);
                    customers.get(i).setGuestType(type);
                    customers.get(i).setNumberPhone(phone);
                    customers.get(i).setId(id);
                    customers.get(i).setEmail(email);
                    customers.get(i).setGenDer(gender);
                    String str = "";

                    for (Customer item : customers) {
                        String line = item.getInfo();
                        str += line + "\n";
                    }

                    ReadAndWriteFile.writerFile(PATH_CUSTOMER, str);
                    System.err.println("C???p nh???t th??nh c??ng....");
                    check = false;
                }
            }
            if (check) {
                System.err.println("Kh??ng t??m th???y");
            }
        } catch (Exception e) {
            System.err.println("--Sai d???nh d???ng--");
        }
    }
}
