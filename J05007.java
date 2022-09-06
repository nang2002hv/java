/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 04/09/2022
    Time : 8:14 CH
    ProjectName : Java
    -------------GOOD NIGHT --------
*/

import java.util.*;

public class J05007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList <NV1> ds = new ArrayList<>();
        while(t-- > 0){
            String ten  = sc.nextLine();
            String gioitinh = sc.nextLine();
            String ngaysinh = sc.nextLine();
            String diachi = sc.nextLine();
            String masothue = sc.nextLine();
            String ngaykihopdong = sc.nextLine();
            NV1 nV = new NV1(ten, ngaysinh,diachi,masothue,ngaykihopdong,gioitinh);
            ds.add(nV);
        }
        Collections.sort(ds, new Comparator<NV1>() {
            @Override
            public int compare(NV1 o1, NV1 o2) {
                return (int)(o1.tong-o2.tong);
            }
        });
        for (NV1 x : ds){
            System.out.println(x);
        }
    }
}

class  NV1 {
    private String stt;
    private  String ten;
    private  String ngaysinh;
    private  String diachi;
    private  String masothue;
    private  String ngaykihopdong;
    private  String gioitinh;
    static int dem = 0;

    public long tong = 0;

    public NV1(String ten, String ngaysinh, String diachi, String masothue, String ngaykihopdong, String gioitinh) {
        dem++;
        this.stt = String.valueOf(dem);
        while(this.stt.length() < 5)  this.stt = "0" + this.stt;
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.masothue = masothue;
        this.ngaykihopdong = ngaykihopdong;
        this.gioitinh = gioitinh;
        this.tong = Long.parseLong(ngaysinh.substring(0,2)) + Long.parseLong(ngaysinh.substring(3,5))*30 + Long.parseLong(ngaysinh.substring(6,10))*30*12;
    }

    @Override
    public String toString() {
        return this.stt +" "+ this.ten +" " + this.gioitinh + " " + this.ngaysinh + " " + this.diachi +" "+ this.masothue+" "+this.ngaykihopdong;
    }
}
