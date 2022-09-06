/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 05/09/2022
    Time : 11:42 SA
    ProjectName : Java
    -------------GOOD NIGHT --------
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class J07010 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SV.in") );
        ArrayList<SinhVien2> ds = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String ngaysinh = sc.nextLine();
            float diem = Float.parseFloat(sc.nextLine());
            SinhVien2 sinhVien2 = new SinhVien2(ten,ngaysinh,lop,diem);
            sinhVien2.xuly();
            ds.add(sinhVien2);
        }
        for(SinhVien2 x : ds){
            System.out.println(x);
        }
    }
}

class SinhVien2{
    private String stt, ten, ngaysinh,lop;
    private float diem;
    static int dem = 0;
    public SinhVien2(String ten, String ngaysinh, String lop, float diem) {
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.lop = lop;
        this.diem = diem;
        this.stt = "B20DCCN";
    }

    public String chuanHoaNgaySinh(String ngaysinh){
        if(ngaysinh.charAt(1) == '/') ngaysinh ="0" + ngaysinh;
        if(ngaysinh.charAt(4) == '/') ngaysinh = ngaysinh.substring(0,3) + "0" + ngaysinh.substring(3);
        return ngaysinh;
    }

    public void xuly(){
        dem++;
        String tmp = String.valueOf(dem);
        while(tmp.length() < 3) tmp = "0" + tmp;
        stt = stt + tmp;
        ngaysinh = chuanHoaNgaySinh(ngaysinh);
    }

    @Override
    public String toString() {
        return this.stt + " "+ this.ten + " "+ this.lop + " " + this.ngaysinh + " " + String.format("%.2f",diem);
    }
}
