package castudymodul2.services.impl;

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
            System.out.print("Nhập mã số khách hàng: ");
            int code1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Nhập họ tên khách hàng: ");
            String name1 = scanner.nextLine();

            System.out.print("Nhập giới tính khách hàng: ");
            String gender = scanner.nextLine();

            int id1 = customers.size() + 1;

            System.out.print("Nhập số điện thoại: ");
            int phone = Integer.parseInt(scanner.nextLine());

            System.out.print("Nhập Email: ");
            String email1 = scanner.nextLine();

            System.out.print("Nhập địa chỉ khách hàng: ");
            String address1 = scanner.nextLine();

            String type = CustomerGuestType.guestType();

            customers.add(new Customer(code1, name1, gender, id1, phone, email1, type, address1));

            String str = "";
            for (Customer item : customers) {
                String line = item.getInfo();
                str += line + "\n";
            }
            ReadAndWriteFileCsv.writeFile(PATH_CUSTOMER, str);
            System.err.println("Thêm mới thành công");
        } catch (Exception E) {
            System.err.println("--Lỗi định dạng--");
        }
    }


    @Override
    public void update() {
        List<String[]> listLine = ReadAndWriteFileCsv.readFile(PATH_CUSTOMER);
        List<Customer> customers = new LinkedList<>();
        try {
            System.out.println("Nhập mã số khách hàng cần sửa: ");
            customers.add((Customer) listLine);

            int input = Integer.parseInt(scanner.nextLine());
            boolean check = true;

            for (int i = 0; i < customers.size(); i++) {

                if (input == customers.get(i).getId()) {

                    System.out.print("Nhập mã số khách hàng: ");
                    int code = Integer.parseInt(scanner.nextLine());

                    System.out.print("Nhập họ tên khách hàng: ");
                    String name = scanner.nextLine();

                    System.out.print("Nhập giới tính khách hàng: ");
                    String gender = scanner.nextLine();

                    int id = input;

                    System.out.print("Nhập số điện thoại: ");
                    int phone = Integer.parseInt(scanner.nextLine());

                    System.out.print("Nhập Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Nhập địa chỉ khách hàng: ");
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
                    System.err.println("Cập nhật thành công....");
                    check = false;
                }
            }
            if (check) {
                System.err.println("Không tìm thấy");
            }
        } catch (Exception e) {
            System.err.println("--Sai dịnh dạng--");
        }
    }
}
