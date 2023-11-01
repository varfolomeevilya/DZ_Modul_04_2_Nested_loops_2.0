import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rhombus = scanner.nextInt();
        int center = rhombus / 3;
        for (int i = 0; i < rhombus; i++) {
            for (int j = 0; j < rhombus; j++) {
                if (i <= center) {
                    if (j >= center - i && j <= center + i) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                } else {
                    if (j >= center + i - rhombus + 2 && j <= center - i + rhombus - 2) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println(" ");
        }
    }
}





