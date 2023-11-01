import java.util.Scanner;

public class Task07 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int m=0;

             int r = n % 10 ;
             n = n / 10;
             m += r * 10;

        System.out.println(m);
    }
}

