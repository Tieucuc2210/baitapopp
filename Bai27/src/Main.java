import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int n= Integer.parseInt(cs.nextLine());
        ArrayList<Game> v = new ArrayList<>();
        for (int i =0 ;i < n ;i++){
            String user = cs.nextLine();
            String pass = cs.nextLine();
            String Name = cs.nextLine();
            String di = cs.nextLine();
            String den = cs.nextLine();
            Game a = new Game(user , pass , Name , di , den);
            v.add(a);
        }
        Collections.sort(v , new SortByPhut());
        for (Game x : v){
            System.out.println(x);
        }
    }
}