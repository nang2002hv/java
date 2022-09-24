/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 24/09/2022
    Time : 3:44 CH
    ProjectName : Java
    -------------GOOD NIGHT --------
*/

import java.util.HashSet;
import java.util.Scanner;

public class J03038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet <Character> hashSet = new HashSet<>();
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++){
            hashSet.add(s.charAt(i));
        }
        System.out.println(hashSet.size());
    }
}
