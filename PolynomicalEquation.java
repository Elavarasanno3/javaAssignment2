import java.util.Scanner;

public class PolynomicalEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        double d = b * b - 4*a*c;
        if(d < 0){
            System.out.println("this equation has no real roots");
        }else{
            double x = (-b + Math.sqrt(b*b - 4*a*c))/2*a;
            double y = (-b - Math.sqrt(b*b - 4*a*c))/2*a;
            System.out.println(x);
            System.out.println(y);
        }

    }
}
