
import java.util.Scanner;

public class Commission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sale amount : ");
        double sale = sc.nextDouble();

        double rate;

        if (sale <= 10000) {
            rate = 0;
        } else if (sale <= 20000) {
            rate = 1.5;
        } else if (sale <= 40000) {
            rate = 2.75;
        } else if (sale <= 60000) {
            rate = 5.0;
        } else if (sale <= 80000) {
            rate = 7.0;
        } else if (sale <= 100000) {
            rate = 9.0;
        } else {
            rate = 10.0;
        }

        double commission = sale * rate / 100;

        System.out.println("You got rate = " + rate + "%");
        System.out.println("Your sale " + sale
                + ", commission = " + commission);

        sc.close();
    }
}
