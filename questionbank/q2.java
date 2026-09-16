package questionbank;
import java.util.*;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        int sum = 0;
        for(int i = 0 ; i<n ;i++ ){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int max = arr[0];
        int min = arr[0];
        for(int i = 1 ; i<n ;i++ ){
            if(max <= arr[i]) max =arr[i];
            if(min >= arr[i]) min =arr[i];

        }
        System.out.println(sum);
        float avg = sum/n;
        System.out.printf("%.2f\n",avg);
        System.out.println((max -min));

        sc.close();
        
    }
    
}
