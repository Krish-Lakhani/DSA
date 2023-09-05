package oops;

public class Interface
{
    public static void main(String[] args) {
        Queens q1 = new Queens();
        q1.moves();
    }
}

interface chess
{
     void moves();
}

class Queens implements chess
{
    public void moves()
    {
        System.out.println("Up ,Down , Diagonal");
    }
}
class king implements chess
{
    @Override
    public void moves() {
        System.out.println("1 steps all sides");
    }
}
