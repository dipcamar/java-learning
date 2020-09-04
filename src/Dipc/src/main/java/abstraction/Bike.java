package abstraction;

public class Bike extends Vehicle
{    void start ()
{
    System.out.println("Starts with kick");
}
    void wheels()
    {
        System.out.println("It has two Wheels");
    }

    public static void main(String[] args) {
        Bike b=new Bike();
        b.start();
        b.wheels();
    }
}
