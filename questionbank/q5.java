package questionbank;

import java.util.Scanner;

class product{
     public int id;
     public double price;
     public int quantity;

     product (int id , double price , int quantity) {
            this.id = id;
            this.price = price;
            this.quantity = quantity;
        }
    public  double calculateValue(){
        return this.price *this.quantity;

     }
}

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        double price = sc.nextDouble();
        int quantity = sc.nextInt();
        product p1 = new product(id,price,quantity);
        System.out.printf("%.2f\n",p1.calculateValue());

        sc.close();
    }

    
}
