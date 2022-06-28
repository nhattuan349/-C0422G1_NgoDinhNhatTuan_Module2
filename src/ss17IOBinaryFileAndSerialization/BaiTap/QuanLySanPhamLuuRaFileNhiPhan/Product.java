package ss17IOBinaryFileAndSerialization.BaiTap.QuanLySanPhamLuuRaFileNhiPhan;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String production;
    private int price;
    private int amount;

    public Product()  {
    }

    public Product(int id, String name, String production, int price, int amount) {
        this.id = id;
        this.name = name;
        this.production = production;
        this.price = price;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "STT: " + id +
                "---Tên: " + name +
                "---Hãng Sản Xuất: " + production  +
                "---Giá: " + price +
                "---Số lượng: " + amount;
    }
}