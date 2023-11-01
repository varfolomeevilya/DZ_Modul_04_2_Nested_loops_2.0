import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                if (i + j >= n && j + i <= k) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                if (i + j >= n && j + i <= k) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

}


