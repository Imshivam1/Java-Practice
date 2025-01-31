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
//fibonacci series
//0, 1, 1, 2, 3, 5, 8, 13
//0, 1, 0+1, 1+1, 1+2,
/*
input
2 =test case
0 2 10 =a, b , n
5 3 5
output
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98

0 + 1.2 + 2.2 + 4.2 = 14
term n = a+ b(2pow0 + 2 pow1 + 2 pow2 +....+ )
j= n;
current = a
current += b * Math.pow(2, j);
*/