/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 06/09/2022
    Time : 9:17 SA
    ProjectName : Java
    -------------GOOD NIGHT --------
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien7> ds = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String masinhvien = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            float diem1 = Float.parseFloat(sc.nextLine());
            float diem2 = Float.parseFloat(sc.nextLine());
            float diem3 = Float.parseFloat(sc.nextLine());
            SinhVien7 sinhVien7 = new SinhVien7(masinhvien,ten,lop,diem1,diem2,diem3);
            ds.add(sinhVien7);
        }

        Collections.sort(ds, (SinhVien7 o1, SinhVien7 o2) -> o1.getTen().compareTo(o2.getTen()));
        int dem  = 0;
        for (SinhVien7 x : ds){
            dem++;
            System.out.print (dem + " ");
            System.out.println(x);
        }
    }
}

class SinhVien7{
    static int dem = 0;
    String masinhvien,ten,lop;
    float diem1,diem2,diem3;
    private int stt;
    public SinhVien7(String masinhvien, String ten, String lop, float diem1, float diem2, float diem3) {
        this.masinhvien = masinhvien;
        this.ten = ten;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        dem++;
        this.stt = dem;
    }

    public String getTen() {
        return ten;
    }

    @Override
    public String toString() {
        return this.masinhvien+" "+ this.ten + " "+ this.lop + " " + this.diem1 + " "+ this.diem2 + " " + this.diem3;
    }
}

