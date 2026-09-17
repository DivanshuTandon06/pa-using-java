package questionbank;
import java.util.*;
public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList <Integer> al = new ArrayList<>();
        for(int i = 0 ; i< n ;i++) {
            al.add(sc.nextInt());
        }
        int x = sc.nextInt();
        for(int i = 0 ; i <n ;i++) {
            al.removeIf(num -> num % x == 0);
        }
        System.out.print(al);
        sc.close();
        
    }
    
}
