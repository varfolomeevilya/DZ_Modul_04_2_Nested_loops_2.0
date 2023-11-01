import java.util.Scanner;

public class Task03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        for(int i=0;i<n; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                System.out.print(" ");
            }
            for(int r=0; r<i*2+1; r++){
                System.out.print("*");

            }
            System.out.println();
        }

        int n2= scanner.nextInt();
        for(int i1=0;i1<n2; i1++) {
            for (int j1 = 0; j1 <=n2 - i1 - 1; j1++) {
              System.out.print(" ");

            }
            for(int r=0; r<i1*2+1; r++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
