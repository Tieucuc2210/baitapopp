import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = Integer.parseInt(cs.nextLine());
        List<giaovien> a= new ArrayList<>();
        List<hocsinh> b = new ArrayList<>();
        for (int i =0 ;i < n ;i++){
            String ma =cs.nextLine();
            if (ma.startsWith("SV")){
                String name = cs.nextLine();
                String ns = cs.nextLine();
                String dc = cs.nextLine();
                String lop = cs.nextLine();
                double gpa = cs.nextFloat();
                hocsinh z = new hocsinh(ma , name , ns , dc ,lop , gpa);
                z.ChuanHoa();
                b.add(z);

            } else{
                String name = cs.nextLine();
                String ns = cs.nextLine();
                String dc = cs.nextLine();
                String khoa = cs.nextLine();
                String luong = cs.nextLine();

                String lop = cs.nextLine();

                giaovien p = new giaovien(ma , name , ns , dc , khoa , luong , lop);
                p.ChuanHoa();
                a.add(p);
            }
        }
        String query = cs.nextLine();
        System.out.println("DANH SACSH GIAO VIEN : " + query + " : ");
        for (giaovien x : a){
            //if (x.getLop().equals(query)){
                System.out.println(x);
            //}
        }
        System.out.println("DANH SACH SINH VIEN " + query + " : ");
        for (hocsinh x : b){
            //if (x.layLop().equals(query)){
                System.out.println(x);
            //}
        }
    }
}