/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 24/09/2022
    Time : 3:53 CH
    ProjectName : Java
    -------------GOOD NIGHT --------
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class J07003 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNext()){
            String s = sc.nextLine();
            while(s.length() > 1){
                int n = s.length()/2;
                BigInteger a = new BigInteger(s.substring(0,n));
                BigInteger b = new BigInteger(s.substring(n,s.length()));
                BigInteger c = a.add(b);
                s = c.toString();
                System.out.println(s);
            }
        }
    }
}
