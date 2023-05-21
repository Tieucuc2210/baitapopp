import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs  = new Scanner(System.in);
        int n = Integer.parseInt(cs.nextLine());
        List<Person> v= new ArrayList<>();
        for (int i =0 ;i < n ;i++){
            String name = cs.nextLine();
            String ns = cs.nextLine();
            String dc = cs.nextLine();
            String lop = cs.nextLine();
            double gpa = Double.parseDouble(cs.nextLine());

            Person a = new Student(name , ns , dc , lop , gpa);
            a.ChuanHoa();
            v.add(a);
        }
        Collections.sort(v , new SortByName());
        for (Person x : v){
            System.out.println(x);
        }
    }
}