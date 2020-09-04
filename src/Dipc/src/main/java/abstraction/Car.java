package abstraction;

class Car extends Vehicle
{
    public static void main(String[] args) {
        Car c =new Car();
        c.start();
        c.wheels();
    }
    void start ()
    {
        System.out.println("Starts with key");
    }
    void wheels()
    {
        System.out.println("It has four Wheels");
    }
}
