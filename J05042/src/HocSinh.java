/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 08/09/2022
    Time : 5:08 CH
    ProjectName : J05042
    -------------GOOD NIGHT --------
*/

public class HocSinh {
    String ten;
    int submit,ac;

    public HocSinh(String ten, int submit, int ac) {
        this.ten = ten;
        this.submit = submit;
        this.ac = ac;
    }

    public String getTen() {
        return ten;
    }

    public int getSubmit() {
        return submit;
    }

    public int getAc() {
        return ac;
    }

    @Override
    public String toString() {
        return this.ten + " " + this.ac + " "+ this.submit;
    }
}
