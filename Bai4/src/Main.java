import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String name = cs.nextLine();
        String gt = cs.nextLine();
        String ns = cs.nextLine();
        String dc = cs.nextLine();
        String mst = cs.nextLine();
        String nkhd = cs.nextLine();
        NhanVien a = new NhanVien("00001" , name , gt , ns , dc , mst , nkhd);
        System.out.println(a);
    }
}