import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = Integer.parseInt(cs.nextLine());
        ArrayList<NV> a = new ArrayList<>();
        for(int i=0;i < n ;i++){
            String name = cs.nextLine();
            String gt = cs.nextLine();
            String ns = cs.nextLine();
            String dc = cs.nextLine();
            String mst = cs.nextLine();
            String nkhd  = cs.nextLine();
            NV p = new NV(name , gt , ns , dc , mst , nkhd);
            p.ChuanHoa();
            a.add(p);
        }
        for (NV x : a){
            System.out.println(x);
        }
    }
}