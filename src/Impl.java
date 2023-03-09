import java.util.List;
import java.util.Scanner;

public class Impl implements MyMethod {
    @Override
    public void name_A_B(List<Student> students) {
        for (Student s : students) {
            if (s.getFirstName().startsWith("A") || s.getFirstName().startsWith("B")) {
                System.out.println(s);
            }
        }
    }

    @Override
    public void ageAndPrice(List<Student> students) {
        for (Student s : students) {
            if (s.getAge() >= 15 && s.getPrice() >= 2000) {
                System.out.println(s.toString());
            }
        }
    }

    @Override
    public void maxPrice(List<Student> students) {
        Integer num = students.get(0).getPrice();
        for (int i = 1; i < students.size(); i++) {
            if (students.get(i).getPrice() > num) {
                num = students.get(i).getPrice();
            }
        }
        for (Student s : students) {
            if (num == s.getPrice()) {
                System.out.println("MAX PRICE: " + s);
            }
        }
    }

    @Override
    public void maxPriceFemale(List<Student> students) {
        Integer num = students.get(0).getPrice();
        for (int i = 1; i < students.size(); i++) {
            if (students.get(i).getPrice() > num) {
                num = students.get(i).getPrice();
            }
        }
        for (Student s : students) {
            if (num == s.getPrice()) {
                System.out.println("MAX PRICE: " + s);
            }
        }
    }


    @Override
    public void studentName(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.getFirstName());
        }
    }

    @Override
    public void price(List<Student> students) {
        for (Student s : students) {
            System.out.println(s.getPrice()+1000);
        }
    }

    @Override
    public void firstStudent(List<Student> students) {
        System.out.println(students.get(0));
    }

    @Override
    public void howManyStudents(List<Student> students) {
        System.out.println(students.size());
    }

    @Override
    public void genderGroup(List<Student> students) {
        for (Student s : students) {
            if (s.getGender().equals(Gender.M)) {
                System.out.println(s);
                System.out.println("~~~~~~~FEMALE~~~~~~~~~");
            } else if (s.getGender().equals(Gender.F)) {
                System.out.println(s);
            }
        }
    }
}
