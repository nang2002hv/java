/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 08/09/2022
    Time : 5:11 CH
    ProjectName : J05042
    -------------GOOD NIGHT --------
*/

import java.util.Comparator;

public class Sapxep implements Comparator<HocSinh> {


    @Override
    public int compare(HocSinh o1, HocSinh o2) {
        if(o1.getAc() != o2.getAc()) return o2.getAc() - o1.getAc();
        if(o1.getSubmit() != o2.getSubmit()) return o1.getSubmit() - o2.getSubmit();
        return o1.getTen().compareTo(o2.getTen());
    }
}
