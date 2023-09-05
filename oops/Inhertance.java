package oops;

public class Inhertance
{
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.eat();

        dog d1 = new dog();
        d1.eat();
        d1.leg = 4;
        System.out.println(d1.leg);

        Bird b1 = new Bird();
        b1.fly();
    }
}

class Animal{
     String color;

     void eat()
     {
         System.out.println("Eating....");
     }
}
//singal leval...............
class Fish extends Animal{
    int wing;

    void swim()
    {
        System.out.println("Swmming....");
    }
}

//multipal leval..........

class dog extends Animal{
    int leg;
}

class jerman extends dog
{
    int weight;
}

//hirarchical leval.....

class Bird extends Animal
{
    void fly()
    {
        System.out.println("Fly....");
    }
}

//hybrid ...........
// Multipal + Hirarchical...

class Egual extends Bird
{
    void Strngth()
    {
        System.out.println("Veray..Fast");
    }
}