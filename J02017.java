/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 23/09/2022
    Time : 11:10 CH
    ProjectName : Java
    -------------GOOD NIGHT --------
*/

import java.util.*;

public class J02017 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        boolean b = true;
        while (b) {
            b = false;
            for (int i = 0; i < a.size() - 1; i++) {
                if ((a.get(i) + a.get(i + 1)) % 2 == 0) {
                    a.remove(i);
                    a.remove(i);
                    b = true;
                }
            }
        }
        System.out.print(a.size());
    }
}
