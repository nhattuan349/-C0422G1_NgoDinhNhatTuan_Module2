package castudymodul2.services.impl;

import castudymodul2.models.Employee;
import castudymodul2.services.EmployeeService;
import castudymodul2.until.ReadAndWriteFileCsv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceIpl implements EmployeeService {
    final String PATH_EMPLOYEE = "src\\castudymodul2\\data\\employee_file.csv";
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        List<String[]> listLine = ReadAndWriteFileCsv.readFile(PATH_EMPLOYEE);
        List<Employee> employeeList = new ArrayList<>();

        for (String[] item : listLine) {
            int code = Integer.parseInt(item[0]);
            String fullName = item[1];
            String genDer = item[2];
            int id = Integer.parseInt(item[3]);
            int numberPhone = Integer.parseInt(item[4]);
            String email = item[5];
            String level = item[6];
            String location = item[7];
            float salary = Float.parseFloat(item[8]);

            Employee employee = new Employee(code, fullName, genDer, id, numberPhone, email, level, location, salary);
            employeeList.add(employee);
        }
        for (Employee item : employeeList) {
            System.out.println(item);
        }
    }

    @Override
    public void add() {

        List<String[]> listLine = ReadAndWriteFileCsv.readFile(PATH_EMPLOYEE);
        List<Employee> employeeList = new ArrayList<>();

        for (String[] item : listLine) {
            int code = Integer.parseInt(item[0]);
            String fullName = item[1];
            String genDer = item[2];
            int id = Integer.parseInt(item[3]);
            int numberPhone = Integer.parseInt(item[4]);
            String email = item[5];
            String level = item[6];
            String location = item[7];
            float salary = Float.parseFloat(item[8]);

            Employee employee = new Employee(code, fullName, genDer, id, numberPhone, email, level, location, salary);
            employeeList.add(employee);
        }

        try {
            System.out.print("Nhập mã số nhân viên nhân viên: ");
            int code = Integer.parseInt(scanner.nextLine());

            System.out.println("Nhap ho ten nhan vien ");
            String name = scanner.nextLine();

            System.out.print("Nhập giới tính nhân viên: ");
            String gender = scanner.nextLine();

            int id = employeeList.size() + 1;

            System.out.print("Nhập số điện thoại: ");
            int phone = Integer.parseInt(scanner.nextLine());

            String level = level();

            String location = location();

            System.out.print("Nhập Email: ");
            String email = scanner.nextLine();

            System.out.print("Nhập lương nhân viên: ");
            int salary = Integer.parseInt(scanner.nextLine());

            employeeList.add(new Employee(code, name, gender, id, phone, email, level, location, salary));
            String str = "";
            for (Employee employee : employeeList) {
                String line = employee.getInfo();
                str += line + "\n";
            }
            ReadAndWriteFileCsv.writeFile(PATH_EMPLOYEE, str);
            System.out.println("Them thanh cong ");
        } catch (Exception e) {
            System.err.println("--Nhập sai định dạng--");
        }
    }

    @Override
    public void update() {
        List<String[]> listLine = ReadAndWriteFileCsv.readFile(PATH_EMPLOYEE);
        List<Employee> employeeList = new ArrayList<>();
        for (String[] item : listLine) {
            int code = Integer.parseInt(item[0]);
            String fullName = item[1];
            String genDer = item[2];
            int id = Integer.parseInt(item[3]);
            int numberPhone = Integer.parseInt(item[4]);
            String email = item[5];
            String level = item[6];
            String location = item[7];
            float salary = Float.parseFloat(item[8]);

            Employee employee = new Employee(code, fullName, genDer, id, numberPhone, email, level, location, salary);
            employeeList.add(employee);
        }
        try {
            System.out.println("Nhập ID để tìm nhân viên: ");

            int input = Integer.parseInt(scanner.nextLine());
            boolean check = true;

            for (int i = 0; i < employeeList.size(); i++) {

                if (input == employeeList.get(i).getId()) {
                    System.out.print("Nhập mã số nhân viên nhân viên: ");
                    int code = Integer.parseInt(scanner.nextLine());

                    System.out.print("Nhập họ tên nhân viên: ");
                    String name = scanner.nextLine();

                    System.out.print("Nhập giới tính nhân viên: ");
                    String gender = scanner.nextLine();

                    int id = input;

                    System.out.print("Nhập số điện thoại: ");
                    int phone = Integer.parseInt(scanner.nextLine());

                    System.out.print("Nhập Email: ");
                    String email = scanner.nextLine();

                    String level = level();

                    String location = location();

                    System.out.print("Nhập lương nhân viên: ");
                    int salary = Integer.parseInt(scanner.nextLine());

                    employeeList.get(i).setCode(code);
                    employeeList.get(i).setFullName(name);
                    employeeList.get(i).setGenDer(gender);
                    employeeList.get(i).setId(id);
                    employeeList.get(i).setNumberPhone(phone);
                    employeeList.get(i).setEmail(email);
                    employeeList.get(i).setLevel(level);
                    employeeList.get(i).setLocation(location);
                    employeeList.get(i).setSalary(salary);

                    String str = "";
                    for (Employee employee : employeeList) {
                        String line = employee.getInfo();
                        str += line + "\n";
                    }
                    ReadAndWriteFileCsv.writeFile(PATH_EMPLOYEE, str);
                    System.out.println("Cập nhật sản phẩm thành công: ");
                    check = false;
                }
            }
            if (check) {
                System.out.println("Không tìm thấy id:");
            }
        } catch (Exception e) {
            System.out.println("Sai dinh nhap lai..");
        }
    }

    public String level() {
        do {
            System.out.println("Nhập trình độ:\n" +
                    "1.Trung cấp\n" +
                    "2.Cao đẳng\n" +
                    "3.Đại học\n" +
                    "4.Sau đại học\n" +
                    "Nhập để chọn: ");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    return "Trung cấp";
                case "2":
                    return "Cao đẳng";
                case "3":
                    return "Đại học";
                case "4":
                    return "Sau đại học";
                default:
                    System.err.println("CHƯƠNG TRÌNH YÊU CẦU CHỌN TRONG KHOẢN TỪ 1--->4");
            }
        } while (true);
    }

    public String location() {
        do {
            System.out.println("Nhập chức vụ: \n" +
                    "1.Lễ tân\n" +
                    "2.Phục vụ\n" +
                    "3.Chuyên viên\n" +
                    "4.Giám sát\n" +
                    "5.Quản lý\n" +
                    "6.Giám đốc\n" +
                    "Nhập để chọn: ");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    return "Lễ tân";
                case "2":
                    return "Phục vụ";
                case "3":
                    return "Chuyên viên";
                case "4":
                    return "Giám sát";
                case "5":
                    return "Quản lý";
                case "6":
                    return "Giám đốc";
                default:
                    System.err.println("CHƯƠNG TRÌNH YÊU CẦU CHỌN TRONG KHOẢN TỪ 1--->6");
            }
        } while (true);
    }

}
