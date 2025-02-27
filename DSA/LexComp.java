/*
INPUT
hello
java

OUTPUT
9 :sum of length of string
No :(yes/no) lexicographically if big then YES or else NO
Hello Java :Final output
*/

import java.util.Scanner;

public class LexComp{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first word: ");
        String A= sc.next();
        System.out.print("Enter second word: ");
        String B= sc.next();

        System.out.println("Sum of Length of two given strings: "+A.length()+B.length());

        if(A.compareTo(B)>0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

        String CapA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String CapB = B.substring(0,1).toUpperCase() + B.substring(1);

        System.out.print("Capitalised first letter output: ");

        System.out.print(CapA+" "+CapB);
    }
}