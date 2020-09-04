package javaclass;

public class ArrayDemo
{
    public static void main(String[] args) {
        //single dimensional array.
        int[] num={10,20,30};
        for (int i=0;i<num.length;i++)
        {
            System.out.print(num[i]+" ");
        }
        System.out.println();
        System.out.println(num.length);

        //Multi-Dimensional Array 2D
        int[][]num2={{40,50},{10,20,30}};
        for (int i=0;i<num2.length;i++)
        {
            for (int j=0;j<num2[i].length;j++)
            {
                System.out.print(num2[i][j]+" ");
            }
        }

        System.out.println(num2[0].length);
        System.out.println(num2[1].length);
        //Multi-Dimesional Array 3D
        int[][][] num3={{{10,20,30},{40,50},{60,70,80}}};
        System.out.println(num3[0][0][2]);



    }
}
