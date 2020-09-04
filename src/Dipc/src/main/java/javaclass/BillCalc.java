package javaclass;
import java.util.*;
public class BillCalc
{

    public static void main(String[] args) {
        double  c1, d1,l1, b1,result;
        double num0,num1, num2, num3,num4,num5;
        double  sum0=0,sum1=0,sum2=0,sum3=0,sum4=0,sum5=0;
        Scanner BillCalc = new Scanner(System.in);
        do {
            System.out.print("Enter Pardi  Lentgh: ");
            l1 = BillCalc.nextDouble();
            System.out.print("Enter Pardi Breadth: ");
            b1 = BillCalc.nextDouble();
            System.out.println("Pardi in SqFt " + area(l1, b1));
            System.out.println("Any pardi");
            result = BillCalc.nextDouble();
        } while (result!=0.0);
        do {
            System.out.print("Enter details of pardi: ");
            num0 = BillCalc.nextDouble();
            sum0 += num0;
        } while (num0 != 0.0);
        System.out.println("Total pardi " + sum0);
        {
            System.out.print("Rate for Pardi: ");
            c1 = BillCalc.nextDouble();
            d1 = BillCalc.nextDouble();
            System.out.println("Bill for Pardi= " + rate(c1, d1));
        }
        do {
            System.out.print("Enter Footing Lentgh: ");
            l1 = BillCalc.nextDouble();
            System.out.print("Enter Footing Breadth: ");
            b1 = BillCalc.nextDouble();
            System.out.println("Footing in SqFt " + area(l1, b1));
            System.out.println("Any Footing");
            result = BillCalc.nextDouble();
        } while (result!=0.0);
        do {
            System.out.print("Enter details of Footing : ");
            num1 = BillCalc.nextDouble();
            sum1 += num1;
        } while (num1 != 0.0);
        System.out.println("Total Footing " + sum1);
        {
            System.out.print("Rate for Footing : ");
            c1 = BillCalc.nextDouble();
            d1 = BillCalc.nextDouble();
            System.out.println("Bill for Footing = " + rate(c1, d1));
        }
        do
        {
            System.out.print("Enter T.Beam Lentgh: ");
            l1 = BillCalc.nextDouble();
            System.out.print("Enter T.Beam Breadth: ");
            b1 = BillCalc.nextDouble();
            System.out.println("T.Beam in SqFt " + area(l1, b1));
            System.out.println("Any T.Beam");
            result = BillCalc.nextDouble();
        } while (result!=0.0);
        do {
            System.out.print("Enter details of T.Beam: ");
            num2 = BillCalc.nextDouble();
            sum2 += num2;
        } while (num2 != 0.0);
        System.out.println("Total T.Beam " + sum2);
        {
            System.out.print("Rate for T.Beam: ");
            c1 = BillCalc.nextDouble();
            d1 = BillCalc.nextDouble();
            System.out.println("Bill for T.Beam= " + rate(c1, d1));
        }
        do {
            System.out.print("Enter P.C.C Lentgh: ");
            l1 = BillCalc.nextDouble();
            System.out.print("Enter P.C.C Breadth: ");
            b1 = BillCalc.nextDouble();
            System.out.println("P.C.C in SqFt " + area(l1, b1));
            System.out.println("Any P.C.C");
            result = BillCalc.nextDouble();
        } while (result!=0.0);
        do {
            System.out.print("Enter details of P.C.C: ");
            num3 = BillCalc.nextDouble();
            sum3 += num3;
        } while (num3 != 0.0);
        System.out.println("Total P.C.C " + sum3);
        {
            System.out.print("Rate for P.C.C: ");
            c1 = BillCalc.nextDouble();
            d1 = BillCalc.nextDouble();
            System.out.println("Bill for P.C.C= " + rate(c1, d1));
        }
        do
        {
            System.out.print("Enter Slab Lentgh: ");
            l1 = BillCalc.nextDouble();
            System.out.print("Enter Slab Breadth: ");
            b1 = BillCalc.nextDouble();
            System.out.println("Slab in SqFt " + area(l1, b1));
            System.out.println("Any Slab");
            result = BillCalc.nextDouble();
        } while (result!=0.0);
        do {
            System.out.print("Enter details of Slab: ");
            num4 = BillCalc.nextDouble();
            sum4 += num4;
        }
        while (num4 != 0.0);
        System.out.println("Total Slab " + sum4);
        {
            System.out.print("Enter Rate for Slab: ");
            c1 = BillCalc.nextDouble();
            d1 = BillCalc.nextDouble();
            System.out.println("Bill for Slab= " + rate(c1, d1));
        }
        do
        {
            System.out.print("Enter Quantity for Bill Total : ");
            num5 = BillCalc.nextDouble();
            sum5 += num5;
        } while (num5 != 0.0);
        System.out.println("Total Rupees= " + sum5);
    }
    public static double area(double num1, double num2)
    {
        double total = (num1 * num2);
        return total;
    }
    public static double rate(double num3, double num4)
    {
        double price= (num3 * num4);
        return price;
    }

}
