package oops;

import java.util.Scanner;

public class que3
{
    public static void main(String[] args) {

        accountt a = new accountt();
        a.setAccountDetailss();
        a.withdraw();
        a.deposit();
        a.dispAccountDetailss();
    }
}

class accountt
{
    int acNo;
    String cName;
    int acBalance;
    Scanner sc = new Scanner(System.in);


    public void setAccountDetailss()
    {

        System.out.print("Enter acno:-");
        acNo = sc.nextInt();
        System.out.print("Enter cname:-");
        cName = sc.next();
        System.out.print("Enter acbalance:-");
        acBalance = sc.nextInt();

    }

    public int withdraw()
    {
        int withdeaw;
        System.out.print("Enter withdrew amount:-");
        withdeaw = sc.nextInt();
        if(withdeaw > acBalance) {System.out.println("Insufficent balance");}
        acBalance -= withdeaw;
        return  acBalance;
    }

    public int deposit()
    {
        int deposit;
        System.out.print("Enter deposit amount:-");
        deposit = sc.nextInt();
        if(deposit > 0){
        acBalance += deposit;}
        return  acBalance;
    }

    public void dispAccountDetailss()
    {
        System.out.println("Custumer accno is:-" + acNo);
        System.out.println("Custumer cname is:-" + cName);
        System.out.println("Custumer acBalance is:-" + acBalance);
    }
}
