/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 04/09/2022
    Time : 8:54 CH
    ProjectName : Java
    -------------GOOD NIGHT --------
*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class J05009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList <ThiSinh> ds = new ArrayList<>();
        while(t-- >0){
            String ten = sc.nextLine();
            String ngaysinh = sc.nextLine();
            float diem1 = Float.parseFloat(sc.nextLine());
            float diem2 = Float.parseFloat(sc.nextLine());
            float diem3 = Float.parseFloat(sc.nextLine());
            ThiSinh thiSinh = new ThiSinh(ten,ngaysinh,diem1,diem2,diem3);
            ds.add(thiSinh);
        }
        float diem = 0;
        for(ThiSinh x : ds){
            if(diem  < x.getTong()){
                diem = x.getTong();
            }
        }
        for(ThiSinh x : ds){
            if(diem  == x.getTong()){
                System.out.println(x);
            }
        }

    }
}

class ThiSinh{
    private String ten, ngaysinh;
    private float tong;
    static int dem = 0;
    private  int stt;

    public ThiSinh(String ten, String ngaysinh, float diem1, float diem2, float diem3) {
        dem++;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.tong = diem1+diem2+diem3;
        this.stt = dem;
    }

    public float getTong() {
        return tong;
    }

    @Override
    public String toString() {
        return this.stt +" "+this.ten + " " + this.ngaysinh +" " + this.tong;
    }
}
