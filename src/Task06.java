import java.util.Scanner;

public class Task06 {
    public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <i*(n-1); j++) {
                System.out.print("  ");

            }
            for (int z = 0; z <n; z++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
