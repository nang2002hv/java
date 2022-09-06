package J05022;
/* Welcome to Nguyen Trac Nang 
    @author : ASUS
    Date : 06/09/2022
    Time : 11:59 SA
    ProjectName : Java
    -------------GOOD NIGHT --------
*/

public class SinhVien1{
    private  String ten, masinhvien,lop,email;

    public SinhVien1(String ten, String masinhvien, String lop, String email) {
        this.ten = ten;
        this.masinhvien = masinhvien;
        this.lop = lop;
        this.email = email;
    }

    public String getLop() {
        return lop;
    }

    public String getMasinhvien() {
        return masinhvien;
    }

    @Override
    public String toString() {
        return this.masinhvien +" "+this.ten + " "+ this.lop+" "+ this.email;
    }
}