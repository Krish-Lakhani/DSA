package oops;

public class abstraction
{
    public static void main(String[] args) {

      // Anilmals a1 = new Anilmals();    //absteact class - object not allowd;

        lion l1 = new lion();
        l1.eat();
        l1.walk();

        Humans h1 = new Humans();
        h1.eat();
        h1.walk();
    }
}

abstract class Anilmals
{
    Anilmals()     //parants class construct first call and than child class;
    {
        System.out.println("animal class construct call");
    }
    void eat()
    {
        System.out.println("Eating.....");
    }

    abstract void walk();
}

class lion extends Anilmals
{
    lion()
    {
        System.out.println("Lion class con. call..");
    }
    void walk() {
        System.out.println("Walking 4 lags....");
    }
}

class Humans extends Anilmals
{
    @Override
    void walk() {
        System.out.println("walking 2 lags");
    }
}
