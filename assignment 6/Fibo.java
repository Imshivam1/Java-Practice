import java.util.Scanner;

public class Fibo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range for Fibonacci series: ");
        int n = sc.nextInt();


        int start = 0, first= 1;

        for(int i=0; i<=n; i++){
            System.out.print(start + " ");
            int next = start + first;
            start = first;
            first = next;
        }
    }
}
