/**
 * Created by David Stovlbaek on 13/10/16.
 */
public class Person {
    public int age;
    public String name;
    public String genderrr;

    public Person(){
        this(null, 0, null);
    }

    public Person(int age) {
        this(null, age, null);
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        if(gender != null) {
                this.gender = gender;
        }
        else
            this.gender = "Male";
    }
}
