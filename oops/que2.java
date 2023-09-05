package oops;

import java.util.Scanner;

public class que2
{
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.displayAccountDetails(1223,"dsdfsd",10000,5);
        a1.calculateInterest();
    }
}

class Account
{
    int accNum ;
    String cusName;
    int balance;
    float interest;



    public void  displayAccountDetails(int accNum ,String cusName ,int balance , float interest){

        System.out.println("cus name is:-"+ cusName);
        System.out.println("accnum is:-"+ accNum);
        System.out.println("balance is:-"+ balance);
        System.out.println("Interest is:-" + interest);
        this.balance = balance;
        this.interest = interest;
    }

    public void calculateInterest()
    {
        float ans = (interest*balance)/100;

        System.out.print(ans + balance);
    }
}
