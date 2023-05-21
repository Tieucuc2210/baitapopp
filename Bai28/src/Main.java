import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n = Integer.parseInt(cs.nextLine());
        ArrayList<BangDiem> v = new ArrayList<>();
        for (int i =0 ;i < n ;i++){
            //cs.nextLine();
            String name = cs.nextLine();
            List<Double> p = new ArrayList<>();
            for (String s : cs.nextLine().split(" ")){
                try{
                    p.add(Double.parseDouble(s));
                } catch (NumberFormatException ex){
                    System.out.println("loi dinh dang" + ex.getMessage());
                }
            }
            BangDiem x = new BangDiem(name , p);
            v.add(x);

        }
        Collections.sort(v , new SortByGpa());
        for (BangDiem x : v){
            System.out.println(x);
        }
    }
}