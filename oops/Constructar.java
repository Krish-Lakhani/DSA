package oops;

public class Constructar
{
    public static void main(String[] args) {

        students s = new students();      // auto call  //error - construct overloding....

        students s1 = new students("krish" , 19);
        System.out.println(s1.name);
        System.out.println(s1.roll);

        students s2 = new students(s1);
        s1.roll = 20;
        System.out.println(s2.name);
        System.out.println(s2.roll);
    }
}

class students {
    String name;
    int roll;


    //non-perameterize con..
    students()
    {
        System.out.println("Hello...");
    }

    //perameterize con...
    students(String name , int roll)
    {
        this.name = name;
        this.roll = roll;
    }

    //copy con..
    students(students s1)
    {
        this.name = s1.name;
        this.roll = s1.roll;
     }
}
