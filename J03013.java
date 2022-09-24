package javanhom2;

import java.math.BigInteger;
import java.util.Scanner;

public class J03013 {
    static long mod = 1000000007;
    static long []f = new long[100];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger c = a.max(b);
            int len = String.valueOf(c).length();
            String tmp = String.valueOf(a.subtract(b).abs());
            while(tmp.length() < len) tmp = "0"+tmp;
            System.out.println(tmp);
        }
    } 
    
}
