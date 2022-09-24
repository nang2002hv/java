/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 05/09/2022
    Time : 6:48 CH
    ProjectName : Java
    -------------GOOD NIGHT --------
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class J05030 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien6> ds = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String masinhvien = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            float diem1 = Float.parseFloat(sc.nextLine());
            float diem2 = Float.parseFloat(sc.nextLine());
            float diem3 = Float.parseFloat(sc.nextLine());
            SinhVien6 sinhVien6 = new SinhVien6(masinhvien,ten,lop,diem1,diem2,diem3);
            ds.add(sinhVien6);
        }

        Collections.sort(ds, (SinhVien6 o1, SinhVien6 o2) -> o1.getMasinhvien().compareTo(o2.getMasinhvien()));
        int dem  = 0;
        for (SinhVien6 x : ds){
            dem++;
            System.out.print (dem + " ");
            System.out.println(x);
        }
    }
}

class SinhVien6{
    static int dem = 0;
    String masinhvien,ten,lop;
    float diem1,diem2,diem3;
    private int stt;
    public SinhVien6(String masinhvien, String ten, String lop, float diem1, float diem2, float diem3) {
        this.masinhvien = masinhvien;
        this.ten = ten;
        this.lop = lop;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        dem++;
        this.stt = dem;
    }

    public String getMasinhvien() {
        return masinhvien;
    }

    @Override
    public String toString() {
        return this.masinhvien+" "+ this.ten + " "+ this.lop + " " + this.diem1 + " "+ this.diem2 + " " + this.diem3;
    }
}
