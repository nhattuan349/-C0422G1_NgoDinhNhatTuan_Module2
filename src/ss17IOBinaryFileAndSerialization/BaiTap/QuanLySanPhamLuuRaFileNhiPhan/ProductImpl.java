package ss17IOBinaryFileAndSerialization.BaiTap.QuanLySanPhamLuuRaFileNhiPhan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductImpl implements Service {
    static Scanner scanner = new Scanner(System.in);
    static List<Product> products = new ArrayList<>();
    @Override
    public void display() {
        products = (List<Product>) ReadAndWriteFile.readFile("src/ss17IOBinaryFileAndSerialization/BaiTap/QuanLySanPhamLuuRaFileNhiPhan/product_file.csv");
        for (Product list : products) {
            System.out.println(list);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập Tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập Nhà Sản Xuất: ");
        String production = scanner.nextLine();
        System.out.println("Nhập Giá: ");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Số Lượng: ");
        int amount = Integer.parseInt(scanner.nextLine());
        Product product = new Product(products.size()+1, name, production, price, amount);
        products.add(product);
        ReadAndWriteFile.writerFile("J:\\CG\\CodegymX\\module2\\src\\ss17IOBinaryFileAndSerialization\\BaiTap\\QuanLySanPhamLuuRaFileNhiPhan\\product_file.csv", products);
        System.out.println("Thêm thành công");
    }

    @Override
    public void search() {
        products = (List<Product>) ReadAndWriteFile.readFile("src/ss17IOBinaryFileAndSerialization/BaiTap/QuanLySanPhamLuuRaFileNhiPhan/product_file.csv");
        System.out.println("Nhập tên để tìm kiếm sản phẩm");
        String input = scanner.nextLine();
        boolean check = true;
        for (Product list : products) {
            if (list.getName().contains(input)) {
                System.out.println(list);
                check = false;
            }
        }
        if (check) {
            System.out.println("Không tìm thấy");
        }
    }
}