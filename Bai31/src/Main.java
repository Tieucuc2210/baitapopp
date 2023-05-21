import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = Integer.parseInt(cs.nextLine());
        ArrayList<sinhvien> v= new ArrayList<>();
        for (int i =0 ;i < n ;i++){
            String ma = cs.nextLine();
            String name = cs.nextLine();
            String lop = cs.nextLine();
            String email = cs.nextLine();

            sinhvien a= new sinhvien(ma , name , lop , email);
            a.ChuanHoa();
            v.add(a);
        }

        int x = Integer.parseInt(cs.nextLine());
        for (int i =0 ;i  < x ; i++){
            String s = cs.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP" + s + ":");
            for (sinhvien p : v){
                if (p.getLop().equals(s)){
                    System.out.println(p);
                }
            }
        }
    }
}