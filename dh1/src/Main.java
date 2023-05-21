import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = Integer.parseInt(cs.nextLine());
        List<kethua> v = new ArrayList<>();
        for (int i =0 ;i < n ;i++){
            String name = cs.nextLine();
            String s= cs.nextLine();
            String lop = cs.nextLine();
            double diem = Double.parseDouble(cs.nextLine());
            String ns = "" , diachi = "";
            for (char x : s.toCharArray()){
                if (Character.isDigit(x) || x == '/'){
                    ns += x;
                } else{
                    diachi += x;
                }
            }
            kethua p = new studen(name , ns , diachi , lop , diem);
            p.ChuanHoa();
            v.add(p);
        }
        for (kethua x  : v){
            System.out.println(x);
        }
    }
}