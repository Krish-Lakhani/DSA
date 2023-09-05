package oops;

public class polymorphism
{
    public static void main(String[] args){
        MathodOverrading m1 = new MathodOverrading();
        System.out.println(m1.sum(12,34));
        System.out.println(m1.sum((float) 12,(float) 34.56));


        overriding2 o2 = new overriding2();
        o2.eat();
    }
}

//overloding..... 1class me 2nofunction ke same name differnt parametar;
class MathodOverrading
{
    int sum(int a, int b)
    {
        return a + b;
    }

    float sum(float a, float b)
    {
        return a + b;
    }

    float sum(int a, float b, int c)
    {
        return a + b + c;
    }
}

// overriding........ 2class 2function ke same name and diffrent value (no pareametear....)

class overriding
{
    void eat()
    {
        System.out.println("Eating.......");
    }
}

class overriding2 extends overriding
{
    void eat()
    {
        System.out.println("lots of Eating...");
    }
}
