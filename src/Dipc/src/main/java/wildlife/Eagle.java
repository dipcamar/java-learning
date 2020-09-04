package wildlife;

public class Eagle extends Animal
{
    void fly ()
    {
        System.out.println("Flies High in Sky");
    }
    public static void main(String[] args) {
        Animal b = new Animal();
        b.eat();
        b.fly();
        Eagle d =new Eagle();
        d.fly();
    }
}
