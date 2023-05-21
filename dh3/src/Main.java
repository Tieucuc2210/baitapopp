import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        List<SinhVien> a = new ArrayList<>();
        List<SinhVien> b = new ArrayList<>();

        int n = Integer.parseInt(cs.nextLine());
        for (int i =0 ;i < n ;i++){
            String ma = cs.nextLine();
            if (ma.startsWith("SV")){
                String name = cs.nextLine();
                String ns = cs.nextLine();
                String dc = cs.nextLine();
                String lop = cs.nextLine();
                double gpa = Double.parseDouble(cs.nextLine());

                SinhVien x = new hocsinh(ma , name , ns , dc , lop , gpa);
                x.ChuanHoa();
                a.add(x);
            } else{
                String name = cs.nextLine();
                String ns = cs.nextLine();
                String dc = cs.nextLine();
                String khoa = cs.nextLine();
                String luong = cs.nextLine();

                SinhVien p = new giavien(ma , name , ns , dc , khoa , luong);
                p.ChuanHoa();
                b.add(p);
            }
        }
        System.out.println("DANH SACH SINH VIEN LA : ");
        for (SinhVien x : a){
            System.out.println(x);
        }
        System.out.println("DANH SACH GIAO VIEN LA : ");
        for (SinhVien x : b){
            System.out.println(x);
        }
    }
}