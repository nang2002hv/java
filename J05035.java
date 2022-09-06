/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 06/09/2022
    Time : 9:56 SA
    ProjectName : Java
    -------------GOOD NIGHT --------
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList <ThucTap> ds = new ArrayList<>();
        while(t-- > 0){
            String masinhvien = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String congty = sc.nextLine();
            ThucTap thucTap = new ThucTap(masinhvien,ten,lop,email,congty);
            ds.add(thucTap);
        }
        Collections.sort(ds, (ThucTap o1, ThucTap o2) -> o1.getMasinhvien().compareTo(o2.getMasinhvien()));
        int n = Integer.parseInt(sc.nextLine());
        while(n-- >0){
            String tmp = sc.nextLine();
            for(ThucTap x : ds){
                if(x.getCongty().compareTo(tmp) == 0)
                    System.out.println(x);
            }
        }
    }
}

class ThucTap{
    private String masinhvien,ten,lop,email,congty;
    private int stt;
    static int dem = 0;

    public ThucTap(String masinhvien, String ten, String lop, String email, String congty) {
        dem++;
        this.masinhvien = masinhvien;
        this.ten = ten;
        this.lop = lop;
        this.email = email;
        this.congty = congty;
        this.stt = dem;
    }

    public String getMasinhvien() {
        return masinhvien;
    }

    public String getCongty() {
        return congty;
    }

    public String toString() {
        return this.stt + " "+ this.masinhvien + " " + this.ten + " " + this.lop + " " + this.email + " "+ this.congty;
    }
}
