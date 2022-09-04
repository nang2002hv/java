
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J03005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s = sc.nextLine();
            String k = "";
            s = s.trim();
            List<String> ds = new ArrayList<>();
            String [] a = s.split("\\s+");
            for(String x : a){
                x = x.toLowerCase();
                k += Character.toUpperCase(x.charAt(0));
                k += x.substring(1,x.length());
                ds.add(k);
                k ="";
            }
            for(int i = 1; i < ds.size(); i++){
                if(i < ds.size()-1){
                    System.out.print(ds.get(i) +" ");
                } else {
                    System.out.print(ds.get(ds.size()-1) +", ");
                }
            }
            System.out.println(ds.get(0).toUpperCase());
        }
    }
}

