package ss8_clean_code.Ly_Thuyet.furama.controller;



import ss8_clean_code.Ly_Thuyet.furama.service.IStudentService;
import ss8_clean_code.Ly_Thuyet.furama.service.impl.StudentService;

import java.util.Scanner;

public class MainController {
    private static IStudentService studentService = new StudentService();
    // điểu khiển luồng thực thi
    public static void displayMainMenu(){

        boolean flag =true;
        do {
            System.out.println("Chức năng của hệ thống " +
                    "\n 1.Display" +
                    "\n 2. Add" +
                    "\n 3.Delete" +
                    "\n 4. Edit" +
                    "\n 5. Search" +
                    "\n 6. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    // code display
                    System.out.println("chức năng hiện thị");
                    studentService.display();
                    break;
                case 2:
                    // code thêm mới
                    System.out.println("Chức năng thêm ới");
                    studentService.add();
                    break;
                case 3:
                    // code xóa
                    System.out.println("chức năng xóa");
                    studentService.delete();
                    break;
                case 4:
                    // code sửa
                    System.out.println("chức năng sửa");
                    studentService.edit();
                    break;
                case 5:
                    // code tìm kiếm
                    System.out.println("chức năng tìm kiếm");
                    studentService.searchByName();
                    break;
                default:
                    flag=false;
            }
        }while (flag);
    }
}
