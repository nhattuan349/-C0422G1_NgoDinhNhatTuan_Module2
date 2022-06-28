package casestudy2.models;

public class Contract {
    private int numberContract;
    private int codeBookingl;
    private double money;
    private double sumMoney;
    private int customerCode;

    public Contract() {
    }

    public Contract(int numberContract, int codeBookingl, double money, double sumMoney, int customerCode) {
        this.numberContract = numberContract;
        this.codeBookingl = codeBookingl;
        this.money = money;
        this.sumMoney = sumMoney;
        this.customerCode = customerCode;
    }

    public int getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(int numberContract) {
        this.numberContract = numberContract;
    }

    public int getCodeBookingl() {
        return codeBookingl;
    }

    public void setCodeBookingl(int codeBookingl) {
        this.codeBookingl = codeBookingl;
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

    @Override
    public String toString() {
        return "Contract{" +
                "numberContract=" + numberContract +
                ", codeBookingl=" + codeBookingl +
                ", money=" + money +
                ", sumMoney=" + sumMoney +
                ", customerCode=" + customerCode +
                '}';
    }
}
