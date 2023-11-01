import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int line = scanner.nextInt();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < line - i - 1; j++) {
                System.out.print(" ");
            }
            for (int r = 0; r < i * 2 + 1; r++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int z = 0; z < height; z++) {

            for (int k = 0; k < line - z - 1; k++) {
                System.out.print(" ");
            }
            for (int g = 0; g < z * 2 + 1; g++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int s = 0; s < height; s++) {
            for (int w = 0; w < line - s - 1; w++) {
                System.out.print(" ");
            }
            for (int b=0; b<s*2+1; b++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

