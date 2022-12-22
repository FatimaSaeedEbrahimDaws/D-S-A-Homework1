import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    static  int num;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("input number element array:");
        num=in.nextInt();

        int a[]=new int[num];
      for (int i=0;i<num;i++){
          System.out.println("input element "+(i+1)+":");
          a[i]=in.nextInt();
      }
        System.out.println("Array before reverse\n"+Arrays.toString(a));
      reverse(a);
        System.out.println("Array after reverse\n"+Arrays.toString(a));
    }



    public static void reverse(int a[]) {
        int x[]=new int[num];
        int s=0;

            for (int i=num-1;i>=0;i--)
            {   x[s]=a[i];
                s++;

            }
            for (int i=0;i<num;i++)
                a[i]=x[i];
        }
}

