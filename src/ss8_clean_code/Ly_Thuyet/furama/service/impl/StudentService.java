package ss8_clean_code.Ly_Thuyet.furama.service.impl;


import ss8_clean_code.Ly_Thuyet.furama.model.Student;
import ss8_clean_code.Ly_Thuyet.furama.service.IStudentService;

import java.util.Scanner;

// triển khai các phương thức trong IStudentService
public class StudentService implements IStudentService {
    // tạo danh sách giả lập
    Scanner scanner =new Scanner(System.in);
    private static Student[] studentList = new Student[10];
    static {
        studentList[0]= new Student(1,"Tuan","C0422G1");
        studentList[1]= new Student(2,"Duc","C0322G1");
        studentList[2]= new Student(3,"Hai","C0322G1");
    }
    @Override
    public void searchByName() {
        System.out.println("Nhập tên muốn tìm kiêm");
        String name2 = scanner.nextLine();
        boolean check = true;
        for (Student student : studentList) {
            if(student==null) {
                break;
            }
            if (student.getName().equals(name2)) {
                check = false;
                System.out.println(student);
            }
        }
        if (check) {
            System.out.println("Không tìm thấy tên này");
        }
    }

    @Override
    public void display() {
          // sau nay mình đọc file csv ở đây
          // hiện thị cái list.
        for (Student student: studentList) {
            if (student!=null){
                System.out.println(student);
            }else {
                break;
            }

        }
    }

    @Override
    public void add() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Tên");
        String name = scanner.nextLine();
        System.out.println("Nhập Tên Lớp");
        String className = scanner.nextLine();

        Student student = new Student(id,name,className);
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i]==null){
                studentList[i]=student;
                break;
            };

        }
        System.out.println("Thêm thành công");
    }

    @Override
    public void edit() {
        System.out.println("Nhập tên muốn sửa");
        String name = scanner.nextLine();
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] instanceof Student && studentList[i].getName().equals(name)) {
                System.out.println("Nhập id");
                int id1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập Tên");
                String name1 = scanner.nextLine();
                System.out.println("Nhập Tên Lớp");
                String className1 = scanner.nextLine();

                studentList[i].setId(id1);
                studentList[i].setName(name1);
                studentList[i].setClassName(className1);
                System.out.println("cập nhật thành công");
            }
        }
    }

    @Override
    public void delete() {
        int last = studentList.length-1;
        System.out.println("Nhập tên muốn xóa");
        String name = scanner.nextLine();
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i] instanceof Student && studentList[i].getName().equals(name)) {
                for (int j = i; j < studentList.length -1; j++) {
                    studentList[j] = studentList[j + 1];
                }
                studentList[last] = null;
            }
        }
        System.out.println("xóa thành công");
    }
}
