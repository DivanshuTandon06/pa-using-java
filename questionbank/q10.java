package questionbank;

import java.util.*;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vector <Integer> v = new Vector<>();
        for(int i = 0;i< n;i++) {
            v.add(sc.nextInt());
        }
        int x = sc.nextInt();
        int z = sc.nextInt();
        int indx = v.indexOf(x);
        v.add(indx+1,z);
        sc.close();
        System.out.println(v);
    }
    
}
