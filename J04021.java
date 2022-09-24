/* Welcome to Nguyen Trac Nang
    @author : ASUS
    Date : 06/09/2022
    Time : 9:30 SA
    ProjectName : Java
    -------------GOOD NIGHT --------
*/

import java.util.*;

/**
 *
 * @author ASUS
 */
public class J04021 {
    private  TreeSet <Integer> treeSet = new TreeSet<>();

    public J04021() {
    }

    public J04021(int a[]) {
        for(int i = 0; i < a.length; i++){
            treeSet.add(a[i]);
        }
    }

    public void setTreeSet(TreeSet<Integer> treeSet) {
        this.treeSet = treeSet;
    }


    public TreeSet<Integer> getTreeSet() {
        return treeSet;
    }


    public J04021 union(J04021 p1){
        J04021 p = new J04021();
        treeSet.addAll(p1.getTreeSet());
        p.setTreeSet(treeSet);
        return p;
    }

    @Override
    public String toString() {
        String s ="";
        for(int x : treeSet){
            s += x +" ";
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        J04021 s1 = new J04021(a);
        J04021 s2 = new J04021(b);
        J04021 s3 = s1.union(s2);
        System.out.println(s3);
    }
    public static void main4562744(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();
        for(int i = 0; i < m; i++) b[i] = sc.nextInt();
        J04021 s1 = new J04021(a);
        J04021 s2 = new J04021(b);
        J04021 s3 = s1.union(s2);
        System.out.println(s3);
    }
}

