
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        while (sc.hasNext()) {
            int tmp = sc.nextInt();
            if(treeMap.containsKey(tmp)){
                int tmp1 = treeMap.get(tmp);
                tmp1++;
                treeMap.put(tmp, tmp1);
            } else {
                treeMap.put(tmp, 1);
            }
        }
        for(Map.Entry<Integer,Integer> x : treeMap.entrySet()){
            System.out.println(x.getKey() +" "+x.getValue());
        }
    }
}
