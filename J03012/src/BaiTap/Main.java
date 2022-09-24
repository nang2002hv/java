package BaiTap;
/* Welcome to Nguyen Trac Nang 
    @author : ASUS
    Date : 13/09/2022
    Time : 7:59 SA
    ProjectName : J03012
    -------------GOOD NIGHT --------
*/

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        while( t-- > 0){
            BigInteger a ;
            BigInteger b ;
            a = sc.nextBigInteger();
            b = sc.nextBigInteger();
            System.out.println(a.add(b));

        }
    }
}
