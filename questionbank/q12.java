package questionbank;

import java.util.*;

public class q12 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ; i< n;i++){
            set.add(sc.nextInt());
        }

        if(set.size() > n/2){
            System.out.println("High Unique Registration");
        }
        else{
            System.out.println("low");
        }
        sc.close();
    }
    
}
