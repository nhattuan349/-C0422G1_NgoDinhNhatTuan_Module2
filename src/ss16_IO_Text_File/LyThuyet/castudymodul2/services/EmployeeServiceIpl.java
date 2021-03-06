package ss16_IO_Text_File.LyThuyet.castudymodul2.services;

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
            System.out.print("Nh???p m?? s??? nh??n vi??n nh??n vi??n: ");
            int code = Integer.parseInt(scanner.nextLine());

            System.out.println("Nhap ho ten nhan vien ");
            String name = scanner.nextLine();

            System.out.print("Nh???p gi???i t??nh nh??n vi??n: ");
            String gender = scanner.nextLine();

            int id = employeeList.size() + 1;

            System.out.print("Nh???p s??? ??i???n tho???i: ");
            int phone = Integer.parseInt(scanner.nextLine());

            String level = level();

            String location = location();

            System.out.print("Nh???p Email: ");
            String email = scanner.nextLine();

            System.out.print("Nh???p l????ng nh??n vi??n: ");
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
            System.err.println("--Nh???p sai ?????nh d???ng--");
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
            System.out.println("Nh???p ID ????? t??m nh??n vi??n: ");

            int input = Integer.parseInt(scanner.nextLine());
            boolean check = true;

            for (int i = 0; i < employeeList.size(); i++) {

                if (input == employeeList.get(i).getId()) {
                    System.out.print("Nh???p m?? s??? nh??n vi??n nh??n vi??n: ");
                    int code = Integer.parseInt(scanner.nextLine());

                    System.out.print("Nh???p h??? t??n nh??n vi??n: ");
                    String name = scanner.nextLine();

                    System.out.print("Nh???p gi???i t??nh nh??n vi??n: ");
                    String gender = scanner.nextLine();

                    int id = input;

                    System.out.print("Nh???p s??? ??i???n tho???i: ");
                    int phone = Integer.parseInt(scanner.nextLine());

                    System.out.print("Nh???p Email: ");
                    String email = scanner.nextLine();

                    String level = level();

                    String location = location();

                    System.out.print("Nh???p l????ng nh??n vi??n: ");
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
                    System.out.println("C???p nh???t s???n ph???m th??nh c??ng: ");
                    check = false;
                }
            }
            if (check) {
                System.out.println("Kh??ng t??m th???y id:");
            }
        } catch (Exception e) {
            System.out.println("Sai dinh nhap lai..");
        }
    }

    public String level() {
        do {
            System.out.println("Nh???p tr??nh ?????:\n" +
                    "1.Trung c???p\n" +
                    "2.Cao ?????ng\n" +
                    "3.?????i h???c\n" +
                    "4.Sau ?????i h???c\n" +
                    "Nh???p ????? ch???n: ");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    return "Trung c???p";
                case "2":
                    return "Cao ?????ng";
                case "3":
                    return "?????i h???c";
                case "4":
                    return "Sau ?????i h???c";
                default:
                    System.err.println("CH????NG TR??NH Y??U C???U CH???N TRONG KHO???N T??? 1--->4");
            }
        } while (true);
    }

    public String location() {
        do {
            System.out.println("Nh???p ch???c v???: \n" +
                    "1.L??? t??n\n" +
                    "2.Ph???c v???\n" +
                    "3.Chuy??n vi??n\n" +
                    "4.Gi??m s??t\n" +
                    "5.Qu???n l??\n" +
                    "6.Gi??m ?????c\n" +
                    "Nh???p ????? ch???n: ");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    return "L??? t??n";
                case "2":
                    return "Ph???c v???";
                case "3":
                    return "Chuy??n vi??n";
                case "4":
                    return "Gi??m s??t";
                case "5":
                    return "Qu???n l??";
                case "6":
                    return "Gi??m ?????c";
                default:
                    System.err.println("CH????NG TR??NH Y??U C???U CH???N TRONG KHO???N T??? 1--->6");
            }
        } while (true);
    }

}
