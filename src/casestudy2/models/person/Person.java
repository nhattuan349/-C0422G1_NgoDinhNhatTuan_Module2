package casestudy2.models.person;

public abstract class Person {
    private String id;
    private String name;
    private String age;
    private int gender;
    private int identityCard;
    private int phoneNumber;
    private String mail;

    public Person() {
    }

    public Person(String id, String name, String age, int gender, int identityCard, int phoneNumber, String mail) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.identityCard = identityCard;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(int identityCard) {
        this.identityCard = identityCard;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public abstract String getInfo();

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", gender=" + gender +
                ", identityCard=" + identityCard +
                ", phoneNumber=" + phoneNumber +
                ", mail='" + mail + '\'' +
                '}';
    }
}