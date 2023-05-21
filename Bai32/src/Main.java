import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = Integer.parseInt(cs.nextLine());
        ArrayList<sinhvien> v= new ArrayList<>();
        for (int i =0 ;i < n ; i++){
            String ma = cs.nextLine();
            String name = cs.nextLine();
            String lop = cs.nextLine();
            String email = cs.nextLine();

            sinhvien a = new sinhvien(ma , name , lop , email);
            a.ChuanHoa();
            v.add(a);
        }
        int q = Integer.parseInt(cs.nextLine());
        for (int i=0 ;i < n ;i++){
            int p = cs.nextInt();
            System.out.println("DANH SACH SINH VIEN KHOA" + p + ":");
            for (sinhvien x : v){
                if (x.getMa() == p){
                    System.out.println(x);
                }
            }

        }
    }
}