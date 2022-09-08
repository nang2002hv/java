/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 08/09/2022
    Time : 5:07 CH
    ProjectName : J05042
    -------------GOOD NIGHT --------
*/

import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <HocSinh> ds = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String ten = sc.nextLine();
            String a = sc.nextLine();
            a = a.trim();
            String s[] = a.split("\\s+");
            int ac = Integer.parseInt(s[0]);
            int submit = Integer.parseInt(s[1]);
            HocSinh hocSinh  = new HocSinh(ten,submit,ac);
            ds.add(hocSinh);
        }
        Collections.sort(ds, new Sapxep());
        for(HocSinh x : ds){
            System.out.println(x);
        }
    }
}
