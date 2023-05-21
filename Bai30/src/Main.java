import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        List<SInhVien> v= new ArrayList<>();
        for (int i =0 ;i < 4 ; i++){
            String ma = cs.nextLine();
            String name = cs.nextLine();
            String lop = cs.nextLine();
            String email = cs.nextLine();
            v.add(new SInhVien(ma , lop , name , email));
        }
        Collections.sort(v , (SInhVien o1 , SInhVien o2) -> o1.getMa().compareTo(o2.getMa()));
        for (SInhVien x : v){
            System.out.println(x);
        }
    }
}