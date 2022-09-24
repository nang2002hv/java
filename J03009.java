
import java.util.Scanner;
import java.util.TreeSet;

public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            String s []= sc.nextLine().split("\\s+");
            String s1 []= sc.nextLine().split("\\s+");
            TreeSet<String> ds = new TreeSet<>();
            TreeSet<String> ds1 = new TreeSet<>();
            for(String x : s) {
                ds.add(x);
            }
            for(String x : s1){
                ds1.add(x);
            }
            ds.removeAll(ds1);
            for(String x : ds){
                System.out.print(x + " ");
            }
            System.out.println("");
        }
    }
}
