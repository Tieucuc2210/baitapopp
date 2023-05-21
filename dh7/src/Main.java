import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        List<Poppp> a  = new ArrayList<>();
        List<Poppp> b = new ArrayList<>();
        int n = Integer.parseInt(cs.nextLine());
        for (int i = 0 ; i<n ;i++){
            String ma = cs.nextLine();
            if (ma.startsWith("OT")){
                String name = cs.nextLine();
                String ten = cs.nextLine();
                String hang = cs.nextLine();
                int maluc = Integer.parseInt(cs.nextLine());
                int giaban = Integer.parseInt(cs.nextLine());

                Poppp z = new Oto(ma , name , ten , hang , maluc , giaban);
                a.add(z);
            } else{
                String name = cs.nextLine();
                String ten = cs.nextLine();
                String hang = cs.nextLine();
                int giaban = Integer.parseInt(cs.nextLine());
                int giamua = Integer.parseInt(cs.nextLine());

                Poppp m = new XeMay(ma , name , ten , hang , giaban , giamua);
                b.add(m);
            }

        }
        String name = cs.nextLine();
        System.out.println("DANH SACH OTO " + name + " : ");
        for (Poppp x : a){
            if (x.getTen().equals(name)){
                System.out.println(x);
            }
        }

    }
}