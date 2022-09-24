

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class SinhVien3 {
    private String ten, lop,stt ;
    private double diem;
    private StringBuffer ngaysinh;
    private static int dem = 0;

    public SinhVien3(String ten, String lop, double diem, String ngaysinh) {
        this.stt = "B20DCCN";
        this.ten = ten;
        this.lop = lop;
        this.diem = diem;
        this.ngaysinh = new StringBuffer(ngaysinh);
    }

    public double getDiem() {
        return diem;
    }


    public String chuanHoaTen(String a){
        a = a.trim();
        String [ ] s = a.split("\\s+");
        String k = "";
        for ( String x : s ){
            x = x.toLowerCase();
            k += Character.toUpperCase(x.charAt(0));
            k += x.substring(1, x.length());
            k += " ";
        }
        k = k.trim();
        return k;
    }
    public StringBuffer chuanHoaNgaySinh(StringBuffer ngaysinh){
        if(ngaysinh.charAt(1) == '/') ngaysinh.insert(0, "0");
        if(ngaysinh.charAt(4) == '/') ngaysinh.insert(3, "0");
        return ngaysinh;
    }

    public void xuly(){
        dem++;
        String tmp = String.valueOf(dem);
        while(tmp.length() < 3) {
            tmp = "0" + tmp;
        }
        this.lop = this.lop.toUpperCase();
        stt = stt +tmp;
        this.ten = chuanHoaTen(this.ten);
        this.ngaysinh = chuanHoaNgaySinh(this.ngaysinh);
    }

    @Override
    public String toString() {
        String s = this.stt + " " + this.ten + " " + this.lop +" " + this.ngaysinh + " "+ String.format("%.2f", this.diem);
        s = s.trim();
        return  s;
    }


}

public class J05005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien3> ds = new ArrayList<>();
        while(t-- > 0) {
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String ngaysinh = sc.nextLine();
            double a = Double.parseDouble(sc.nextLine());
            SinhVien3  sinhVien3 = new SinhVien3(ten, lop, a, ngaysinh);
            sinhVien3.xuly();;
            ds.add(sinhVien3);
        }
        Collections.sort(ds, (SinhVien3 o1, SinhVien3 o2) -> {
            return (int) (1000*(o2.getDiem()-o1.getDiem()));
        });
        for(SinhVien3 x : ds){
            System.out.println(x);
        }
    }

}