
import java.util.Scanner;

public class first {

    public static void main(String[] args) {
        int a, b, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Input your start number: ");
        a = input.nextInt();
        System.out.println("Input your End number: ");
        b = input.nextInt();
        for (int i = a; i <= b; i++) {
            sum = sum + i;
        }
        System.out.println("Total sum: " + sum);
    }

}
