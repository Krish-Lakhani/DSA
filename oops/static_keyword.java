package oops;

public class static_keyword
{
    public static void main(String[] args) {

        bank b1 = new bank();
        b1.interst = 4.5;

        bank b2 = new bank();
        b2.interst = 3.3;

        System.out.println(b1.interst);
    }
}

class bank
{
    int acno;
    String name;

    static double interst;


}
