package ss12_Java_Collection_FrameWork_Map.BaiTap.Su_dung_ArrayList_LinkedList_trongCollectionFW;

import java.util.Scanner;

public class ControllerProduct {
    public static void main(String[] args) {
        Main main = new Main();
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("------Menu-----\n" +
                    "1. Thêm sản phẩm \n" +
                    "2. Sửa sản phẩm theo id \n" +
                    "3. Xóa sản phẩm theo id \n" +
                    "4. Hiển thị danh sách sản phẩm \n" +
                    "5. Tìm kiếm sản phẩm theo tên \n" +
                    "6. Sắp xếp sản phẩm giảm dần theo giá \n" +
                    "6. Sắp xếp sản phẩm tăng dần theo giá\n" +
                    "0. Exit \n");
            System.out.println("Xin mời chọn chức năng: ");
            int input = Integer.parseInt(scanner.nextLine());
            switch (input) {
                case 1:
                    System.out.println("Thêm sản phẩm: ");
                    main.add();
                    break;
                case 2:
                    System.out.println("Sửa sản phẩm: ");
                    main.update();
                    break;
                case 3:
                    System.out.println("Xóa sản phẩm:");
                    main.delete();
                    break;
                case 4:
                    System.out.println("Hiển thị danh sách sản phẩm ");
                    main.display();
                    break;
                case 5:
                    System.out.println("Tìm kiếm sản phẩm theo tên");
                    main.search();
                    break;
                case 6:
                    System.out.println("Sắp xếp sản phẩm Tăng dần");
                    main.sortLow();
                    break;
                case 7:
                    System.out.println("Sắp xếp sản phẩm Tăng dần");
                    main.sortUp();
                    break;
                case 0:
                    System.out.println("Thoát chương trình: ");
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
