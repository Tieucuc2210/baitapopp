import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String name = cs.nextLine();
        String ns  = cs.nextLine();
        float a = cs.nextFloat();
        float b = cs.nextFloat();
        float c = cs.nextFloat();
        SInhVien z = new SInhVien(name , ns , a , b , c);
        System.out.println(z);
    }
}