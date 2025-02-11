import java.util.Scanner;

public class Pallin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        String reversed = new StringBuilder(str).reverse().toString();

        if(str.equals(reversed)){
            System.out.println("Yes");
        }else{
            System.out.print("No");
        }

    }
}