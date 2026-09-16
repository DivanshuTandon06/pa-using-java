package questionbank;
import java.util.*;
public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i< n ;i++) {
            arr[i] = sc.nextInt();
        }
        // int [] arr1 = new int[n];
        // int j =0;
        // for(int i = 0 ; i< n ;i++) {
        //  if(arr[i]%2 == 0) arr1[j++] =arr[i] ;  
        // }
        // for(int i = 0 ; i< n ;i++) {
        //  if(arr[i]%2 != 0) arr1[j++] =arr[i] ;  
        // }

        // for(int i = 0 ; i< n ;i++) {
        //  arr[i] =arr1[i] ;  
        // }
        // for(int i = 0 ; i< n ;i++) {
        //  System.out.print(arr[i]+" ") ;  
        // }


        for(int i = 0  ;i < n ;i++) {
            int temp= arr[i];
            if(arr[i] %2 == 0) {
                int j = i;
                while(j> 0 && Math.abs(arr[j-1] %2)==1) {
                    arr[j] = arr[j-1];
                    j--;
                }
                arr[j] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}
