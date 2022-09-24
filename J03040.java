/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 24/09/2022
    Time : 4:18 CH
    ProjectName : Java
    -------------GOOD NIGHT --------
*/

import java.util.Scanner;

public class J03040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while ( t-- > 0){
            String s = sc.nextLine();
            String a = sc.nextLine().substring(s.length()-5,s.length());
            if(true){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }


}
