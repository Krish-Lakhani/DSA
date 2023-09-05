package oops;

public class Access_Modifier
{
    public static void main(String[] args) {
         studennt s1 = new studennt();
         s1.name = "Krish";
         System.out.println(s1.name);

        s1.per(12 ,13);
        System.out.println(s1.persantage);

        s1.ChangePassword("yiwe");

    }
}

class studennt
{
    public String name = "lakhani";
    protected float persantage;
    int age;
    private String password;

    public void per(int m1 , int m2) {
        persantage =  (m1 + m2) / 2;
    }

    public void ChangePassword(String pwd) {
        password = pwd;
    }
}
