import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        List<Person> a= new ArrayList<>();
        List<Person> b = new ArrayList<>();
        int n = Integer.parseInt(cs.nextLine());
        for (int i =0 ;i < n ;i++){
            String ma = cs.nextLine();
            if (ma.startsWith("SV")){
                String name = cs.nextLine();
                String ns = cs.nextLine();
                String dc = cs.nextLine();
                String lop = cs.nextLine();
                double gpa = Double.parseDouble(cs.nextLine());
                Person z = new hocsinh(ma , name , ns , dc ,lop , gpa);
                z.ChuanHoa();
                a.add(z);
            } else {
                String name = cs.nextLine();
                String ns  = cs.nextLine();
                String dc = cs.nextLine();
                String khoa = cs.nextLine();

                int luong = Integer.parseInt(cs.nextLine());
                String lop = cs.nextLine();
                Person m = new giaovien(ma , name , ns , dc , khoa , luong , lop);
                m.ChuanHoa();
                b.add(m);
            }
        }
        String dc = cs.nextLine();
        System.out.println("DANH SACH GIAO VIEN CO DIA CHI " + dc + " : ");
        for (Person x : b){
            if (x.getDc().equals(dc)){
                System.out.println(x);
            }
        }
        System.out.println("DANH SACH SINH VIEN CO DIA CHi " + dc + " : ");
        for (Person x : a){
            if (x.getDc().equals(dc)){
                System.out.println(x);
            }
        }
    }

}