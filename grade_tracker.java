/*public class student {
    public static void main(String[] args) {

    }
}*/
import java.util.*;
public class grade_tracker {
    public static void main(String[] args){
        int s=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the total number of students");
        int n=sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter marks of students");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int min=arr[0];
        int max=arr[0];

        for(int i=0;i<n;i++)
        {
            s=s+arr[i];
            if (arr[i]<min) {
                min = arr[i];
            }
            if(arr[i]>max)
            {
                max=arr[i];

            }
        }
        int avg=s/n;
        System.out.println("The average is " + avg);
        System.out.println("The maximum marks obtained is " + max);
        System.out.println("The minimum marks obtained is " +min);

    }
}