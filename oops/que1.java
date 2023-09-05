package oops;

import java.util.Scanner;

public class que1
{
    public static void main(String[] args) {

        studentt s1 = new studentt();
        s1.studentDetails();
        s1.calculateTotal();
        s1.displayStudDetails();
    }

}

class studentt
{
    int rollno;
    String name;
    int[] marks = new int[3];
    int total;

    public void studentDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll:-");
        rollno = sc.nextInt();
        System.out.print("Enter name:-" );
        name = sc.next();


            for (int i = 0; i < marks.length; i++) {
                System.out.print("marks of sub"+i);
                marks[i] = sc.nextInt();
        }
    }

    public void calculateTotal(){
        for (int i = 0; i < marks.length; i++)
        {
            total += marks[i];
        }
    }

    public void displayStudDetails()
    {
        System.out.println("student rollno:-" + rollno);
        System.out.println("student name:-" + name);
        System.out.println("total:-" + total);
    }


}
