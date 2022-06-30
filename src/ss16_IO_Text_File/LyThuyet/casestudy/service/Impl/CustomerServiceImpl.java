package ss16_IO_Text_File.LyThuyet.casestudy.service.Impl;

import casestudy.models.preson.Customer;
import casestudy.service.CustomerService;
import casestudy.utils.ReadAndWrite;
import casestudy.utils.RegexData;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    private Scanner scanner = new Scanner(System.in);
    private static final String REGEX_BIRTHDAY = "/^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|" +
            "(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|" +
            "^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])" +
            "|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|" +
            "(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$/";

    @Override
    public void display() {
        readFile();
        for (Customer item : customerList) {
            System.out.println(item);
        }
    }

    public String getCustomerType() {
        do {
            System.out.println("Chọn loại khách hàng");
            System.out.println("1.Diamond");
            System.out.println("2.Platinium");
            System.out.println("3.Gold");
            System.out.println("4.Silver");
            System.out.println("5.Member");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    return "Diamond";
                case 2:
                    return "Platinium";
                case 3:
                    return "Gold";
                case 4:
                    return "Silver";
                case 5:
                    return "Member";
                default:
                    System.out.println("Bạn chọn lại nha!! Sai rồi");
                    getCustomerType();
            }
        } while (true);
    }

    public int getGender() {
        do {
            System.out.println("Chọn giới tính:");
            System.out.println("1. Nam");
            System.out.println("2. Nữ");
            System.out.println("3.Giới tính thứ 3");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                default:
                    System.out.println("Không có giới tính này!!");
                    getGender();
            }
        } while (true);
    }

    @Override
    public void addNew() {
        System.out.println("Nhập id: ");
        String id = scanner.nextLine();

        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();

        System.out.println("Nhập tuổi: ");
        String age = RegexData.regexAge(scanner.nextLine(), REGEX_BIRTHDAY);

        int gender = getGender();

        System.out.println("Nhập CMND: ");
        int identityCard = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập SĐT: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập mail: ");
        String mail = scanner.nextLine();

        String customerType = getCustomerType();

        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();

        Customer customer = new Customer(id, name, age, gender, identityCard, phoneNumber, mail, customerType, address);
        customerList.add(customer);
        writeFile();
        System.out.println("Đã thêm mới thành công");
    }

    @Override
    public void edit() {
        readFile();
        System.out.println("Nhập vị trí mình muốn sửa: ");
        String inputId = scanner.nextLine();
        for (Customer customer : customerList) {
            if (customer.getId().equals(inputId)) {
                System.out.println("Nhập tên: ");
                String name = scanner.nextLine();
                customer.setName(name);

                System.out.println("Nhập tuổi: ");
                String age = scanner.nextLine();
                customer.setAge(age);

                System.out.println("Nhập giới tính: ");
                int gender = getGender();
                customer.setGender(gender);

                System.out.println("Nhập CMND: ");
                int identityCard = Integer.parseInt(scanner.nextLine());
                customer.setIdentityCard(identityCard);

                System.out.println("Nhập SĐT: ");
                int phoneNumber = Integer.parseInt(scanner.nextLine());
                customer.setPhoneNumber(phoneNumber);

                System.out.println("Nhập mail: ");
                String mail = scanner.nextLine();
                customer.setMail(mail);

                String customerType = getCustomerType();
                customer.setCustomerType(customerType);

                System.out.println("Nhập địa chỉ");
                String address = scanner.nextLine();
                customer.setAddress(address);

                System.out.println(customerList);
            }
        }
        writeFile();
    }

    public void readFile() {
        List<String[]> listStr = ReadAndWrite.readFile("src\\casestudy\\data\\customer.csv");
        customerList.clear();
        for (String[] item : listStr) {
            if (item.length != 1) {
                Customer customer = new Customer(item[0], item[1], item[2], Integer.parseInt(item[3]),
                        Integer.parseInt(item[4]), Integer.parseInt(item[5]), item[6], item[7], item[8]);
                customerList.add(customer);
            }
        }
    }

    public void writeFile() {
        ReadAndWrite.delete("src\\casestudy\\data\\customer.csv");
        for (Customer customer : customerList) {
            String line = customer.getInfo();
            ReadAndWrite.writeFile("src\\casestudy\\data\\customer.csv", line);
        }
    }
}
