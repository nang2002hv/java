/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 06/09/2022
    Time : 10:09 SA
    ProjectName : Java
    -------------GOOD NIGHT --------
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList <ThucTap1> ds = new ArrayList<>();
        while(t-- > 0){
            String masinhvien = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            String congty = sc.nextLine();
            ThucTap1 thucTap = new ThucTap1(masinhvien,ten,lop,email,congty);
            ds.add(thucTap);
        }
        Collections.sort(ds, (ThucTap1 o1, ThucTap1 o2) -> o1.getTen().compareTo(o2.getTen()));
        int n = Integer.parseInt(sc.nextLine());
        while(n-- >0){
            String tmp = sc.nextLine();
            for(ThucTap1 x : ds){
                if(x.getCongty().compareTo(tmp) == 0)
                    System.out.println(x);
            }
        }
    }
}

class ThucTap1{
    private String masinhvien,ten,lop,email,congty;
    private int stt;
    static int dem = 0;

    public ThucTap1(String masinhvien, String ten, String lop, String email, String congty) {
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

    public String getTen() {
        return ten;
    }

    public String getCongty() {
        return congty;
    }

    public String toString() {
        return this.stt + " "+ this.masinhvien + " " + this.ten + " " + this.lop + " " + this.email + " "+ this.congty;
    }
}

