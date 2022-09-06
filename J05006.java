/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 04/09/2022
    Time : 8:14 CH
    ProjectName : Java
    -------------GOOD NIGHT --------
*/

import java.util.ArrayList;
import java.util.Scanner;

public class J05006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList <NV> ds = new ArrayList<>();
        while(t-- > 0){
            String ten  = sc.nextLine();
            String gioitinh = sc.nextLine();
            String ngaysinh = sc.nextLine();
            String diachi = sc.nextLine();
            String masothue = sc.nextLine();
            String ngaykihopdong = sc.nextLine();
            NV nV = new NV(ten, ngaysinh,diachi,masothue,ngaykihopdong,gioitinh);
            ds.add(nV);
        }
        for (NV x : ds){
            System.out.println(x);
        }
    }
}

class  NV {
    private String stt;
    private  String ten;
    private  String ngaysinh;
    private  String diachi;
    private  String masothue;
    private  String ngaykihopdong;
    private  String gioitinh;
    static int dem = 0;


    public NV(String ten, String ngaysinh, String diachi, String masothue, String ngaykihopdong, String gioitinh) {
        dem++;
        this.stt = String.valueOf(dem);
        while(this.stt.length() < 5)  this.stt = "0" + this.stt;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.masothue = masothue;
        this.ngaykihopdong = ngaykihopdong;
        this.gioitinh = gioitinh;
    }

    @Override
    public String toString() {
        return this.stt +" "+ this.ten +" " + this.gioitinh + " " + this.ngaysinh + " " + this.diachi +" "+ this.masothue+" "+this.ngaykihopdong;
    }
}
