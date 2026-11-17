import java.util.Scanner;


public class ex02{
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       System.out.print("Enetr name: ");
       String name = scan.nextLine();

       System.out.print("Mid term: ");
       int score = scan.nextInt();

       System.out.print("Final term: ");
       int scores = scan.nextInt();
       
       
       int Totals = score + scores;
       String Result = (Totals >= 50 ) ? "pass" : "Fail";

       System.out.print("Student: "+name +"| Total: "+Totals + "| Result :"+Result);

    }
}
