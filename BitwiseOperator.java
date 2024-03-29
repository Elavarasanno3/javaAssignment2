import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println("Bitwise AND: " + (num1 & num2));
        System.out.println("Bitwise OR: " + (num1 | num2));
        System.out.println("Bitwise XOR: " + (num1 ^ num2));

        System.out.println("Bitwise NOT: " + (~num1));
        System.out.println("Bitwise first numbers's Left Shift: " + (num1 << 2));
        System.out.println("Bitwise first numbers's Right Shift: " + (num1 >> 2));
        System.out.println("Bitwise first numbers's Unsigned Right Shift: " + (num1 >>> 2));

        input.close();
    }
}
