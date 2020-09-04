package javaclass;

public class ConstructorDemo
{
    String name,school;
    ConstructorDemo()
    {
    }

    public static void main(String[] args) {
        ConstructorDemo test =new ConstructorDemo();
        test.name="pihu";
        test.school="ananya vidyalay";
System.out.println("Student "+test.name+" is in "+test.school);
    }
}
