import java.util.*;
import java.util.function.DoubleUnaryOperator;

public class Main {
    public static void main(String[] args) {
        Scanner  cs = new Scanner(System.in);
        List<giaovien> a = new ArrayList<>();
        List<hocsinh> b = new ArrayList<>();
        int n = Integer.parseInt(cs.nextLine());
        for (int i =0 ; i < n ;i++){
            String ma = cs.nextLine();
            if(ma.startsWith("GV")){
                String name = cs.nextLine();
                String ns = cs.nextLine();
                String dc = cs.nextLine();
                String khoa = cs.nextLine();
                int luong = Integer.parseInt(cs.nextLine());

                giaovien z = new giaovien( ma , name , ns  , dc , khoa  ,luong);
                z.ChuanHoa();
                a.add(z);
            } else{
                String name = cs.nextLine();
                String ns = cs.nextLine();
                String dc = cs.nextLine();
                String lop = cs.nextLine();
                double gpa = Double.parseDouble(cs.nextLine());

                hocsinh m = new hocsinh(ma , name , ns , dc , lop , gpa);
                m.ChuanHoa();;
                b.add(m);

            }
        }
        System.out.println("DANH SACH GIAO VIEN : ");
        Collections.sort(a , new SortByLuong());
        for (giaovien x : a){
            System.out.println(x);
        }
        System.out.println("DANH SACH HOC SINH");
        Collections.sort(b , new SortByGpa());

        for (hocsinh x : b){
            System.out.println(x);
        }
    }
}