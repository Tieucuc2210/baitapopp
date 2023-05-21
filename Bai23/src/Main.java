import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n = cs.nextInt();
        cs.nextLine();
        ArrayList<Student2> a = new ArrayList<>();
        for (int i =0 ;i < n ;i++){
            String name =cs.nextLine();
            String lop = cs.nextLine();
            String ns = cs.nextLine();
            float gpa = cs.nextFloat();
            cs.nextLine();
            Student2 z = new Student2(name , lop , ns , gpa);
            z.chuanHoa();
            a.add(z);
        }
        for (Student2 x : a){
            System.out.println(x);
        }
    }
}