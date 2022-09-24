/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 04/09/2022
    Time : 9:55 CH
    ProjectName : Java
    -------------GOOD NIGHT --------
*/


import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class J05021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> ds = new ArrayList<>();
        while(sc.hasNext()){
            String masinhvien = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            SinhVien sinhVien = new SinhVien(ten,masinhvien,lop,email);
            ds.add(sinhVien);
        }
        Collections.sort(ds, (SinhVien o1, SinhVien o2) -> o1.getMasinhvien().compareTo(o2.getMasinhvien()));
        for(SinhVien x : ds){
            System.out.println(x);
        }
    }
}

class SinhVien{
    private  String ten, masinhvien,lop,email;

    public SinhVien(String ten, String masinhvien, String lop, String email) {
        this.ten = ten;
        this.masinhvien = masinhvien;
        this.lop = lop;
        this.email = email;
    }

    public String getMasinhvien() {
        return masinhvien;
    }

    @Override
    public String toString() {
        return this.masinhvien +" "+this.ten + " "+ this.lop+" "+ this.email;
    }
}
