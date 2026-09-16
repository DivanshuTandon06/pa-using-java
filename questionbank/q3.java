package questionbank;
import java.util.*;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int integer = sc.nextInt();
        int even = 0;
        int odd = 0;
        while(integer!=0) {
            int a = integer%10;
            if(a%2==0){
                even+=a;
            }
            else {
                odd+=a;
            }
            integer=integer/10;
        }
        System.out.println(even);
        System.out.println(odd);
        sc.close();
    }
}
