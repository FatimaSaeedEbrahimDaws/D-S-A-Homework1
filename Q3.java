import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q3 {

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
            System.out.println(" Array \n"+ Arrays.toString(a));
            removeElements(a);


    }

    public static void removeElements(int a[]) {
        Random r=new Random();
        while(a.length>0){
            int index=r.nextInt(a.length);
          //  System.out.println(index);
            System.out.println("INDEX="+index+", ELEMENT="+a[index]);
            int a1[]=new int[a.length-1];
            for (int i=0; i<index;i++)
            {a1[i]=a[i];}

            for (int i=index;i<a.length-1;i++)
            a1[i]=a[i+1];
           a=a1;

    }
}}
