package abstraction;

class Test implements Interface1,Interface2
{
    public static void main(String[] args) {
        Test t=new Test();
        t.show();
        t.display();
    }
    public void show ()
    {
        System.out.println("abstraction through interface1");
    }
    public void display()
    {
        System.out.println("abstraction through interface2");
    }
}

