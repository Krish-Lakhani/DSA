package oops;

public class Interface2
{
    public static void main(String[] args) {
        crocodile l1 = new crocodile();
        l1.walk();
        l1.swim();
    }
}

interface lions{
     void walk();
}

interface fish{
     void swim();
}

class crocodile implements lions,fish
{
    public void walk()
    {
        System.out.println("eating..");
    }

    public void swim()
    {
        System.out.println("Swmimg..");
    }
}
