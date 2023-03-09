import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Student {
    private String firstName;
    private String lastName;
    private byte age;
    private Gender gender;
    private int price;

    @Override
    public String toString() {
        return "Student = " +
                " firstName : " + firstName +
                " | lastName : " + lastName +
                " | age : " + age +
                " | gender : " + gender +
                " | price : " + price;
    }
}
