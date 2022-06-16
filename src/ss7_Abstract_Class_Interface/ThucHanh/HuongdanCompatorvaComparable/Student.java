package ss7_Abstract_Class_Interface.ThucHanh.HuongdanCompatorvaComparable;

public class Student implements Comparable<Student> {
    private Integer codeStudent;
    private String nameStudent;
    private Double point;
    private Integer gender;

    public Student() {
    }

    public Student(Integer codeStudent, String nameStudent, Double point, Integer gender) {
        this.codeStudent = codeStudent;
        this.nameStudent = nameStudent;
        this.point = point;
        this.gender = gender;
    }

    public Integer getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(Integer codeStudent) {
        this.codeStudent = codeStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public Double getPoint() {
        return point;
    }

    public void setPoint(Double point) {
        this.point = point;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "codeStudent=" + codeStudent +
                ", nameStudent='" + nameStudent + '\'' +
                ", point=" + point +
                ", gender=" + gender +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(this.point>o.point){
            return -1;
        }else if (this.point<o.point){
            return 1;
        }else {
            return this.getNameStudent().compareTo(o.getNameStudent());
        }
    }
}
