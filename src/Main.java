import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısı giriniz : ");
        int n = input.nextInt();

        // Loop for drawing the inverted triangle
        for (int i = (n - 1); i >= 0; i--) {
            for (int k = 1; k <= (2 * i - 1); k++) {// Loop for printing asterisks
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}