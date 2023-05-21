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

        NhanVien2 a = new NhanVien2("00001" , name , gt , ns , dc , mst , nkhd);
        a.chuanhoa();
        System.out.println(a);
    }
}