import java.util.Scanner;
class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.print("Enter time in seconds: ");
            int totalSeconds = scanner.nextInt();

            int hours = totalSeconds / 3600;
            int minutes = (totalSeconds % 3600) / 60;
            int seconds = totalSeconds % 60;

            String timeFormatted = String.format("%02d:%02d:%02d", hours, minutes, seconds);

            System.out.println("Converted time (HH:MM:SS): " + timeFormatted);
    }
}
