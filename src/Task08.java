import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for(int i=0; i<n; i++){
            if(i>0){
                sum++;
            }
            System.out.println(i);
        }
    }

}

