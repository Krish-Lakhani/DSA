package oops;
import java.util.*;

public class que4
{
    public static void main(String[] args) {

        stu[] s1 = new stu[5];
        s1[1] = new stu(121,"sdc",23,45,56);
        s1[2] = new stu(122,"krish",34,56,56);
        s1[3] = new stu(123,"sahil",67,67,76);
        s1[4] = new stu(124,"ck",78,45,90);
        s1[5] = new stu(125,"yash",89,76,89);

        stu.gettop3student(s1);

    }
}

class stu
{
    private int rollno;
    private String name;
    private int marks1;
    private int marks2;
    private int marks3;
    private double per;

     stu(int rollno, String name, int marks1, int marks2, int marks3) {
        this.rollno = rollno;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.per = (marks1 + marks2 + marks3)/3;
    }

    static void gettop3student(stu[] s1)
    {
        for (int i = 0; i < s1.length-1; i++)
        {
            for (int j = 0; j < s1.length-i-1; j++)
            {
                if(s1[j].per < s1[j+1].per)
                {
                    stu temp = s1[j];
                    s1[j] = s1[j+1];
                    s1[j+1] = temp;
                }
            }
        }
        stu max1 = s1[1];
        stu max2 = s1[2];
        stu max3 = s1[3];

        System.out.println(max1.per);
        System.out.println(max2.per);
        System.out.println(max3.per);
    }
}
