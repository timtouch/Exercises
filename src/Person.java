/**
 * Created by timtouch on 12/18/16.
 */
public class Person {
    static enum Gender {M, F};
    private String name;
    private int age;
    private Gender gender;

    public Person(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return ("Name: " + name + ", Age: " + age + ", Gender: " + gender);
    }
}
