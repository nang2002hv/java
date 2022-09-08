package GiaBan;
/* Welcome to Nguyen Trac Nang 
    @author : ASUS
    Date : 08/09/2022
    Time : 11:00 SA
    ProjectName : J05036
    -------------GOOD NIGHT --------
*/

public class TinhGiaBan {
    String ten,mahang,donvitinh;
    double phivanchuyen,thanhtien,giaban,dongia,soluong;
    static int dem = 0;
    public TinhGiaBan(String ten, String donvitinh,double dongia, double soluong) {
        this.ten = ten;
        this.donvitinh = donvitinh;
        this.dongia = dongia;
        this.soluong = soluong;
        dem++;
        String tmp = String.valueOf(dem);
        while (tmp.length() < 2) tmp = "0" + tmp;
        this.mahang = "MH" + tmp;
        this.phivanchuyen =  Math.ceil((dongia*soluong)*5/100);
        this.thanhtien = dongia*soluong + this.phivanchuyen;
        this.giaban = (thanhtien + thanhtien*2/100)/soluong;
    }

    public double getGiaban() {
        return giaban;
    }

    @Override
    public String toString() {
        return this.mahang + " " + this.ten + "  "+ this.donvitinh + " "+ Math.round(this.phivanchuyen) + " "+ Math.round(this.thanhtien) + " "+ Math.ceil(this.giaban);
    }
}
