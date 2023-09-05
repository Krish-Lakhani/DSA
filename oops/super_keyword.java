package oops;

public class super_keyword
{
    public static void main(String[] args) {

        lasan l1 = new lasan();
        System.out.println(l1.color);
    }
}

class kanda
{
    String color = "red";
}

class lasan extends kanda
{
    lasan(){
        super.color = "White";
    }

}
