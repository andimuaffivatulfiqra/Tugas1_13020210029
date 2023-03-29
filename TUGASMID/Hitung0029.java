import java.util.Scanner;

public class Hitung0029 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mil: ");
        double mil = input.nextDouble();

        double meter = mil * 1609.0;
        System.out.println("Hasil " + mil + " mil = " + meter + " meter");

        input.close();
    }
}