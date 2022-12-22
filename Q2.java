import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

    static  int num;
     static  int x[];
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("input number element array:");
        num=in.nextInt();
        x=new int[num];
        int a[]=new int[num];
        for (int i=0;i<num;i++){
            System.out.println("input element "+(i+1)+":");
            a[i]=in.nextInt();
        }
        System.out.println(" Original array \n"+ Arrays.toString(a));
        backup(a);
        System.out.println(" Backup array \n"+Arrays.toString(x));
    }



    public static void backup(int a[]) {


        for (int i=0;i<num;i++)
            x[i]=a[i];
    }}
