/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 24/09/2022
    Time : 4:11 CH
    ProjectName : Java
    -------------GOOD NIGHT --------
*/

import java.util.Scanner;

public class J03026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s1, s2;
            s1 = sc.nextLine();
            s2 = sc.nextLine();
            if(s1.compareTo(s2) == 0) System.out.println("-1");
            else System.out.println(Math.max(s1.length(),s2.length()));
        }
    }
}
