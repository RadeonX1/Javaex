import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter radius : ");
        double radius = scan.nextDouble();

        final  double PI =3.14;

    
        double area = PI *radius*radius;

        System.out.println("Area : "+area);


    }
    
}
