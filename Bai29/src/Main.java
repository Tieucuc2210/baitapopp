import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = Integer.parseInt(cs.nextLine());
        ArrayList<SInhVien> v= new ArrayList<>();
        for (int i =0 ;i < n ;i++){
            String ma = cs.nextLine();
            String name = cs.nextLine();
            String lop = cs.nextLine();
            String email = cs.nextLine();
            v.add(new SInhVien(ma , name , lop , email));
        }
        Collections.sort(v , new SortByName());
        for (SInhVien x : v){
            System.out.println(x);
        }
    }
}