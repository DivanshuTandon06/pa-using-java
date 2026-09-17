package questionbank;
import java.util.*;

public class q8 {
    public static char grade (int i) {
        char grades ='F'; 
        if(i>=90) grades ='A';
        if(i>=75 && i <= 89) grades ='B';
        if(i>=60 && i <= 74) grades ='C';
        if(i>=40 && i <= 59) grades ='D';
        return grades; 


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i< n ;i++) {
            arr[i] = sc.nextInt();
        }
        for(int i= 0; i<n ;i++){
            System.out.print(grade(arr[i]));
            if(n-i-1 != 0) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}
