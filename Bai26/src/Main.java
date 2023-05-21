import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = Integer.parseInt(cs.nextLine());
        ArrayList<NhanVien> v= new ArrayList<>();
        for (int i=0 ;i < n ;i++){
            String name = cs.nextLine();
            String gt = cs.nextLine();
            String ns = cs.nextLine();
            String dc = cs.nextLine();
            String mst = cs.nextLine();
            String nkhd = cs.nextLine();
            NhanVien a = new NhanVien(name , gt , ns , dc , mst , nkhd);
            a.chuanHoa();
            v.add(a);
        }
        Collections.sort(v , new SortByNS());
        for (NhanVien x : v){
            System.out.println(x);
        }
    }
}