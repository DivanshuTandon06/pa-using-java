package questionbank;
import java.util.*;
public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList <Integer> list = new LinkedList<>();
        for(int i = 0 ; i< n ;i++){
            list.add(sc.nextInt());
        }
        int x = sc.nextInt();
        if(list.contains(x)) {
            list.remove(list.indexOf(x));
        }
        System.out.println(list);
        sc.close();

    }
    
}
