package ss16_IO_Text_File.LyThuyet.casestudy.models.preson;

import casestudy.models.preson.Person;

import java.util.Date;

public class Customer extends Person {
    private String customerType;
    private String address;

    public Customer() {
    }

    @Override
        public String getInfo() {
            return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s"
                    , super.getId()
                    , super.getName()
                    , super.getAge()
                    , super.getGender()
                    , super.getIdentityCard()
                    , super.getPhoneNumber()
                    , super.getMail()
                    , this.getCustomerType()
                    , this.getAddress());
        }


    public Customer(String id, String name, String age, int gender, int identityCard, int phoneNumber, String mail, String customerType, String address) {
        super(id, name, age, gender, identityCard, phoneNumber, mail);
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
                super.toString() +
                "customerCode=" +
                "," + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

