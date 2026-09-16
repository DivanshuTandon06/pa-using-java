 package questionbank;

// import java.util.Scanner;

// public class q1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int originalamt = sc.nextInt();
//         double disc = sc.nextDouble();
//         double serv = sc.nextDouble();

//         double discount = originalamt * disc/100;
//         double opd = originalamt - discount;
//         double servicecharge =  opd * serv/100;
//         double finalamt = opd + servicecharge ;
//         System.out.printf("%.2f",finalamt);

//         sc.close();


//     }

    
// }

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs
        int originalAmount = scanner.nextInt();
        double discountPercentage = scanner.nextDouble();
        double serviceChargePercentage = scanner.nextDouble();

        // Calculate discount
        double discount = originalAmount * discountPercentage / 100.0;

        // Calculate amount after discount
        double amountAfterDiscount = originalAmount - discount;

        // Calculate service charge based on amount after discount
        double serviceCharge = amountAfterDiscount * serviceChargePercentage / 100.0;

        // Calculate final amount
        double finalAmount = amountAfterDiscount + serviceCharge;

        // Display formatted to two decimal places
        System.out.printf("%.2f\n", finalAmount);

        scanner.close();
    }
}