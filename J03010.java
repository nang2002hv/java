/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 23/09/2022
    Time : 8:50 CH
    ProjectName : Java
    -------------GOOD NIGHT --------
*/

import java.util.HashMap;
import java.util.Scanner;

public class J03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        HashMap<String, Integer> hashMap = new HashMap<>();
        while (t-- > 0){
            String s = sc.nextLine();
            s = s.trim();
            String []a =s.split("\\s+");
            String k = a[a.length - 1].toLowerCase();
            for (int i = 0; i < a.length-1; i++){
                k += a[i].toLowerCase().charAt(0);
            }
            if(hashMap.containsKey(k)){
                int tmp = hashMap.get(k);
                tmp++;
                hashMap.put(k,tmp);
            } else {
                hashMap.put(k,1);
            }
            int res = hashMap.get(k);
            System.out.print(k);
            if(res > 1) System.out.print(res);
            System.out.println("@ptit.edu.vn");
        }
    }
}
