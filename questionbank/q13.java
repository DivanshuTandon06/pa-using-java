package questionbank;

import java.util.*;

public class q13 {
    public static void main(String[] args) {
        TreeSet <Integer> set = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i= 0 ; i<n ;i++) {
            set.add(sc.nextInt());
        }
        int e = sc.nextInt();
        System.out.println(set.lower(e));

        
        sc.close();
    }
    
}
