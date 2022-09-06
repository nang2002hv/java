/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 06/09/2022
    Time : 9:53 SA
    ProjectName : Java
    -------------GOOD NIGHT --------
*/

import java.util.Scanner;

class LopSinhVien {

    private String ten, stt, lop;
    private StringBuffer ngaysinh;
    private double gpa;

    public LopSinhVien(String ten, String lop, String ngaysinh, double gpa) {
        this.ten = ten;
        this.lop = lop;
        this.ngaysinh = new StringBuffer(ngaysinh);
        this.gpa = gpa;
        this.stt = "B20DCCN001";
    }
    public static StringBuffer chuanHoaNgay(StringBuffer ngay){
        if(ngay.charAt(1) == '/') ngay.insert(0, "0");
        if(ngay.charAt(4) == '/') ngay.insert(3, '0');
        return ngay;
    }

    public void xuly() {
        this.ngaysinh = chuanHoaNgay(ngaysinh);
    }

    @Override
    public String toString() {
        return this.stt + " " + this.ten + " " + this.lop + " " + this.ngaysinh + " " + String.format("%.2f", this.gpa);
    }

}

public class J04006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        String lop = sc.next();
        String ngaysinh = sc.next();
        double gpa = 1f*sc.nextDouble();
        LopSinhVien lopSinhVien =  new LopSinhVien(ten, lop, ngaysinh, gpa);
        lopSinhVien.xuly();
        System.out.println(lopSinhVien);
    }
}
