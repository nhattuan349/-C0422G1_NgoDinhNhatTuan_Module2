package ss16_IO_Text_File.LyThuyet.casestudy.models;

import casestudy.models.Booking;
import casestudy.models.preson.Customer;

public class Contract {
    private int numberContract;
    private int codeBooking;
    private double money;
    private double sumMoney;
    private int customerCode;

    public Contract(int numberContract, int codeBooking, double money, double sumMoney, int customerCode) {
        this.numberContract = numberContract;
        this.codeBooking = codeBooking;
        this.money = money;
        this.sumMoney = sumMoney;
        this.customerCode = customerCode;
    }

    public Contract(String id, Booking booking, String pre, String pay, Customer customer) {
    }

    public int getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(int numberContract) {
        this.numberContract = numberContract;
    }

    public int getCodeBooking() {
        return codeBooking;
    }

    public void setCodeBooking(int codeBooking) {
        this.codeBooking = codeBooking;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(double sumMoney) {
        this.sumMoney = sumMoney;
    }

    public int getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(int customerCode) {
        this.customerCode = customerCode;
    }
}
