
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;


public class J07007 {
    public static void main(String[] args) throws IOException {
        WordSet ws = new WordSet("VANBAN.in");
        System.out.println(ws);
    }
}

class WordSet {
    private static TreeSet<String> ds = new TreeSet<>();

    public WordSet(String file) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        while(sc.hasNext()){
            ds.add(sc.next().toLowerCase());
        }

    }

    @Override
    public String toString() {
        String s ="";
        for(String x : ds){
            s = s + x +"\n";
        }
        return s;
    }
    
    
}
