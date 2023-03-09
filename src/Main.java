import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Impl impl = new Impl();
        List <Student> students=new ArrayList<>(Arrays.asList(
                new Student("Davran","Joldoshbaev",(byte) 17,Gender.M,200000),
                new Student("Adilet","Ruslanbek",(byte) 22,Gender.M,3000),
                new Student("Sanjar","Abdummomunov",(byte) 19,Gender.M,2000),
                new Student("Adilet","Kurmanov",(byte) 18,Gender.M,20),
                new Student("Ernazar","Asanbekov",(byte) 19,Gender.M,200000),
                new Student("Nuriza","Erkin k",(byte) 17,Gender.F,15000),
                new Student("Nagima","Munduzbekova",(byte) 17,Gender.F,1500),
                new Student("Aicholpon","asdsds",(byte) 12,Gender.F,1000),
                new Student("adsasd","Ecsac",(byte) 14,Gender.F,200000),
                new Student("Nuriza","Erkin k",(byte) 17,Gender.F,3000)
        ));

        while (true){
            System.out.println("""
                    1.Starts A and B
                    2.Age 15 and money 2000
                    3.Max price
                    4.The maximum amount of money for girls
                    5.Student name
                    6.Price +1000
                    7.First student
                    8.How many students
                    9.Group
                    """);
            int num = new Scanner(System.in).nextInt();
            switch (num){
                case 1 -> impl.name_A_B(students);
                case 2 -> impl.ageAndPrice(students);
                case 3 -> impl.maxPrice(students);
                case 4 -> impl.maxPriceFemale(students);
                case 5 -> impl.studentName(students);
                case 6 -> impl.price(students);
                case 7-> impl.firstStudent(students);
                case 8 -> impl.howManyStudents(students);
                case 9 -> impl.genderGroup(students);
            }
        }
    }
}