import java.util.Scanner;

public class Main04 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        char c = scn.next().charAt(0);
        for (int i = 1; i <= n; i++) {
            for (int f = 1; f <= n; f++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}