/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 06/09/2022
    Time : 9:40 SA
    ProjectName : Java
    -------------GOOD NIGHT --------
*/

import java.util.Scanner;

class LopThiSinh {
    private String ten;
    private String ngaysinh;
    private float diem1, diem2, diem3, tong;

    public LopThiSinh(String ten, String ngaysinh, float diem1, float diem2, float diem3) {
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.tong = diem1 + diem2 + diem3;
    }

    @Override
    public String toString() {
        return this.ten + " " + this.ngaysinh + " " + String.format("%.1f", this.tong);
    }

}

public class J04005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc.nextLine();
        String ngaysinh = sc.nextLine();
        float diem1 = sc.nextFloat();
        float diem2 = sc.nextFloat();
        float diem3 = sc.nextFloat();
        LopThiSinh lopThiSinh = new LopThiSinh(ten, ngaysinh, diem1, diem2, diem3);
        System.out.println(lopThiSinh);
    }

}