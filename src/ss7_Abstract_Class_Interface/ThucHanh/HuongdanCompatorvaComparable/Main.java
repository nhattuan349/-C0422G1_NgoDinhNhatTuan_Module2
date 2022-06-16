package ss7_Abstract_Class_Interface.ThucHanh.HuongdanCompatorvaComparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] =new Student(1,"HaiTT",9d,1);
        students[1] =new Student(2,"TrungDP",10d,1);
        students[2] =new Student(3,"CongNT",8d,1);
        students[3] =new Student(4,"TienNVT",9.5,1);

        System.out.println("Sắp xếp theo điểm(comparable): ");
        Arrays.sort(students);
        for (Student student:students) {
            System.out.println(student);
        }

        System.out.println("Sắp xếp theo điểm(comparator): ");
        Arrays.sort(students, new NameStudentComparator());
        for (Student student:students) {
            System.out.println(student);
        }
    }
}
