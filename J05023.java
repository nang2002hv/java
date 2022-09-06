/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 04/09/2022
    Time : 10:14 CH
    ProjectName : Java
    -------------GOOD NIGHT --------
*/


import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class J05023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien4> ds = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String masinhvien = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            SinhVien4 sinhVien = new SinhVien4(ten,masinhvien,lop,email);
            ds.add(sinhVien);
        }
        //Collections.sort(ds, (SinhVien1 o1, SinhVien1 o2) -> o1.getLop().compareTo(o2.getLop()));
        int test = Integer.parseInt(sc.nextLine());
        while(test -- > 0){
            String tenlop = sc.nextLine();
            System.out.printf("DANH SACH SINH VIEN KHOA %s:\n", tenlop);
            for(SinhVien4 x : ds){
                if(x.getLop().compareTo(tenlop) == 0)
                    System.out.println(x);
            }
        }

    }
}

class SinhVien4{
    private  String ten, masinhvien,lop,email;

    public SinhVien4(String ten, String masinhvien, String lop, String email) {
        this.ten = ten;
        this.masinhvien = masinhvien;
        this.lop = lop;
        this.email = email;
    }

    public String getLop() {
        String tmp = "20" + lop.substring(1,3);
        return tmp;
    }



    @Override
    public String toString() {
        return this.masinhvien +" "+this.ten + " "+ this.lop+" "+ this.email;
    }
}