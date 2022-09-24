/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 24/09/2022
    Time : 4:05 CH
    ProjectName : Java
    -------------GOOD NIGHT --------
*/

import java.util.Scanner;

public class J03025 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0) {
            System.out.println(solve());
        }
    }

    private static String solve() {
        char[] s = sc.nextLine().toCharArray();
        int cnt = 0;
        for (int i = 0; i < s.length/2; i++) {
            if (s[i] != s[s.length-i-1])
                cnt++;
            if (cnt > 1) return "NO";
        }
        return (s.length%2 == 0 && cnt == 1 || s.length%2 == 1) ? "YES" : "NO";
    }
}
