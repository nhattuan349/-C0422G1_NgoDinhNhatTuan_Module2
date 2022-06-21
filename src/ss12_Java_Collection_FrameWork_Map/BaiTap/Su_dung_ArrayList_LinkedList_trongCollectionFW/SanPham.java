package ss12_Java_Collection_FrameWork_Map.BaiTap.Su_dung_ArrayList_LinkedList_trongCollectionFW;

import java.util.Comparator;

public class SanPham implements Comparator<SanPham> {
    private int id = 0;
    private String name;
    private int price;
    private int amount;
    private String production;

    public SanPham() {
    }

    public SanPham(int id, String name, int price, int amount, String production) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.production = production;
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

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", production='" + production + '\'' +
                '}';
    }

    @Override
    public int compare(SanPham o1, SanPham o2) {
        return 0;
    }
}
