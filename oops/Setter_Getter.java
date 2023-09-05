package oops;

public class Setter_Getter
{
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setAge(19);
        System.out.println(s1.getAge());

        s1.setName("Krish");
        System.out.println(s1.getName());
    }
}

class Student
{
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}