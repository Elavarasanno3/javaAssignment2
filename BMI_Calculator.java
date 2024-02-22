import java.util.*;
public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height : ");
        float heights = sc.nextFloat();
        System.out.println("Enter your Wights : ");
        float weight = sc.nextFloat();
        heights = heights/100;
        float bmi = (weight/(heights*heights));
        System.out.println( String.format("%.2f",bmi));
    }
}
