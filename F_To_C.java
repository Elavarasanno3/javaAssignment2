import java.util.Scanner;
import java.util.*;
public class F_To_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the valid fahrenheit Number");
        float f = sc.nextFloat();
        System.out.println(makeFahrenHeatToCelsius(f));

        System.out.println("Enter the valid celsius Number");
        float c = sc.nextFloat();

        System.out.println(makeCelsiusToFahrenHeat(c));


    }
    static float makeFahrenHeatToCelsius(float f){
        return ((f-32)*5/9);
    }
    static float makeCelsiusToFahrenHeat(float c){
        return (c*9/5)+32;
    }
}
