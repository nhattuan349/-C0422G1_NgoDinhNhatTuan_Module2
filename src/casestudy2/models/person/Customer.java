package casestudy2.models.person;

public class Customer extends Person{
    private String customerType;
    private String address;

    public Customer() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s",
                super.getId(),
                super.getName(),
                super.getAge(),
                super.getName(),
                super.getGender(),
                super.getIdentityCard(),
                super.getMail(),
                this.getCustomerType(),
                this.getAddress());
    }

    public Customer(String customerType, String address) {
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
