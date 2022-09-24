/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap;

/**
 *
 * @author ASUS
 */
public class TuyenSinh {
        private int diem1,diem2,diem3;
        private String ten, makhuvu,ketqua;
        private float tong;

    public TuyenSinh(int diem1, int diem2, int diem3, String ten, String makhuvu) {
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.ten = ten;
        this.makhuvu = makhuvu;
    }
        
    public void xuLy(){
        tong = diem1+diem2+diem3;
        String tmp = makhuvu.substring(0,3);
        if (tmp =="KV1") tong += 0.5;
        if (tmp =="KV2") tong += 1;
        if (tmp =="KV3") tong += 1.5;
        if (tong >= 24) ketqua ="TRUNG TUYEN";
        else ketqua = "TRUOT";
    }
        
}
