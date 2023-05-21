import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = Integer.parseInt(cs.nextLine());
        ArrayList<SapXep> a= new ArrayList<>();
        for (int i =0 ;i < n ;i++){
            String name = cs.nextLine();
            String ns = cs.nextLine();
            String lop = cs.nextLine();
            float gpa = Float.parseFloat(cs.nextLine());

            SapXep p = new SapXep(name , ns , lop , gpa);
            p.ChuanHoa();
            a.add(p);
        }
//        Collections.sort(a, new Comparator<SapXep>() {
//            @Override
//            public int compare(SapXep o1, SapXep o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
        //Collections.sort(a , (SapXep z , SapXep b) -> z.getGpa().compareTo(b.getGpa()));
        Collections.sort(a , new SortGPA());
        for (SapXep x : a){
            System.out.println(x);
        }
    }
}