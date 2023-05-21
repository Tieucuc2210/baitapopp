import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);
        int n =cs.nextInt();
        cs.nextLine();
        ArrayList<Student1> a = new ArrayList<>();
        for (int i =0 ;i < n ;i++){
            //System.out.println(i +1 + ":");
            String name = cs.nextLine();
            String lop = cs.nextLine();
            String ns = cs.nextLine();
            float gpa = cs.nextFloat();
            cs.nextLine();
            a.add(new Student1( name , lop , ns , gpa));
        }
        for (Student1 x : a){
            System.out.println(x);
        }

    }
}