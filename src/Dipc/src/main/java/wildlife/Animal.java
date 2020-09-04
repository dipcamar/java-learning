package wildlife;

public class Animal
{
    // Inheritance demo

    void run (int x)
    {
        System.out.println("Method overloading");

    }
    void run ()
    {
        System.out.println("i am running");
    }
    void fly ()
    {
        System.out.println("I am flying");
    }
    void  eat ()
    {
        System.out.println("I do eat");
    }

    public static void main(String[] args) {
        Animal a =new Animal();
        a.run(10);

        a.run();
    }
}
